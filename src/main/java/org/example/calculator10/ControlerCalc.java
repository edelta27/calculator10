package org.example.calculator10;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControlerCalc  {
    @FXML
    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button point;
    public Button clear;
    public Button addition;
    public Button subtraction;
    public Button multiplication;
    public Button division;
    public TextField input;
    public Label prom;

    private long fnumber;
    private long snumber;
    private String operation;


    public void initialize() {

    }

    public void point_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue + set);
    }


    public void zero_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue + set);
    }
    public void one_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue + set);
    }
    public void two_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue + set);
    }
    public void three_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue + set);
    }
    public void four_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue + set);
    }
    public void five_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue + set);
    }
    public void six_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue + set);
    }
    public void seven_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue + set);
    }
    public void eight_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue + set);
    }
    public void nine_click(ActionEvent event){
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue + set);
    }
    public void clear_click(ActionEvent event){
        input.setText("");
        prom.setText("");
        this.fnumber = 0;
        this.snumber = 0;
    }
    public void addition_click(ActionEvent event){
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "+");
        operation = "+";
    }
    public void subtraction_click(ActionEvent event){
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "-");
        operation = "-";
    }
    public void multiplication_click(ActionEvent event){
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "*");
        operation = "*";
    }
    public void division_click(ActionEvent event){
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "/");
        operation = "/";

    }
    public void equal_click(ActionEvent event) {
        switch (operation) {
            case "+" -> {
                String value = input.getText();
                this.snumber = Integer.parseInt(value);
                long system = this.fnumber + this.snumber;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText(oldprom + value);
            }
            case "-" -> {
                String valuekam = input.getText();
                this.snumber = Integer.parseInt(valuekam);
                long systemkam = this.fnumber - this.snumber;
                input.setText(String.valueOf(systemkam));
                String oldpromkam = prom.getText();
                prom.setText(oldpromkam + valuekam);
            }
            case "*" -> {
                String valuej = input.getText();
                this.snumber = Integer.parseInt(valuej);
                long systemj = this.fnumber * this.snumber;
                input.setText(String.valueOf(systemj));
                String oldpromj = prom.getText();
                prom.setText(oldpromj + valuej);
            }
            case "/" -> {
                String valued = input.getText();
                this.snumber = Integer.parseInt(valued);
                long systemd = this.fnumber / this.snumber;
                input.setText(String.valueOf(systemd));
                String oldpromd = prom.getText();
                prom.setText(oldpromd + valued);
            }
        }

    }
}

