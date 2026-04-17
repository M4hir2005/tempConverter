package temperatureConverter;
import java.util.Scanner;

public class tempConverter {

	public static void main(String[] args) {
// convert temperature. Degrees > fahreinheit and other way around.
		
		// ask user whether which way they wanna convert
		
		// use a ternary operator
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello and welcome to my amazing temperature converter");
		System.out.println("Please select an option");
		System.out.println("Option A: Degrees -> Fahreinheit");
		System.out.println("Option B: Fahreinheit -> Degrees");
		String optionSelected = scanner.next().toUpperCase();
		System.out.println("What is the temperature you wish to convert:");
		int temperatureChosen = scanner.nextInt();
		
		scanner.close();
		// tenary operator ? true : false;
		double optionChosen = (optionSelected.equals("A")) ?  (temperatureChosen * 1.8) + 32 : (temperatureChosen - 32)/1.8;
		
		// use letters instead of numbers to stop error??
		System.out.printf("Your converted temp is: %.2f", optionChosen);
		
		// this is wrong with options above 2
		// potential bug > people can put any letter? fix: use a while loop?

	}

}
