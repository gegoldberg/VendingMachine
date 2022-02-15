import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Welcome to the Vending Machine!");

		int snickers = 1;
		int doritos = 2;
		int reeses = 3;
		int chexMix = 4;
		int pretelz = 5;

		Boolean tryAgain = true;

		while (tryAgain) {

			Scanner input = new Scanner(System.in);

			System.out.println("Make a selection:");
			System.out.println("1. Snickers: $1");
			System.out.println("2. Doritos:  $1");
			System.out.println("3. Reese's:  $1");
			System.out.println("4. ChexMix:  $1 ");
			System.out.println("5. Pretelz:  $1");
			int userInput = input.nextInt();

			if (userInput <= 5) {
				System.out.println("item Cost: $1");
				System.out.println("insert cash...");
				float cashIn = input.nextFloat();
				float change = cashIn - 1;
				System.out.println("Your change is: $" + change + " Enjoy!");
				tryAgain = false;
			} else {
				System.out.println("Invaild entry, try again.");
			}
		}

	}

}
