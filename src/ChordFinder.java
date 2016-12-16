import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChordFinder extends Application {

	public void start(Stage stage) throws Exception {
		//Load FXML
		Parent parent = FXMLLoader.load(
				getClass().getResource("ChordScene.fxml"));
	
		//Build Scene
		Scene scene = new Scene(parent);
		
		//Display window
		stage.setTitle("Chord Finder");
		stage.setScene(scene);
		stage.show();
	
	}
	
	public static void main(String[] args) {
		//Launch application
		launch(args);
	}

}
