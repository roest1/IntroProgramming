
package project8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rileyoest
 */
public class Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        populateArray(array, size);

        long start = System.currentTimeMillis();
        SortingAlgorithms.bubbleSort(array.clone());
        long elapsed = System.currentTimeMillis() - start;

        System.out.println("Bubble Sort: " + elapsed + " (ms.)");

        start = System.currentTimeMillis();
        SortingAlgorithms.bubbleSortSC(array.clone());
        elapsed = System.currentTimeMillis() - start;

        System.out.println("Bubble Sort (SC): " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.gnomeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        
        System.out.println("Gnome Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.selectionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;

        System.out.println("Selection Sort: " + elapsed + " (ms.)");

        start = System.currentTimeMillis();
        SortingAlgorithms.insertionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;

        System.out.println("Insertion Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        
        System.out.println("Merge Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis();
        Arrays.sort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        
        System.out.println("Java Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.quickSort(array.clone(), 0, array.length-1);
        elapsed = System.currentTimeMillis() - start;
        
        System.out.println("Quick Sort: " + elapsed + " (ms.)");
        
        
        
       

    }

    public static void populateArray(int[] array, int size) {

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
    }
}


