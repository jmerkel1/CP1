import java.util.Scanner;
import java.util.Random;

public class RollingDice{
	public static void main (String[] args){
		System.out.println("Rolling Two Dice");
		
		String response = "y";
		
		do {
		Random Die1 = new Random();
		int D1 = Die1.nextInt(6);
		D1 += 1;

		Random Die2 = new Random();
		int D2 = Die2.nextInt(6);
		D2 += 1;

		System.out.println("Die 1: " + D1 + ", Die 2: " + D2 + ", sum of two dice: " + (D1 + D2));
		
		Scanner kin = new Scanner(System.in);
		System.out.print("Would you like to roll again? (y/n) ");
		response = kin.nextLine();
		
		} while (response.equals("y")); 
		System.out.println("\nGoodbye");
	}
}