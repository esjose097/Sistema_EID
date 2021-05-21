/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportesNegocio;

import java.time.LocalDate;
import java.util.Date;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author eliu
 */
public interface IReportes {
    public JasperPrint ReporteMateriaPrima(Date desde,Date hasta,String tipo);
    //public JasperPrint GenerarReporte(Rango rango,String Tipo,String Materia);
}
