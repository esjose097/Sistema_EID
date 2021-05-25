/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import ReportesNegocio.IReportesMP;
import ReportesNegocio.Rango;
import java.util.Date;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Comunidad del anillo
 */
public interface IReportes{
    public JasperPrint Get_ReporteMP_Periodo(Date desde, Date hasta, String tipo);
    public JasperPrint Get_ReporteMP_Rango(Rango rango, String tipo);
}
