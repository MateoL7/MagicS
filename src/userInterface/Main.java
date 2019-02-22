package userInterface;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/** 
*@author: Mateo Loaiza
*@version: 2/19/2019
*Class Main
*/
public class Main extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MagicS.fxml"));
		
		Scene scene = new Scene(root);
		stage.setTitle("MagicS");
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}