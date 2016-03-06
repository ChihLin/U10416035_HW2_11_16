//U10416035 ¾Gªé²O

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


		while (number1 * number2 != answer) {

			System.out.print("Wrong answer. Try again. What is " + number1 + " * " + number2 + "?");

			list.add(answer);
			answer = input.nextInt();


			if(list.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			
   		}

		System.out.println("You got it!");
	}
}
