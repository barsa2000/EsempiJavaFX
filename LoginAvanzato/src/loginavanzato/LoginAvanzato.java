package loginavanzato;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class LoginAvanzato extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registrazione");
        
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        //layout.setGridLinesVisible(true); //mostra linee della griglia
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);
        
        Label userLabel = new Label("Username");
        TextField userField = new TextField();
        userField.setPromptText("User");
        
        Label nascitaLabel = new Label("Data di nascita");
        DatePicker nascitaPicker = new DatePicker();
        
        Label sessoLabel = new Label("Sesso");
        ToggleGroup sessoGroup = new ToggleGroup();
        RadioButton maschioRadio = new RadioButton("M");
        maschioRadio.setToggleGroup(sessoGroup);
        maschioRadio.setSelected(true);
        
        RadioButton femminaRadio = new RadioButton("F");
        femminaRadio.setToggleGroup(sessoGroup);
        
        HBox sessoLayout = new HBox(10, maschioRadio, femminaRadio);
        
        Label linguaggiLabel = new Label("Linguaggi conosciuti");
        ListView<String> linguaggiView = new ListView<>();
        linguaggiView.getItems().addAll("C++", "Java", "Pascal", "C", "Fortran", "Assembly X86");
        linguaggiView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        Label classeLabel = new Label("Classe");
        ComboBox<String> classeCombo = new ComboBox<>();
        classeCombo.getItems().addAll("I", "II", "III", "IV", "V");
        classeCombo.getSelectionModel().selectFirst();
        
        Label passLabel = new Label("Password");
        TextField passField = new TextField();
        passField.setPromptText("Pass");
        
        CheckBox newsletterCheck = new CheckBox("newsletter");
        newsletterCheck.setSelected(true);
        
        Button loginButton = new Button("Registrati");
        loginButton.setOnAction(e -> {
            System.out.println("user: " + userField.getText());
            System.out.println("nascita: " + nascitaPicker.getValue());
            System.out.println("sesso: " + ((RadioButton)sessoGroup.getSelectedToggle()).getText());
            System.out.println("linguaggi: " + linguaggiView.getSelectionModel().getSelectedItems());
            System.out.println("classe: " + classeCombo.getSelectionModel().getSelectedItem());
            System.out.println("news: " + newsletterCheck.isSelected());
            System.out.println("pass: " + passField.getText());
        });
        
        layout.addRow(0, userLabel, userField);
        layout.addRow(1, nascitaLabel, nascitaPicker);
        layout.addRow(2, sessoLabel, sessoLayout);
        layout.addRow(3, linguaggiLabel, linguaggiView);
        layout.addRow(4, classeLabel, classeCombo);
        layout.addRow(5, passLabel, passField);
        layout.addRow(6, newsletterCheck, loginButton);
        
        Scene scene = new Scene(layout);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}