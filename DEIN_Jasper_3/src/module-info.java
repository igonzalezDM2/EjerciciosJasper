module DEIN_Jasper_3 {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.media;
	requires javafx.graphics;
	requires jasperreports;
	requires java.sql;
	opens application to javafx.graphics, javafx.fxml, jasperreports;
}
