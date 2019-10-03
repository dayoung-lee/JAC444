package task1;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

public class hangman {
	static ArrayList<String> words = new ArrayList<>();
	static boolean checking;

	public static String[] generateRandomWords(int numberOfWords) {
		Random rand = new Random();

		String[] randomStrings = new String[numberOfWords];
		// Random random = new Random();
		for (int i = 0; i < numberOfWords; i++) {
			char[] word = new char[rand.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are
															// boring.)
			for (int j = 0; j < word.length; j++) {
				word[j] = (char) ('a' + rand.nextInt(26));
			}
			randomStrings[i] = new String(word);
		}
		return randomStrings;
	}

	public static String printTask2(List<String> words) {
		Random rand = new Random();
		int wordNum = words.size();
		int place;
		for (int i = 0; i < 1;) {
			place = rand.nextInt(wordNum);
			String s = words.get(place);
			System.out.print(s);
			return s;
		}
		return null;
	}

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("Hangman Game");
		System.out.println();
		System.out.println("Press 1 to run game with randomly generated word.");
		System.out.println();
		System.out.println("Press 2 to run game by reading the word from the text file.");
		System.out.println();
		System.out.print("Enter your choice:");

		String fileName = "D:\\프로그래밍\\JAC444W2\\workshop2\\src\\task1\\hangman1.txt";
		File wordList = new File(fileName);
		List<String> words = new ArrayList<>();
		Scanner reader = null;
		try {
			reader = new Scanner(wordList);
		} catch (FileNotFoundException e) {
			System.out.println("file \"" + fileName + "\" not found");
			System.exit(0);
		}
		 
		 while (reader.hasNextLine()) {		 
			String word = reader.next();
			words.add(word);			
		}
		
		String result = null;
		int userInput = input.nextInt();

		String playContinue = "y";
		do {
			if (userInput == 1) {
				String[] array = generateRandomWords(1);
				System.out.print("This is the answer : ");
				System.out.println(array[0]);				
				result = array[0]; // answer
			}

			else if (userInput == 2) {
				System.out.print("(This is the answer : ");
				result = printTask2(words); // answer
				System.out.print(")");
				System.out.println();
			}
			
			String hiddenWord = getHiddenWord(result);
			int count = 0;
			while (!result.equals(hiddenWord)) {
				System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
				char c = input.next().charAt(0);
				if (!result.contains(String.valueOf(c))) {
					System.out.println(c + " is not in the word.");
					count++; // missed * times
				} else {
					hiddenWord = getGuess(result, hiddenWord, c);
				}
			}
			System.out.println("The word is '" + hiddenWord + "'. You missed " + count + " time(s).");
			System.out.println("Do you want to guess another word? Enter y or n>");
			playContinue = input.next();
		} while (playContinue.equals("y"));
		System.out.println("Game Over");
	}

	private static String getHiddenWord(String word) {
		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}

	static public String getGuess(String word, String hiddenWord, char c) {
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {
			if (c == word.charAt(i)) {
				if (s.charAt(i) == c) {
					System.out.println(c + " is alrady in word.");
					continue; // pass delete and insert and go to 'for' loop
				}
				s = s.deleteCharAt(i);
				s = s.insert(i, c);
			}
		}
		return s.toString();
	}
}
