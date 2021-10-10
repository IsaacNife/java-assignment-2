package com.company.week4;

import java.util.Random;
import java.util.Scanner;

public class assign2 {

	public static void main(String[] args) {
		

		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		int numberOfGuess = 0;
		int min = 1; 
		int max = 100;
		boolean hasWon = false;
		Scanner scanner = new Scanner(System.in);
		
		while (numberOfGuess < 5) {
			System.out.println("Pick a number between " + min+ "and "+max+":");
			int guess = scanner.nextInt();
			
			if (guess < min || guess > max) {
				System.out.println("Your guess is not between" + min + " and " + max + "Please try again.");
				
			} else if (guess < numberToGuess) {
				System.out.println("Please pick a higher number");
				numberOfGuess++;
			} else if (guess > numberToGuess) {
				System.out.println("Please pick a lower number");
				numberOfGuess++;

				
			} else {
				hasWon = true;
				break;
			}
			
		}
		
		if(hasWon) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + numberToGuess);
		}
	}

}
