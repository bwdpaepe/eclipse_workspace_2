package main;
	
import gui.ZinScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StartUp extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		ZinScherm root = new ZinScherm();
        Scene scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Woorden en letters...");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
