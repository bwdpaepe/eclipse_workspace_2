package gui;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import domein.EenvoudigeZin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ZinScherm extends VBox
{
    private EenvoudigeZin ez;
    
    public ZinScherm() 
    {
        buildGui();
    }

    private void buildGui()
    {  
        Label lblZin = new Label("Geef een zin: ");
        TextField txfZin = new TextField();
        Label lblAantalLetters = new Label("Geef het aantal letters:");
        TextField txfAantalLetters = new TextField();
        Button btnZoek = new Button("Zoek woorden");
        Label lblOverzicht = new Label("De gevonden woorden zijn:");
        TextArea txaOverzicht = new TextArea();
        Label lblFoutMelding = new Label();
        lblFoutMelding.setFont(Font.font(18));
        
        this.getChildren().addAll(lblZin,txfZin,lblAantalLetters,txfAantalLetters,btnZoek, lblOverzicht,txaOverzicht,lblFoutMelding);
        
        setPadding(new Insets(25));
        
        // TO DO: vraag 3: event-afhandeling op btnZoek
        btnZoek.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(txfZin.getText().isEmpty()) {
					lblFoutMelding.setText("Geef eerst een eenvoudige zin!");
				}
				if(!txfAantalLetters.getText().matches("\\d")) {
					lblFoutMelding.setText("Geef een geheel aantal in voor het aantal letters");
				}
				else {
					try {
						ez = new EenvoudigeZin(txfAantalLetters.getText());
					}
					catch(IllegalArgumentException e) {
						lblFoutMelding.setText("Dit is geen eenvoudige zin.");
					}
				}
				
			}
        	
        });
        
    }
    
    private String maakOverzichtWoorden(List<String> woorden)
    {
    	String overzicht="";
    	
    	woorden.stream()
    		   .sorted(String.CASE_INSENSITIVE_ORDER)
    		   .collect(Collectors.toList());
    	
    	for (String woord : woorden){
            overzicht += String.format("%s%n", woord);
        }
    	
        return overzicht;
    }
  
}
