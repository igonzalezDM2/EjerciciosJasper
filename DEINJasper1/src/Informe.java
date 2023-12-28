import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class Informe {
	public static void main(String[] args) {
	    try {
	    	InputStream template = Informe.class
	    		    .getResourceAsStream("naciones.jrxml");
	    	
	    	JasperReport report = JasperCompileManager.compileReport(template);
	    	
	    	
	        // Parameters for report
	        Map<String, Object> parameters = new HashMap<String, Object>();
	        
	        Class.forName("org.mariadb.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/paises", "root", "root");
	        JasperPrint print = JasperFillManager.fillReport(report, parameters, con);
	    	
//	    	File pdf = File.createTempFile("output.", ".pdf");
	    	File pdf = new File("/home/jiraiya/reportepuntopdf.pdf");
	    	JasperExportManager.exportReportToPdfStream(print, new FileOutputStream(pdf));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
}
