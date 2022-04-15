
package invoiceproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author rileyoest
 */
public class InvoiceProject {

	/**
	 * Creates invoice from wallmart.
	 * @thorws FileNotFoundException
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Random random = new Random();
		int num = random.nextInt(900) + 100;
		String fileName = "reciept_" + num + ".txt";
		PrintWriter outfile = new PrintWriter(fileName);
		Scanner scan = new Scanner(System.in);

		outfile.println("====================================");
		outfile.println( "\tWelcome to Wallmart\t");
		outfile.println("====================================");
		outfile.printf("%-10s%-10s%-10s%-10s\n", "name", "quantity", "price", "total");
		outfile.println("------------------------------------");

		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd - hh:mm:ss a");
		String currentDateTimeFormatted = currentDateTime.format(formatter);

		char anotherItem = 'y';
		double total = 0;

		while (anotherItem == 'y'|| anotherItem == 'Y') {
			int quantity = 0;
			double price = 0;
			String name;

			System.out.print("Item: ");
			name = scan.next();
			outfile.printf("%-10s", name);

			System.out.print("Quantity: ");
			quantity = scan.nextInt();
			outfile.printf("%-10d", quantity);

			System.out.print("Price: $");
			price = scan.nextDouble();
			outfile.printf("$%-10.2f", price);

			outfile.printf("$%-10.2f\n", quantity * price);
			total += (quantity * price);

			System.out.println("Press ‘y’ to enter a new item. Press anyother key to quit.");
			anotherItem = scan.next().charAt(0);

		}
		System.out.println(fileName + " has been issued on " + currentDateTimeFormatted);

		outfile.println("------------------------------------");
		outfile.printf("\t\tYour total is $%.2f\n", total);
		outfile.printf("\t\t\tTax: $%.2f\n", total * 1.09);
		outfile.println("====================================");

		outfile.close();
	}

}
