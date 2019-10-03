package task1;

import javafx.application.Application; 
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;


public class TesterClass extends Application {
	Label label1,label2, label3, label4, label5, label6, label7, label8, label9, label7a, label7b;
	TextField textfield1, textfield2, textfield3, textfield4, textfield5;
	Button button1, button2, button3;
	Stage stage;
	@Override
	public void start(Stage p) throws Exception {
		p.setTitle("Quiz Application");
		GridPane r = new GridPane();
		r.setPadding(new Insets(0, 10, 0, 10));
		Scene sc = new Scene(r, 500, 350);
		
		r.setVgap(5);
		r.setHgap(5);

		int a = ThreadLocalRandom.current().nextInt(1, 11);
		int b = ThreadLocalRandom.current().nextInt(1, 11);
		
		
		// generate
		label1 = new Label("Two randomly generated numbers are: ");
		label2 = new Label(a + " and " + b);
		// add
		label3 = new Label("What is addition of " + a + " and " + b + ": ");
		textfield1 = new TextField();
		label7a = new Label("");
		label7b = new Label("");
		
		button1 = new Button("Check");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int countCorrect = 0;
				int countIncorrect = 0;
				int addResult = Integer.parseInt(textfield1.getText());
				double subResult = Double.parseDouble(textfield2.getText());
				int mulResult = Integer.parseInt(textfield3.getText());
				double divResult = Double.parseDouble(textfield4.getText());
				
				int addAnswer = a + b;
				double subAnswer = a - b;
				int mulAnswer = a * b;
				double divAnswer = (double)a / b;
				
				if (addResult == addAnswer) {
					countCorrect++;			
					System.out.println("Correct!..." + countCorrect);
				}else if(addResult != addAnswer) {
					countIncorrect++;	
					System.out.println("checking..." + countIncorrect);
					textfield1.setStyle("-fx-highlight-fill: red;");
				}
				
				if (subResult == subAnswer) {
					countCorrect++;
					System.out.println("Correct!..." + countCorrect);
				}else if(subResult != subAnswer) { 
					countIncorrect++;
					System.out.println("checking..." + countIncorrect);
				}
				
				if(mulResult == mulAnswer) {
					countCorrect++;
					System.out.println("Correct!..." + countCorrect);
				}else if (mulResult != mulAnswer) {
					countIncorrect++;
					System.out.println("checking..." + countIncorrect);
				}
				
				if(divResult == divAnswer) {
					countCorrect++;
					System.out.println("Correct!..." + countCorrect);
				}else if (divResult != divAnswer) {
					countIncorrect++;
					System.out.println("checking..." + countIncorrect);
				}
				
				String result1 = Integer.toString(countCorrect);
				String result2 = Integer.toString(countIncorrect);
				label7a.setText(result1);
				label7b.setText(result2);
			}
		});		
			
		//
		
		//substract
		label4 = new Label("What is substraction of " + a + " and " + b + ": ");
		textfield2 = new TextField();
		//
		//multiply
		label5 = new Label("What is multiplication of "+ a + " and " + b + ": ");
		textfield3 = new TextField();
		//
		//division
		label6 = new Label("What is division of "+ a + " and " + b + ": ");
		textfield4 = new TextField();
		//	
		
		//result
		
		label7 = new Label("Number of Correct Answers: ");
		
		label8 = new Label("Number of Wrong Answers: ");
		label9 = new Label("Would you like to try with two other different numbers? ");
		textfield5 = new TextField();
		button2 = new Button("Submit");
		
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String replay = textfield5.getText();
				if(replay.equalsIgnoreCase("Y")) {
					textfield1.clear();
					textfield2.clear();
					textfield3.clear();
					textfield4.clear();		
					
				}else if (replay.equalsIgnoreCase("N")) {
					textfield1.clear();
					textfield2.clear();
					textfield3.clear();
					textfield4.clear();
					
				}
			}
		});
		
		button3 = new Button("Exit");
		button3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		
		r.add(label1, 0, 0);
		r.add(label3, 0, 1);
		
		r.add(button1, 0, 5);
		
		r.add(label4, 0, 2);
		r.add(label5, 0, 3);
		r.add(label6, 0, 4);
		r.add(label7, 0, 6);
		r.add(label7a, 1, 6);		
		r.add(label8, 0, 7);
		r.add(label7b, 1, 7);
		r.add(label9, 0, 11);
		r.add(button2, 0, 12);
		r.add(button3, 1, 12);
		
		r.add(label2, 1, 0);
		r.add(textfield1, 1, 1);
		r.add(textfield2, 1, 2);
		r.add(textfield3, 1, 3);
		r.add(textfield4, 1, 4);
		
		
		r.add(textfield5, 1, 11);
		
		
		p.setScene(sc);
		p.show();
		
		
	}
		
	public static void main(String[] args) {
		launch(args);
	}

	
}
