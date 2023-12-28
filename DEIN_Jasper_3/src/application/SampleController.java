package application;

import jasper.Creador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    void accion1(ActionEvent event) {
    	Creador.crearInforme("/Invoice1.jasper");
    }

    @FXML
    void accion2(ActionEvent event) {
    	Creador.crearInforme("/secciones.jasper");
    }

    @FXML
    void accion3(ActionEvent event) {
    	Creador.crearInforme("/tabula.jasper");
    }

    @FXML
    void accion4(ActionEvent event) {
    	Creador.crearInforme("/graficos.jasper");
    }

}

