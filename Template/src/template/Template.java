package template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Template extends Application{
    
    final int w = 400, h = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ScambiaScene");
        
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, w, h);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}