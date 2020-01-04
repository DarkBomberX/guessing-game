package guessing_game;

import java.util.Scanner;

public class GuessingGame {

	private static final int WINNING_NUMBER = 7;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Guess an Number between 1 and 10");

		int userGuess = input.nextInt();

		for (int guessCount = 0; guessCount < 1; guessCount++) {
			while (userGuess == 0) {
				System.out.println("Enter a Value between 1 & 10 and \nif you guess right you will win!");
				userGuess = input.nextInt();

				if (userGuess != WINNING_NUMBER) {
					System.out.println("You Lose");
					userGuess = input.nextInt();
				} else {
					System.out.println("You Win!");
					break;
				}
			}
		}
	}
}