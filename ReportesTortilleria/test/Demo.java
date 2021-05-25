
import ReportesNegocio.ReportesMPNegocio;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import ReportesNegocio.IReportesMP;
import ReportesNegocio.Rango;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliu
 */
public class Demo {
    public static void main(String[] args) {
        IReportesMP reportes = new ReportesMPNegocio();
        

        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
     
        
        JasperPrint print= reportes.ReporteMP_Rango(Rango.UN_MES, "Entrada");
       
        JasperViewer.viewReport(print,true);
        
        
   
        
    }
}
