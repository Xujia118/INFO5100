package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private TextField input_field_1;

    @FXML
    private TextField input_field_2;

    @FXML
    private Button plusBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button multiBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button calculateBtn;

    @FXML
    private Label operate_label;

    @FXML
    private Label result;

    private char operation;
    private int num1;
    private int num2;

    @FXML
    void getFirstNum(KeyEvent event) {
        String inputText = input_field_1.getText();
        num1 = Integer.parseInt(inputText);
    }

    @FXML
    void getSecondNum(KeyEvent event) {
        String inputText = input_field_2.getText();
        num2 = Integer.parseInt(inputText);
    }

    @FXML
    void addBtnClicked(ActionEvent event) {
        operation = '+';
        operate_label.setText(String.valueOf(operation));
        calculate();
    }

    @FXML
    void subtractBtnClicked(ActionEvent event) {
        operation = '-';
        operate_label.setText(String.valueOf(operation));
        calculate();
    }

    @FXML
    void multiBtnClicked(ActionEvent event) {
        operation = '*';
        operate_label.setText(String.valueOf(operation));
        calculate();
    }

    @FXML
    void divideBtnClicked(ActionEvent event) {
        operation = '/';
        operate_label.setText(String.valueOf(operation));
        calculate();
    }

    @FXML
    void calculateBtnClicked(ActionEvent event) {
        double calculateResult = calculate();
        result.setText(String.valueOf(calculateResult));
    }

    double calculate() {
        double result = 0.0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = (double) num1 / num2;
            } else {
                throw new ArithmeticException("Cannot divide by zero.");
            }
        }
        return result;
    }

}
