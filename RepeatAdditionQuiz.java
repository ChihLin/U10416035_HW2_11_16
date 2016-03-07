//U10416035 Cheng Chih Lin

//package chapter5;

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {

		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//new a arraylist
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("What is " + number1 + " * " + number2 + "? ");
		int answer = input.nextInt();

		//while loop -- test the user's ans is true or false 
		while (number1 * number2 != answer) {

			System.out.print("Wrong answer. Try again. What is " + number1 + " * " + number2 + "?");

			//put the ans to the arraylist
			list.add(answer);
			answer = input.nextInt();

			// if user input the same ans system will prompt
			if(list.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			
   		}

		System.out.println("You got it!");
	}
}
