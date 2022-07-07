package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

public class KlasseDieOpComboBoxReageert implements EventHandler<ActionEvent> {

	private final ComboBox<String> cboTitels;
    private final BeheersKostenScherm bks;
    
    public KlasseDieOpComboBoxReageert(ComboBox<String> cboTitels, BeheersKostenScherm bks)
    {
        this.cboTitels = cboTitels;
        this.bks = bks;
    }
    
    @Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
    	int gekozenIndex = cboTitels.getSelectionModel().getSelectedIndex();
        bks.update(gekozenIndex);
		
	}

}
