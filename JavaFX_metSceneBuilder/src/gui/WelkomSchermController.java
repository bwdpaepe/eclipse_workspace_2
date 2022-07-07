package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class WelkomSchermController extends VBox{
	@FXML
	private Label label;
	@FXML
	private ImageView image;
	public WelkomSchermController() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("WelkomScherm.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		try {
			loader.load();
		}
		catch(IOException ex) {
			throw new RuntimeException(ex);
		}
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
