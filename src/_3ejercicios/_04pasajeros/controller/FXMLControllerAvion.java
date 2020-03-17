package _3ejercicios._04pasajeros.controller;

import java.net.URL;
import java.util.ResourceBundle;

import _02_ejemplos.tiempo.Tiempo;
import _3ejercicios._04pasajeros.Vuelo;
import _3ejercicios._04pasajeros.pasajero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLControllerAvion {
	
	private Vuelo v;
	
	public FXMLControllerAvion(){
		v = new Vuelo("IB3487", "VAL", "MAD", new Tiempo(10, 0, 0), new Tiempo(12, 0, 0), 50);

		
		v.reservarAsiento("Andres", "38743938");
		v.reservarAsiento("Adrian", "38743937");
		v.reservarAsiento("Antonio", "38743936");
		v.reservarAsiento("Aurelio", "38743935");
		v.reservarAsiento("Amador", "38743934");
		v.reservarAsiento("Julian", "38743933");
		v.reservarAsiento("Esmeregildo", "38743932");
		v.reservarAsiento("Coco", "38743931");
		v.reservarAsiento("melon", "38743930");
		v.reservarAsiento("Sangria", "38742407");
		
		v.reservarAsiento("Vicente", "17727277", 'V');
		v.reservarAsiento("Victor", "17727276", 'V');
		v.reservarAsiento("Victoria", "17727275", 'V');
		
		v.reservarAsiento("Paco", "17727274", 'P');
		v.reservarAsiento("Pilar", "17727273", 'P');
	}	

	
    @FXML
    private TextField txtId;

    @FXML
    private TextField txtSalida;

    @FXML
    private TextField txtLlegada;

    @FXML
    private TextField txtOrigen;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtDni;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btm1;

    @FXML
    private Button btm5;

    @FXML
    private Button btm9;

    @FXML
    private Button btm13;

    @FXML
    private Button btm17;

    @FXML
    private Button btm2;

    @FXML
    private Button btm6;

    @FXML
    private Button btm10;

    @FXML
    private Button btm14;

    @FXML
    private Button btm18;

    @FXML
    private Button btm4;

    @FXML
    private Button btm8;

    @FXML
    private Button btm12;

    @FXML
    private Button btm16;

    @FXML
    private Button btm20;

    @FXML
    private Button btm3;

    @FXML
    private Button btm7;

    @FXML
    private Button btm11;

    @FXML
    private Button btm15;

    @FXML
    private Button btm19;

    @FXML
    void onActionPasajero(ActionEvent event) {
     Button btn = (Button) event.getSource();
     int asiento = Integer.parseInt(btn.getId());
     mostrarInfoPasajero(asiento);
     mostrarInfoVuelo();
     mostrarInfoVuelo();
    }
    
    private void mostrarInfoVuelo(){
    	txtId.setText(v.getId());
		txtSalida.setText(v.getHoraS().toString());
		txtLlegada.setText(v.getHoraL().toString());
		txtOrigen.setText(v.getOrigen());
		txtDestino.setText(v.getDestino());
    }
    
    
    
    public void mostrarInfoPasajero (int asiento){
    	pasajero p = v.getPasaje()[asiento];
    	if (p == null){
    		txtDni.setText(" ");
    		txtNombre.setText(" ");
    	} else {
    		txtDni.setText(p.getDni());
    		txtNombre.setText(p.getNombre());
    	}
    }
}
