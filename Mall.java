package Project;

import java.util.Scanner;

public class Mall {
	static String iname, name;
	static int prize, quantity, total;

	public void add() {
		System.out.println("Please enter details of the item :-");
		Scanner item = new Scanner(System.in);
		System.out.println("Item Name : ");
		String iname = item.nextLine();

		System.out.println("Enter Prize : ");
		int prize = item.nextInt();

		System.out.println("Enter quantity : ");
		int quantity = item.nextInt();

		System.out.println("Cart Details : ");
		System.out.println("\t\t" + "Item" + "\t\t" + "Prize" + "\t\t" + "Quantity" + "\n");
		System.out.println("\t\t" + iname + "\t\t" + "$" + prize + "\t\t" + quantity);
		System.out.println(
				"**********************************************************************************************");
	}

	public void purchase_item() {
		Scanner buy = new Scanner(System.in);

		System.out.println("Enter Item Name : ");
		iname = buy.nextLine();

		System.out.println("Enter Prize of an item : ");
		prize = buy.nextInt();

		System.out.println("Enter the quantity of an item : ");
		quantity = buy.nextInt();
	}

	public int item_quantity() {
		return quantity;
	}

	public int prices() {
		return prize;
	}

	public void total_price() {
		System.out.println("Enter Prize and Quantity of an Item ");
		Scanner t1 = new Scanner(System.in);
		int tprize = t1.nextInt();
		int tquantity = t1.nextInt();

		if (tprize == prize || tquantity == quantity) {
			total += prize * quantity;
			System.out.println("Total : " + Mall.total);
		} else {
			System.out.println("Wrong input, please enter correct id...!");
		}
	}

	public void bill() {
		System.out.println("Enter items details : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name : ");
		name = sc.nextLine();

		System.out.println(
				"****************************************** RECEIPT ******************************************" + "\n");

		System.out.println(
				"\t\t" + "Customer Name" + "\t\t" + "Item Name" + "\t\t" + "Prize" + "\t\t" + "Quantity" + "\n");
		System.out.println("\t\t" + name + "\t\t\t" + iname + "\t\t\t" + "$" + prize + "\t\t" + quantity + "\n");

		System.out.println(
				"**********************************************************************************************"
						+ "\n");
		System.out.println("\t\t" + "Total" + "\t\t\t\t\t\t\t\t" + "$" + Mall.total + "\n");
		System.out.println(
				"**********************************************************************************************");
	}

	public void exit() {
		System.exit(0);
	}
}
