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

			System.out.println("Please make a selection by inputting the corresponding number:");
			System.out.println("1. Snickers: $1");
			System.out.println("2. Doritos:  $1");
			System.out.println("3. Reese's:  $1");
			System.out.println("4. ChexMix:  $1 ");
			System.out.println("5. Pretelz:  $1");
			int userInput = input.nextInt();

			if (userInput <= 5) {
				System.out.println("Item Cost: $1");
				System.out.println("Ony 1 Dollar Bills are accepted. Type the amount of cash you would like to insert...");
				float cashIn = input.nextFloat();
				
				System.out.println("Are you sure you would like to complete this transaction? Type YES or NO.");
				input.nextLine();
				String decision = input.nextLine();
				if (decision.equalsIgnoreCase("yes")) {
					float change = cashIn - 1;
					System.out.println("Your change is: $" + change + " Enjoy!");
					tryAgain = false;
				} else if (decision.equalsIgnoreCase("no")) {
					System.out.println("Please make another selection.");
				}
			}
			 else {
				System.out.println("Invaild entry, try again.");
			}
		}

	}

}
