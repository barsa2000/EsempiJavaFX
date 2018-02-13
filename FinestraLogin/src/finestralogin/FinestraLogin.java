package finestralogin;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class FinestraLogin extends Application{
    
    final int w = 400, h = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ScambiaScene");
        
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        //layout.setGridLinesVisible(true); //mostra linee della griglia
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);
        
        Label userLabel = new Label("Username");
        TextField userField = new TextField();
        userField.setPromptText("User");
        
        Label passLabel = new Label("Password");
        TextField passField = new TextField();
        passField.setPromptText("Pass");
        
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            System.out.println("user: " + userField.getText());
            System.out.println("pass: " + passField.getText());
        });
        
        layout.addRow(0, userLabel, userField);
        layout.addRow(1, passLabel, passField);
        layout.add(loginButton, 1, 2);
        
        Scene scene = new Scene(layout, w, h);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}