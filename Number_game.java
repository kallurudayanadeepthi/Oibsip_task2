import java.io.*;
import java.util.*;
public class Number_game {
	public static void guess_num() {
		Scanner sc = new Scanner(System.in);
		int n;
		n=1+(int)(100*Math.random());//randomly system generates number
		int rounds=5;
		int guess,i,repeat,points=0;
		System.out.println("hello!! Welcome to Guess the Number game..");
		System.out.println("Input a number between 1 to 100");
		for(i=0;i<5;i++) {
			System.out.println("Try to Guess a number..");
			guess=sc.nextInt();
			if(guess>100 || guess<0) {
				System.out.println("Sorry!! You have to enter only number between 1 to 100");
			}
			else if(guess==n) {
				System.out.println("Congrats!! You guessed right");
				points+=5;
				System.out.println("Your score is "+points);
			}
			else if (guess>n && i!=rounds-1) {
				System.out.println("Oops! Number is less than"+guess);
			}
			else if(guess<n && i!=rounds-1) {
				System.out.println("Oops! Number is greater than"+guess);
			}
		}
		if(rounds==i) {
			System.out.println("you have completed round");
			System.out.println("The number is "+n);
			System.out.println("Do you want to continue..");
			System.out.println("Enter 1 for continue...");
			repeat=sc.nextInt();
			if(repeat==1) {
				guess_num();
			}
			else {
				System.out.println("Well Played!! Thank you..");
			}
		}
	}
	public static void main(String[] args) {
		guess_num();
	}
}
