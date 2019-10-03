package task2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class submitQuery extends Application {
	Button submitB, exitB;
	Label label1;
	TextField textfield1;
	
	public void start(Stage s) {
		s.setTitle("Search Name Ranking Application");
		GridPane r = new GridPane(); 
		r.setPadding(new Insets(10, 10, 10, 10));
		r.setVgap(5);
		r.setHgap(5); 
		Scene sc = new Scene(r, 400, 300); 
		submitB = new Button("Submit");
		submitB.setLayoutX(100);
		submitB.setLayoutY(180);
		submitB.setMaxWidth(80);
		submitB.setMaxHeight(30);
		submitB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String answer = textfield1.getText();
				if(answer.equalsIgnoreCase("Y")){
					GuiClass g = new GuiClass();					
				}else if (answer.equalsIgnoreCase("N")){
					System.exit(0);		
				}
			}
		});		
		
		exitB = new Button("Exit");
		exitB.setLayoutX(200);
		exitB.setLayoutY(180);
		exitB.setMaxWidth(80);
		exitB.setMaxHeight(30);
		exitB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});	

		label1 = new Label("Do you want to Search for another Name:");
		label1.setLayoutX(30);
		label1.setLayoutY(50);
		label1.setMaxWidth(280);
		label1.setMaxHeight(130);
		
		textfield1 = new TextField();
		textfield1.setLayoutX(280);
		textfield1.setLayoutY(100);
		textfield1.setMaxWidth(50);
		textfield1.setMaxHeight(30);
		
		r.add(label1, 0, 0);
		r.add(textfield1, 1, 0);
			
		r.add(submitB, 0, 5);		
		r.add(exitB, 1, 5);
		
		s.setScene(sc);
		s.show();
		
	}	
	public static void main(String[] args) {
		Application.launch(submitQuery.class, args);
	}

}
