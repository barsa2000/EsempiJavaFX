package pulsanti;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Pulsanti extends Application{
    
    final int h = 300, w = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registration Form");
        
        Button button1 = new Button("cliccami");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("gestione di un evento attraverso una classe interna anonima");
            }
        });
        
        Button button2 = new Button("cliccami");
        button2.setOnAction(event -> {
            System.out.println("gestione di un evento attraverso una funzione lambda");
        });
        
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button1, button2);
        
        Scene scene = new Scene(layout, h, w);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}