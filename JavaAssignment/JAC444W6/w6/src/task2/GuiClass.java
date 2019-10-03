package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiClass extends Application {
	Button submitB, exitB, submitQ;
	Label label1, label2, label3, label4, label5;
	TextField textfield1, textfield2, textfield3;

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Search Name Ranking Application");
		GridPane r = new GridPane(); 
		r.setPadding(new Insets(10, 10, 10, 10));
		r.setVgap(5);
		r.setHgap(5);
		Scene sc = new Scene(r, 350, 200); 
		
		submitQ = new Button("Submit Query");
		submitQ.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				int year = Integer.parseInt(textfield1.getText());
				String gender = textfield2.getText();
				String name = textfield3.getText();

				File file = new File("babynamesranking" + year + ".txt");
				if (!file.exists()) {
					System.out.println("No record for " + year);
					System.exit(1);
				}
				int rank = 0;
				try {
					Scanner read = new Scanner(file);
					while (read.hasNext()) {
						String s = read.nextLine();
						String[] temp = s.split(" ");
						if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
							rank = new Integer(temp[0]);
						else if (temp[3].contains(name))
							rank = new Integer(temp[0]);
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
				if (rank == 0) {	
					if(gender.equals("M")){
						label4.setText("Boy name " + name + " is not ranked in year " + year);
					}else
						label4.setText("Girl name " + name + " is not ranked in year " + year);
				} else {
					if(gender.equals("M")){
						label4.setText("Boy name " + name + " is ranked #" + rank + " in year " + year);
					}else
						label4.setText("Girl name " + name + " is ranked #" + rank + " in year " + year);
				}
				submitQ.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						System.exit(0);
					}
				}); // submitQ.setOnAction
			}
		}); // 	
				
		exitB = new Button("Exit");
		exitB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		
		label1 = new Label("Enter the Year:");
		label2 = new Label("Enter the Gender:");
		label3 = new Label("Enter the Name:");
		label4 = new Label("");		
		textfield1 = new TextField();		
		textfield2 = new TextField();
		textfield3 = new TextField();
	
		r.add(label1, 0, 0);
		r.add(textfield1, 1, 0);
		r.add(label2, 0, 1);
		r.add(textfield2, 1, 1);
		r.add(label3, 0, 2);
		r.add(textfield3, 1, 2);		
		r.add(label4, 0, 3);		
		r.add(submitQ, 0, 5);		
		r.add(exitB, 1, 5);
		
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
