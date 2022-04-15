
package filesproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *Student Name: Riley Oest	
 *LSU ID:899859039
 *Lab Section:Section 1
 */
public class FilesProject {

	/**
	 * 
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pr = new PrintWriter("calculations.txt");
		Random ran = new Random();
		for(int i = 0; i < 1000; i++){
			pr.println(ran.nextInt(1001));
		}
		pr.close();
		Scanner scan = new Scanner(new File("calculations.txt"));
		double num = 0;
		while(scan.hasNextInt()){
			
			num += scan.nextInt();
		}
		double avg = num/ 1000;
		
		
		scan.close();
		System.out.printf("The average is : %.2f", avg);
		
		
		
	}
	
}