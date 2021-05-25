/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportesNegocio;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Comunidad del anillo
 */
public class ReportesMPNegocio implements IReportesMP {

    private static String CADENA_CONEXION = "jdbc:mysql://localhost:3306/tortilleria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String USUARIO = "root";
    private static String CONTRASENIA = "1234";

    private Connection getConexion() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASENIA);
            return conexion;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public JasperPrint ReporteMP_Periodo(Date desde, Date hasta, String tipo) {
        JasperReport reporte = null;
        JasperPrint jprint = null;
        HashMap<String, Object> params;
        String path = "src/ReportesPlantillas/reportePeriodo.jasper";

        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            params = new HashMap<>();
            params.put("desde", desde);
            params.put("hasta", hasta);
            params.put("tipo", tipo);

            jprint = JasperFillManager.fillReport(path, params, getConexion());

        } catch (SQLException | JRException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return jprint;
    }

    @Override
    public JasperPrint ReporteMP_Rango(Rango rango, String tipo) {
        JasperReport reporte = null;
        JasperPrint jprint = null;
        HashMap<String, Object> params;
        String path = "src/ReportesPlantillas/reporteRango.jasper";
        
        LocalDate hoy = LocalDate.now();
        LocalDate rang = null;
        ZoneId defaultZoneId = ZoneId.systemDefault();
        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        
        switch (rango) {
            case HOY:
                rang = LocalDate.now();
                break;
            case AYER:
                rang = LocalDate.now().minusDays(1);
                break;
            case UNA_SEMANA:
                rang = LocalDate.now().minusWeeks(1);
                break;
            case UN_MES:
                rang = LocalDate.now().minusMonths(1);
                break;
        }
        Date desde = Date.from(rang.atStartOfDay(defaultZoneId).toInstant());
        Date hasta = Date.from(hoy.atStartOfDay(defaultZoneId).toInstant());
        //System.getProperty("user.dir").concat("\\src\\ReportesPlantillas\\reporteRango.jasper")
       try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            params = new HashMap<>();
            params.put("desde", desde);
            params.put("hasta", hasta);
            params.put("tipo", tipo);

            jprint = JasperFillManager.fillReport(path, params, getConexion());

        } catch (SQLException | JRException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return jprint;
    }
}
