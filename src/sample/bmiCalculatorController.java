package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.math.BigDecimal;
public class bmiCalculatorController {
    private double weight;
    private double height;
    @FXML
    private Label wLabel;
    @FXML
    private Label hLabel;
    @FXML
    private TextField wTextField;
    @FXML
    private TextField hTextField;
    @FXML
    private Button metricUnitsButton;
    @FXML
    private Button englishUnitsButton;
    @FXML
    private TextField answerTextField;
    @FXML
    void lbButtonPressed(ActionEvent event) {
        try{
            weight = Double.parseDouble(wTextField.getText());
            height = Double.parseDouble(hTextField.getText());
            double value = 703 * (weight/Math.pow(height,2));
            String input_string = "";
            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                input_string = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                input_string = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                input_string = "Overweight";
            }
            else{
                input_string = "Obese";
            }
            answerTextField.setText(input_string);
        }
        catch (NumberFormatException ex){
            wTextField.setText("Enter Weight");
            hTextField.setText("Enter Height");
            wTextField.selectAll();
            wTextField.requestFocus();
        }
    }
    @FXML
    void mtButtonPressed(ActionEvent event) {
        try{
            weight = Double.parseDouble(wTextField.getText());
            height = Double.parseDouble(hTextField.getText());
            double value = (weight/Math.pow(height,2));
            String input_string = "";
            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                input_string = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                input_string = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                input_string = "Overweight";
            }
            else{
                input_string = "Obese";
            }
            answerTextField.setText(input_string);
        }
        catch (NumberFormatException ex){
            wTextField.setText("Enter Weight");
            hTextField.setText("Enter Height");
            wTextField.selectAll();
            wTextField.requestFocus();
        }
    }
}