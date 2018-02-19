package table;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Table extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tabella");
        StackPane layout = new StackPane();
        
        ArrayList<Person> persone = new ArrayList<>();
        
        persone.add(new Person("Mario", "Rossi", 22));
        persone.add(new Person("Gianmarco", "Bianchi", 72));
        persone.add(new Person("Valerio", "Scanu", 48));
        persone.add(new Person("Mariano", "Neri", 28));
        
        TableView<Person> table = new TableView(FXCollections.observableList(persone));
        
        TableColumn nomeColumn = new TableColumn("nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        
        TableColumn cognomeColumn = new TableColumn("cognome");
        cognomeColumn.setCellValueFactory(new PropertyValueFactory<>("cognome"));
        
        TableColumn anniColumn = new TableColumn("anni");
        anniColumn.setCellValueFactory(new PropertyValueFactory<>("anni"));
        
        table.getColumns().addAll(nomeColumn, cognomeColumn, anniColumn);
        
        layout.getChildren().addAll(table);
        
        Scene scene = new Scene(layout);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}