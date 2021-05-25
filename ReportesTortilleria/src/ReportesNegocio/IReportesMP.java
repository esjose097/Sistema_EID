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
public interface IReportesMP {
    public JasperPrint ReporteMP_Periodo(Date desde,Date hasta,String tipo);
    public JasperPrint ReporteMP_Rango(Rango rango, String tipo);
}
