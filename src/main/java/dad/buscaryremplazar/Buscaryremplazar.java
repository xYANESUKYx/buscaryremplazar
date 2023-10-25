package dad.buscaryremplazar;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Buscaryremplazar  extends Application{

	private Stage primaryStage;
		
	//view

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		
		TextField buscarText = new TextField();
		buscarText.setPromptText(" ");
		
		TextField remplazoText = new TextField();
		remplazoText.setPromptText(" ");
		
		CheckBox unoCheckbox  = new CheckBox("Mayusculas y minusculas");
		CheckBox dosCheckbox  = new CheckBox("Buscar hacia atras");
		CheckBox tresCheckbox  = new CheckBox("Expresion regular");
		CheckBox cuatroCheckbox  = new CheckBox("Resaltar resultados");
		
		Button buscarButton = new Button("Buscar");
		buscarButton.setDefaultButton(true);
		buscarButton.setMinSize(115, 30);
		buscarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");
		buscarButton.setOnMouseEntered(event -> {
			buscarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #039ed3;" + "-fx-border-width: 2px;" + "-fx-border-radius: 3px;");});
        // Restablecer bordes a su estado original cuando el ratón sale del botón
		buscarButton.setOnMouseExited(event -> {
			buscarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");});
		
		Button reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setDefaultButton(true);
		reemplazarButton.setMinSize(115, 30);
		reemplazarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");
		reemplazarButton.setOnMouseEntered(event -> {
			reemplazarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #039ed3;" + "-fx-border-width: 2px;" + "-fx-border-radius: 3px;");});
        // Restablecer bordes a su estado original cuando el ratón sale del botón
		reemplazarButton.setOnMouseExited(event -> {
			reemplazarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");});
		
		Button reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setDefaultButton(true);
		reemplazarTodoButton.setMinSize(115, 30);
		reemplazarTodoButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");
		reemplazarTodoButton.setOnMouseEntered(event -> {
			reemplazarTodoButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #039ed3;" + "-fx-border-width: 2px;" + "-fx-border-radius: 3px;");});
        // Restablecer bordes a su estado original cuando el ratón sale del botón
		reemplazarTodoButton.setOnMouseExited(event -> {
			reemplazarTodoButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");});
		
		Button cerrarButton = new Button("Cerrar");
		cerrarButton.setDefaultButton(true);
		cerrarButton.setMinSize(115, 30);
		cerrarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");
		cerrarButton.setOnMouseEntered(event -> {
			cerrarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #039ed3;" + "-fx-border-width: 2px;" + "-fx-border-radius: 3px;");});
        // Restablecer bordes a su estado original cuando el ratón sale del botón
		cerrarButton.setOnMouseExited(event -> {
			cerrarButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");});
		
		Button ayudaButton = new Button("Ayuda");
		ayudaButton.setDefaultButton(true);
		ayudaButton.setMinSize(115, 30);
		ayudaButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");
		ayudaButton.setOnMouseEntered(event -> {
			ayudaButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #039ed3;" + "-fx-border-width: 2px;" + "-fx-border-radius: 3px;");});
        // Restablecer bordes a su estado original cuando el ratón sale del botón
		ayudaButton.setOnMouseExited(event -> {
			ayudaButton.setStyle("-fx-background-color: #e5e5e5; \r\n" + "-fx-border-color: #b5b5b5;" + "-fx-border-radius: 3px;");});
        
		
		//Ventaneishon
		HBox root = new HBox();
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 530, 200);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.getScene().setFill(Color.RED);
		primaryStage.show();
		
		GridPane gridpaneCheckbox = new GridPane();
		//root.setGridLinesVisible(true);
		gridpaneCheckbox.setVgap(5);
		gridpaneCheckbox.setHgap(5);
		gridpaneCheckbox.setPadding(new Insets(5));
		gridpaneCheckbox.addRow(0, unoCheckbox, dosCheckbox);
		gridpaneCheckbox.addRow(1, tresCheckbox, cuatroCheckbox);
	
		GridPane gridpane = new GridPane();
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		gridpane.setPadding(new Insets(5));
		gridpane.addRow(0, new Label("Buscar:"), buscarText);
		gridpane.addRow(1, new Label("Remplazar con:"), remplazoText);
		gridpane.addRow(2, new Label(" "), gridpaneCheckbox);
		gridpane.setPadding(new Insets(10));
		
		VBox vbox = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		vbox.setPadding(new Insets(10));
		
		root.getChildren().addAll(gridpane, vbox);
	}
}
