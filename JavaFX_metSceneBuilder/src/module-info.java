module JavaFX_metSceneBuilder {
	exports main;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens main to javafx.graphics, javafx.fxml;
}