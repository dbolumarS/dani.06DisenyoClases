package _3ejercicios._04pasajeros;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicio extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().
				getResource("/_3ejercicios/_04pasajeros/view/FXMLViaje.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vuelo");
		primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
