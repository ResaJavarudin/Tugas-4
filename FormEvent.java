/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LAB C
 */
public class FormEvent extends Application {
    
    @Override
    public void start(Stage stage) {
        Text t1 = new Text("Plus");
        Text t2 = new Text("Minus");
        Text t3 = new Text("Time");
        Text t4 = new Text("For")
        
        TextField tf1 = new TextField();
        TextFiled tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new Textfield();
        
        Button b1 = new Button("Equal To"); 
        
         b1.setOnAction(value -> {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
        });
        
        b2.setOnAction((ActionEvent event) -> {
            Label l1= new Label("The Numbers Have Been Calculated");
            
            StackPane scene2 = new StackPane();
            scene2.getChildren().add(l1);
            
            Scene s2 = new Scene (scene2, 320,100);
            
            Stage window2 = new Stage();
            window2.setTitle("Thank You For Calculate");
            window2.setScene(s2);
            
            window2.setX(515);
            window2.setY(250);
            
            window2.show();
            
            });

        GridPane gp = new GridPane();
        gp.setMinSize(350, 250);
        gp.setVgap(5);
        gp.setHgap(5);
        gp.setAlignment(Pos.CENTER);
        
        gp.add(t1, 0);
        gp.add(tf1, 1);
        gp.add(t2, 2);
        gp.add(tf2, 3);
        gp.add(t3, 4);
        gp.add(tf3, 5);
        gp.add(t4, 6);
        gp.add(tf4, 7);
        gp.add(b1, 8);
        gp.add(b, 9);
        
        Scene scene = new Scene(gp);
        
        stage.setTitle("Calculate Your Number");
        stage.setScene(scene);
        stage.show();

    public static void main(String[] args) {
        launch(args);
    }
    
}
