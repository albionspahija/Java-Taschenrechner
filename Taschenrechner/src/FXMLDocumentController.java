/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author albio
 */
public class FXMLDocumentController implements Initializable {

    private Rechner rechner = new Rechner();

    double firstNumber = 0.0;
    double secondNumber = 0.0;
    int operation = -1;

    @FXML
    private Label labelTitel;
    @FXML
    private TextField textfield;
    @FXML
    private Button button1;
    @FXML
    private Button button7;
    @FXML
    private Button button3;
    @FXML
    private Button button2;
    @FXML
    private Button button6;
    @FXML
    private Button button9;
    @FXML
    private Button button5;
    @FXML
    private Button button8;
    @FXML
    private Button button4;
    @FXML
    private Button button0;
    @FXML
    private Button buttonClear;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonEquals;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        //Zahlen und Clear
        if (event.getSource() == button0) {
            textfield.setText(textfield.getText() + "0");
        }
        if (event.getSource() == button1) {
            textfield.setText(textfield.getText() + "1");
        }
        if (event.getSource() == button2) {
            textfield.setText(textfield.getText() + "2");
        }
        if (event.getSource() == button3) {
            textfield.setText(textfield.getText() + "3");
        }
        if (event.getSource() == button4) {
            textfield.setText(textfield.getText() + "4");
        }
        if (event.getSource() == button5) {
            textfield.setText(textfield.getText() + "5");
        }
        if (event.getSource() == button6) {
            textfield.setText(textfield.getText() + "6");
        }
        if (event.getSource() == button7) {
            textfield.setText(textfield.getText() + "7");
        }
        if (event.getSource() == button8) {
            textfield.setText(textfield.getText() + "8");
        }
        if (event.getSource() == button9) {
            textfield.setText(textfield.getText() + "9");
        }
        if (event.getSource() == buttonClear) {
            textfield.setText("");
        }

        //Operationen
        if (event.getSource() == buttonPlus) {
            firstNumber = Double.parseDouble(textfield.getText());
            operation = 1; //Addition
            textfield.setText("");
        }
        if (event.getSource() == buttonMinus) {
            firstNumber = Double.parseDouble(textfield.getText());
            operation = 2; //Substrcation
            textfield.setText("");
        }
        if (event.getSource() == buttonMultiply) {
            firstNumber = Double.parseDouble(textfield.getText());
            operation = 3; //Multiplication
            textfield.setText("");
        }
        if (event.getSource() == buttonDivide) {
            firstNumber = Double.parseDouble(textfield.getText());
            operation = 4; //Division
            textfield.setText("");
        }

        //Equals
        if (event.getSource() == buttonEquals) {
            double answer = 0.0;
            secondNumber = Double.parseDouble(textfield.getText());
            
            switch (operation) {
                case 1: //Addition
                    try {
                        answer = rechner.addition(firstNumber, secondNumber);
                    } catch (Exception e) {
                        textfield.setText("Error");
                    }
                    textfield.setText(String.valueOf(answer));
                    break;
                case 2: //Substraction
                    try {
                        answer = firstNumber - secondNumber;
                    } catch (Exception e) {
                        textfield.setText("Error");
                    }
                    textfield.setText(String.valueOf(answer));
                    break;
                case 3: //Multiplication
                    try {
                        answer = firstNumber * secondNumber;
                    } catch (Exception e) {
                        textfield.setText("Error");
                    }
                    textfield.setText(String.valueOf(answer));
                    break;
                case 4: //Division
                    try {
                        answer = firstNumber / secondNumber;
                    } catch (Exception e) {
                        textfield.setText("Error");
                    }
                    textfield.setText(String.valueOf(answer));
                    break;
            }
        }

    }

}
