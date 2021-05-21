
import ReportesNegocio.IReportes;
import ReportesNegocio.ReportesNegocio;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

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
        IReportes reportes = new ReportesNegocio();
        

        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        
        Calendar c = new GregorianCalendar(2021,03, 15);
        Calendar x = new GregorianCalendar(2021,03, 18);
        
        
        
        Date desde = c.getTime();
        Date hasta = x.getTime();
        
        System.out.println(sdf.format(desde));
        System.out.println(sdf.format(hasta));
        
        JasperPrint print= reportes.ReporteMateriaPrima(desde, hasta, "Entrada");
       
        JasperViewer.viewReport(print,true);
        
        
   
        
    }
}
