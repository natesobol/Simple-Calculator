// Programmer: Nate Sobol
// Title: Investment Calculator
// Last Modified: 4/10/2016

package simple.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class simpleCalculator extends Application {
    private final TextField number1 = new TextField();
    private final TextField number2 = new TextField();
    private final TextField total = new TextField();
    private final Button add = new Button("add");
    private final Button sub = new Button("subtract");
    private final Button mult = new Button("multiply");
    private final Button div = new Button("divide");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
      // UI
      GridPane gridPane = new GridPane();
      gridPane.setHgap(5);
      gridPane.setVgap(5);

      // Labels
      gridPane.add(new Label("Number 1:"), 0, 1);
      gridPane.add(new Label("Number 2:"), 0, 2);
      gridPane.add(new Label("Total:"), 6, 1);

      // Text Fields
      gridPane.add(number1, 1, 1);
      gridPane.add(number2, 1, 2);
      gridPane.add(total, 7, 1);

      // Buttons
      gridPane.add(add, 2, 5);
      gridPane.add(sub, 3, 5);
      gridPane.add(mult, 4, 5);
      gridPane.add(div, 5, 5);

      // Call functions
      add.setOnAction(e -> calcAdd());
      sub.setOnAction(e -> calcSub());
      mult.setOnAction(e -> calcMult());
      div.setOnAction(e -> calcDiv());


      // Creates background
      
      Scene scene = new Scene(gridPane, 622, 110 );
      
      primaryStage.setTitle("Simple Calculator");
      primaryStage.setScene(scene);
      primaryStage.show();

    }

    // Adds
    public void calcAdd(){
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double answer = num1 + num2;
        total.setText(Double.toString(answer));
    }
  
    // Subtracts
     public void calcSub(){
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double answer = num1 - num2;
        total.setText(Double.toString(answer));
    }

    public void calcMult(){
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double answer = num1 * num2;
        total.setText(Double.toString(answer));
    }

    // Divides
     public void calcDiv(){
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double answer = num1 / num2;
        total.setText(Double.toString(answer));
    }

    public static void main(String[] args) {
      launch(args);
    }
  }