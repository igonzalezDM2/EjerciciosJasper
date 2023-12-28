package application;

import jasper.Informe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SampleController {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private RadioButton rbInformePersonas;

    @FXML
    private RadioButton rbInformePersonasConCalculos;

    @FXML
    private RadioButton rbInformePersonasConSubinformes;

    @FXML
    private ToggleGroup tgInforme;

    @FXML
    void aceptar(ActionEvent event) {
    	
    	final RadioButton seleccionado = (RadioButton) tgInforme.getSelectedToggle();
    	
    	if (seleccionado != null) {    		
    		if (seleccionado.equals(rbInformePersonas)) {
    			Informe.crearInforme("/agenda.jasper");
    		} else if (seleccionado.equals(rbInformePersonasConCalculos)) {
    			Informe.crearInforme("/agenda2.jasper");
    		} else if (seleccionado.equals(rbInformePersonasConSubinformes)) {
    			Informe.crearInforme("/agenda3.jasper");
    		}
    	}
    	
    	
    }

    @FXML
    void cancelar(ActionEvent event) {
    	((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }

}
