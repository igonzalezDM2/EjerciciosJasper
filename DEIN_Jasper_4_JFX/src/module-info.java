module DEIN_Jasper_4_JFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires jasperreports;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
}
