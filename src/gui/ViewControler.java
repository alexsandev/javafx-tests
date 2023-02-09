package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewControler {
    
    @FXML
    private Label label1;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    public void clicarNoBotao(){
        try{
            double sum = Double.parseDouble(textField1.getText()) + Double.parseDouble(textField2.getText());
            label3.setText(String.format( "%.2f", sum));
        }catch (RuntimeException e){
            Alerts.showAlert("Error", "error in input values", e.getMessage(), AlertType.ERROR);
        }
        
    }
}
