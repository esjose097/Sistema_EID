/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ReportesNegocio.IReportesMP;
import ReportesNegocio.Rango;
import ReportesNegocio.ReportesMPNegocio;
import interfaces.IReportes;
import java.util.Date;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Comunidad del anillo
 */
public class ControlReportes implements IReportes {

    IReportesMP reportes = new ReportesMPNegocio();

    @Override
    public JasperPrint Get_ReporteMP_Periodo(Date desde, Date hasta, String tipo) {
        return reportes.ReporteMP_Periodo(desde, hasta, tipo);
    }

    @Override
    public JasperPrint Get_ReporteMP_Rango(Rango rango, String tipo) {
        return reportes.ReporteMP_Rango(rango, tipo);
    }

    

}
