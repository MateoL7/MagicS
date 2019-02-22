package userInterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import model.MagicS;

/**
 * @author Mateo Loaiza
 * @version: 2/19/2019
 * Class MagicSController
 */
public class MagicSController {

	@FXML
	private BorderPane pane;

	@FXML
	private Button magicButton;

	@FXML
	private ComboBox<?> locationBox;

	@FXML
	private ComboBox<?> orientationBox;

	@FXML
	private String TOP;

	@FXML
	private String RIGHT;

	@FXML
	private String DOWN;

	@FXML
	private String LEFT;

	@FXML
	private String NO;

	@FXML
	private String NE;

	@FXML
	private String SO;

	@FXML
	private String SE;

	@FXML
	private TextField txtsize;
	
	private MagicS square;

	/**
	 * This method is triggered once the button on the interface is pressed, it
	 * generates the square and calls the method to fill it too
	 * 
	 * @param event
	 */
	public void buildSquare(ActionEvent event) {
		GridPane gpane = new GridPane();
		gpane.setVgap(40);
		gpane.setHgap(40);
		int pMode = Integer.parseInt(txtsize.getText());
		square = new MagicS(pMode);
		String pLocation = (String) locationBox.getValue();
		String pOrientation = (String) orientationBox.getValue();
		square.fillSquare(pMode, pLocation, pOrientation);
		int[][] squareMatrix = square.getSquare();
		for(int i = 0; i < pMode; i++) {
			for(int j = 0; j < pMode; j++) {
				Label lb = new Label("" + squareMatrix[i][j]);
    			gpane.add(lb, j, i);
			}
		}
		pane.setCenter(gpane);
		gpane.setAlignment(Pos.BASELINE_CENTER);

	}

}
