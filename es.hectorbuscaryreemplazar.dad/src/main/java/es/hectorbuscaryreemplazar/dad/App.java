package es.hectorbuscaryreemplazar.dad;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//para vbox izquierdo
		Label buscarLabel = new Label("Buscar:");
		TextField buscarTextField = new TextField();
		
		Label reemplazarLabel = new Label("Reemplazar con:");
		TextField reemplazarTextField = new TextField();
		
		CheckBox checkBox1 = new CheckBox("Mayusculas y minusculas");
        CheckBox checkBox2 = new CheckBox("Expresion Regular");
        CheckBox checkBox3 = new CheckBox("Buscar hacia atras");
        CheckBox checkBox4 = new CheckBox("Resaltar resultados");
		
		//para vbox derecho
		
        Button buscarButton = new Button("Buscar");
        Button reemplazarButton = new Button("Reemplazar");
        Button reemplazarTButton = new Button("Reemplazar todo");
        Button cerrarButton = new Button("Cerrar");
        Button AyudaButton = new Button("Ayuda");
        
        buscarButton.setPrefSize(140,20);
        reemplazarButton.setPrefSize(140,20);
        reemplazarTButton.setPrefSize(140,20);
        cerrarButton.setPrefSize(140,20);
        AyudaButton.setPrefSize(140,20);
        
		//guardo todo en el vbox iz
        
         GridPane checkGrid = new GridPane();
        
        
        checkGrid.add(checkBox1, 0, 0);
        checkGrid.add(checkBox2, 0, 1);
        checkGrid.add(checkBox3, 1, 0);
        checkGrid.add(checkBox4, 1, 1);
        
        checkGrid.setHgap(10);
        checkGrid.setVgap(5);
        
        GridPane izqGrid = new GridPane();
        izqGrid.add(buscarLabel, 0, 0);
        izqGrid.add(buscarTextField, 1, 0);
        izqGrid.add(reemplazarLabel, 0, 1);
        izqGrid.add(reemplazarTextField, 1, 1);
        izqGrid.add(checkGrid, 1, 2);
        
        izqGrid.setVgap(10);
        
        
        
        ColumnConstraints [] cols = {
                new ColumnConstraints(),
                new ColumnConstraints(),
            };
            izqGrid.getColumnConstraints().setAll(cols);

            cols[1].setHgrow(Priority.ALWAYS);
            cols[1].setFillWidth(true);
        
        
            Insets padding2 = new Insets(0, 0, 0, 10);  
            izqGrid.setPadding(padding2);
        
      //guardo todo en el vbox der
        
        VBox derechoVBox = new VBox(5, buscarButton, reemplazarButton, reemplazarTButton, cerrarButton, AyudaButton);
        
        Insets padding = new Insets(0, 10, 0, 0); 
        derechoVBox.setPadding(padding);
        
       
      //guardo todo en el vbox root
        
        HBox root = new HBox(10, izqGrid, derechoVBox);
        
        
        
        
        HBox.setHgrow(izqGrid, Priority.ALWAYS);
        
        
        

        
        
        //Crear la escena
        Scene scene = new Scene(root, 320, 200); 
        
        // Configurar y mostrar la ventana
        primaryStage.setScene(scene);
        primaryStage.setTitle("Buscar y reemplazar");
        primaryStage.show();
		
		
	}
	
}
