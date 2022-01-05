package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		//Pane ¿¹Á¦
		//AnchorPane
		//Parent parent = FXMLLoader.load(getClass().getResource("root_anchor.fxml"));
		
		//VBox HBox
		//Parent parent = FXMLLoader.load(getClass().getResource("root_vhBox.fxml"));
		
		//BorderPane
		//Parent parent = FXMLLoader.load(getClass().getResource("root_border.fxml")); 
		
		//FlowPane
		//Parent parent = FXMLLoader.load(getClass().getResource("root_flow.fxml"));
		
		//TilePane
		//Parent parent = FXMLLoader.load(getClass().getResource("root_tile.fxml"));
		
		//GridPane
		//Parent parent = FXMLLoader.load(getClass().getResource("root_grid.fxml"));
		
		//StackPane
		Parent parent = FXMLLoader.load(getClass().getResource("root_stack.fxml"));
		
		
		Scene scene = new Scene(parent);
		
		primaryStage.setTitle("App Main");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
