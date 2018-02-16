package finestremultiple;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FinestreMultiple extends Application{
    
    final int h = 400, w = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pulsanti");
        Label confermaLabel = new Label();
        
        Button button1 = new Button("Invia");
        button1.setOnAction(e -> {
            ConfirmBox f = new ConfirmBox("titolo", "messaggio", 200, 200);
            confermaLabel.setText(String.valueOf(f.show()));
        });
        
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);
        layout.getChildren().addAll(button1, confermaLabel);
        
        Scene scene = new Scene(layout, w, h);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}