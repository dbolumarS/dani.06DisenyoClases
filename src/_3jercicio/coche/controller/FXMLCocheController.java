package _3jercicio.coche.controller;

import _3jercicio.coche.model.Coche;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLCocheController {

    @FXML
    private Button btnArrancar;

    @FXML
    private Button btnApagar;

    @FXML
    private Label lblEncendido;

    @FXML
    private Button btnAcelerar;

    @FXML
    private Button btnFrenar;

    @FXML
    private Label lblVelocidad;

    @FXML
    private Label lblRevoluciones;

    @FXML
    private Button btnSubirMarcha;

    @FXML
    private Button btnBajarMarcha;

    @FXML
    private Label lblMarcha;
    
    //Atributos
    Coche c;
    public FXMLCocheController(){
    	c = new Coche(150, 60000);
    }
    
    public void cocheAFormulario(){
    	lblVelocidad.setText("" + c.getVelocidadActual());
    	lblRevoluciones.setText(String.valueOf(c.getRpmActual()));
    	lblMarcha.setText("" + c.getMarcha());
    	if(c.isEnMarcha()){
    		lblEncendido.setText("ON");
    	}else {
    		lblEncendido.setText("OFF");
    	}
    	
    	
    }
    

    @FXML
    void OnActionAcelerar(ActionEvent event) {
    	c.acelerar(10);
    	cocheAFormulario();
    	
    	
    }

    @FXML
    void OnActionApagar(ActionEvent event) {
    	c.apagar();
    	cocheAFormulario();
    }

    @FXML
    void OnActionArrancar(ActionEvent event) {
    	c.arrancar();
    	cocheAFormulario();
    }

    @FXML
    void OnActionBajarMarcha(ActionEvent event) {
    	c.bajarMarcha();
    	cocheAFormulario();
    }

    @FXML
    void OnActionFrenar(ActionEvent event) {
    	c.frenar(10);
    	cocheAFormulario();
    }

    @FXML
    void OnActionSubirMarcha(ActionEvent event) {
    	c.subirMarcha();
    	cocheAFormulario();
    }

}
