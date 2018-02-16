
package finestremultiple;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ConfirmBox {
    private Stage window;
    private VBox layout;
    
    private boolean risp = false;

    public ConfirmBox(String title, String message, int w, int h) {
        window = new Stage();
        window.setWidth(w);
        window.setHeight(h);
        window.setTitle(title);
        
        Label msgLabel = new Label(message);
        
        ToggleGroup confermaGroup = new ToggleGroup();
        RadioButton siRadio = new RadioButton("SI");
        siRadio.setToggleGroup(confermaGroup);
        
        RadioButton noRadio = new RadioButton("NO");
        noRadio.setToggleGroup(confermaGroup);
        noRadio.setSelected(true);
        
        confermaGroup.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {
            risp = newValue.equals(siRadio);
        });
        
        HBox radioBox = new HBox();
        radioBox.setSpacing(10);
        radioBox.setAlignment(Pos.CENTER);
        radioBox.getChildren().addAll(siRadio, noRadio);
        
        Button confirmButton = new Button("Conferma");
        
        confirmButton.setOnAction(e -> {
            window.close();
        });
        
        layout = new VBox();
        layout.getChildren().addAll(msgLabel, radioBox, confirmButton);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
    }
    
    public boolean show(){
        window.showAndWait();
        return risp;
    }
    
    
}
