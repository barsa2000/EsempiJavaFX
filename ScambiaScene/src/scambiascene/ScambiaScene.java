package scambiascene;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ScambiaScene extends Application{
    
    final int w = 400, h = 300;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ScambiaScene");
        
        HBox layout1 = new HBox();
        layout1.setAlignment(Pos.CENTER);
        Label label1 = new Label("Benvenuto nella scena 1");
        Button button1 = new Button("Vai alla scena 2");
        button1.setOnAction(event -> {
            primaryStage.setScene(scene2);
        });
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, w, h);
        
        VBox layout2 = new VBox();
        layout2.setAlignment(Pos.CENTER);
        Label label2 = new Label("Benvenuto nella scena 2");
        Button button2 = new Button("Torna alla scena 1");
        button2.setOnAction(event -> {
            primaryStage.setScene(scene1);
        });
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, w, h);
        
        
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}