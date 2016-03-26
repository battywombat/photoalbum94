package photoalbum.controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login extends Application {
	
	@FXML
	Button LoginLoginButton;
	
	@FXML 
	Button LoginCloseButton;
	
	@FXML 
	TextField LoginField;
	
	ArrayList<String> users;
	
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/login.fxml"));
		Pane root;
		try {
			root = (Pane)loader.load();	
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Photo Album"); 
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	@FXML
	public void CloseClicked() {
		System.out.println("Closing...");
		Platform.exit();
	}
	
	@FXML
	public void LoginClicked() {
//		String login = LoginField.getText().trim();
//		System.out.println(login);
		
	}
}
