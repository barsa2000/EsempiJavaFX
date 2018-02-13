package finestra;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Finestra extends Application{
    
    final int h = 400, w = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Finestra");
        
        Button button = new Button("cliccami");
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        
        Scene scene = new Scene(layout, w, h);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}