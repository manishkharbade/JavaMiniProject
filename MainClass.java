package Project;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		char option;
		do {
			System.out.println("\t\t\t*************Welcome to my Shop*************");
			System.out.println("\t\t\t*  Enter 1 : To add the items to the cart  *");
			System.out.println("\t\t\t*  Enter 2 : To purchase an item           *");
			System.out.println("\t\t\t*  Enter 3 : Total Price                   *");
			System.out.println("\t\t\t*  Enter 4 : To get the Receipt            *");
			System.out.println("\t\t\t*  Enter 0 : To exit.                      *");
			System.out.println("\t\t\t********************************************");

			Scanner enter = new Scanner(System.in);

			System.out.println("Enter any no.");
			int number = enter.nextInt();

			switch (number) {
			case 1:
				Mall a = new Mall();
				a.add();
				break;

			case 2:
				Mall b = new Mall();
				b.purchase_item();
				break;

			case 3:
				Mall c = new Mall();
				c.total_price();
				break;

			case 4:
				Mall d = new Mall();
				d.bill();
				break;

			case 5:
				Mall e = new Mall();
				e.exit();
				break;

			default:
				System.out.println("Invalid Number..!");
				break;
			}
			System.out.println("For more enter 'Y' for yes and 'N' for No");

			option = enter.next().charAt(0);

		} while (option == 'y' || option == 'Y');
		if (option == 'n' || option == 'N') {
			Mall z = new Mall();
			z.exit();
		}

	}

}
