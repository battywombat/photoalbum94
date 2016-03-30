package photoalbum;

import java.io.IOException;
import java.util.HashMap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import photoalbum.controller.AlbumController;
import photoalbum.model.User;

public class PhotoAlbum extends Application {
	
	private HashMap<String, User> users;

	public static void main(String[] args)  {
		launch(args);
	}
	
	public User getUser(String username) {
		return users.get(username);
	}
	
	@Override
	public void start(Stage primaryStage) {
		switchScene(primaryStage, "login");
	}
	
	public void switchScene(Stage primaryStage, String fxmlFile) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/"+fxmlFile+".fxml"));
		Pane root;
		try {
			root = (Pane)loader.load();	
			System.out.println("Loaded!");
			AlbumController controller = loader.getController();
			controller.setApp(this);
			controller.init();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Photo Album"); // could change title of window?
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
