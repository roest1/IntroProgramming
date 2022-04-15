
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rileyoest
 */
public class files {

    public static void main(String[] args) throws FileNotFoundException {
        
        // must add throws FileNotFoundException so if a file doesn't exist, your program won't crash, it just won't compile
        // you can create, delete, read, and write with files 
        // with the printWriter class, you can create and write to the file
        // with the File class, you can read the file using a scanner and delete the file
        // both words and numbers may be stored
        // .txt files are the most portable types of data files
        // to write to a file use print methods
        // to read a text file, create an object of the file class and pass its name in quotes
        // read from the file by creating an object of the scanner class
        
        
        //Example - Read 5 names from the user and save the data into a text file named names.txt
        
//        PrintWriter names = new PrintWriter("names.txt"); // creates a file named names.txt, if the file already exists, it clears the file.
//        
//        File namesFile = new File("names.txt"); // opens a stream to the file names.txt
//        
//        Scanner scan = new Scanner(System.in); // creates a scanner object that reads from the keyboard
//        
//        System.out.println("5 names");
//        
//        for(int i = 0; i < 5; i++){
//            System.out.printf("Enter name %d:", i+1);
//            names.println(scan.nextLine()); // prints names line by line into the file created from the printWriter class
//        }
//        
//        
//        // now read from the file and display the names in the console
//        
//        Scanner fileScan = new Scanner(namesFile); // creates a scanner object that reads from the file 
//        
//        while(fileScan.hasNextLine()){
//            System.out.println(fileScan.nextLine()); // scans the stream from the file names.txt and prints names
//        }
//        
//        names.close(); // always close the stream, or else the file will be held by your program
        
        
        // create a file called numbers.txt and populate the file with 1000 random float numbers with 6 decimal digits in the range [0,1]
        // read the file and print out the numbers to the console to 2 decimal digits
        
//        PrintWriter numbers = new PrintWriter("numbers.txt"); // creates a file called numbers.txt, if it is already created, it empties it
//        
//        Random random = new Random(); // creates an object from the Random class in the range from [0,1]
//        
//        for(int i = 0; i < 1000; i++){
//            numbers.printf("%.6f\n", random.nextFloat());
//        }
//        
//        numbers.close();
//        
//        File numFile = new File("numbers.txt");
//        
//        Scanner streamScan = new Scanner(numFile);
//        
//        while(streamScan.hasNextFloat()){
//            System.out.printf("%.2f ,", streamScan.nextFloat());
//        }
//        
//        streamScan.close();
//        
//        // create a method that takes the file's name as the input, reads it, and returns the average of the numbers in it.
//        System.out.println("");
//        
//        System.out.println("Average: " + files.calculateAverage("numbers.txt"));
        
        // can also write scanner object as ----
        // Scanner scan = new Scanner(new File("numbers.txt"));
        
        
        // printf
        //===================================================
        // %d = [byte, short, int, long]
        // %f = [float, double]
        // %s = String
        
        // \n = New Line
        // \t = Tab Space
        
        // printf flags
        // %-d = left alignment
        // %0d = show leading zeroes
        // %+d = show plus sign for positive numbers
        // %(d = show negative numbers in parentheses
        // %,d = show correct comma seperators
        // %S = convert letters to uppercase
        //%xd = leaves a space = x infront of integer
        
        // Note: to initialize a float variable, you must clarify to the compiler that the value is a float by putting "f" at the end of the number
        
//        float discount = .3f;
//        int price = 5;
//       
//        System.out.printf("Discount: %.2f\tPrice: %02d\n", discount, price);
//        
//        String name = "riley";
//        
//        System.out.printf("String as is: %s. String using uppercase flag: %S\n", name, name);
        
        
        //Generating Random Numbers
        // ==========================================
        
        // generate a random integer from [0, 300)
        
//        Random rand = new Random();
//        
//        int randNum = rand.nextInt(300);
//        
//        System.out.println(randNum);
//        
//        // generate a random integer in a range from [250, 252]
//        
//        int x = rand.nextInt((252-250)+1) + 250; 
//        // rand.nextInt() takes the domain inside the parentheses and spits out a random int given the domain starting at the 0th index
//        
//        System.out.println("In between [250, 252]: " + x);
    }
    
    protected static Float calculateAverage (String fileName) throws FileNotFoundException{
        
        File aFile = new File(fileName);
        
        Scanner streamScan = new Scanner(aFile);
        
        float sum = 0;
        int q = 0;
        while(streamScan.hasNextFloat()){
            
         
            sum += streamScan.nextFloat();
            q ++;
            
        }
        
        return sum/q;
        
        
    }
    
}

