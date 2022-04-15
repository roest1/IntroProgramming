package sortingandcomplexity;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author rileyoest
 */
public class SortingAndComplexity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // bubble sort, selection sort, insertion sort, merge sort, quick sort
        
        // bubble sort is a pair-wise comparison of adjacent elements. Swap elements until array is sorted
        
        Random rand = new Random();
        
        
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            int rnum = rand.nextInt(20);
            array[i] = rnum;
        }
       
        
        int [] test = {6, 3, 2, -9, 5};
        System.out.println(Arrays.toString(array));
        System.out.println("Insertion sort");
        SortingAndComplexity.ShitInsertion(array);
//        System.out.println("Unsorted: " + Arrays.toString(array));
//        System.out.println("Sorted: " + SortingAndComplexity.bubbleSort(array));
//        
//        System.out.println("Short Circuit: " + SortingAndComplexity.scBubble(array));
//        
//        
//        int[] big = new int [1000];
//        for(int j = 0; j < big.length; j++){
//            int x = rand.nextInt(100);
//            big[j] = x;
//        }
//        long start = System.currentTimeMillis();
//        SortingAndComplexity.bubbleSort(big);
//        long elapsed = System.currentTimeMillis() - start;
//        System.out.println("Bubble Time: " + elapsed);
//                
//        start = System.currentTimeMillis();
//        SortingAndComplexity.scBubble(big);
//        elapsed = System.currentTimeMillis() - start;
//        
//        System.out.println("SC Bubble Time: " + elapsed);
        
        
//        System.out.println("");
//        System.out.println("Unsorted Array: " + Arrays.toString(array));
//        System.out.println("Selection Sort: " + SortingAndComplexity.selectionSort(array));
        
        
        
//        System.out.println("Unsorted Array; " + Arrays.toString(array));
//        System.out.println("Insertion Sort: " + SortingAndComplexity.insertionSort(array));

//        System.out.println("Unsorted: " + Arrays.toString(test));
//        System.out.println("Selection Sort: " + SortingAndComplexity.selectionSort(test));
//        

        
    }
    // time complexity for bubble sort
    // for an array the size of n: we have to do n-1 passes over the data
    // each pass does (n-1)-i tests
    // bubble sort complextity is O(n^2)
    public static String bubbleSort(int [] array){
        
        int val1, val2;
       
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }
        
        
        
        
    }
    return Arrays.toString(array);
}
    
    // short-circuit bubblesort
    public static String scBubble(int [] array){
        
        boolean swap = true;
        while(swap){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
                else{
                    swap = false;
                }
            }
        }
        }
        return Arrays.toString(array);
    }
    
    // selection sort
    // assume first element is the smallest 
    // loop through the rest of the elements
    // find the minimum
    // replace it with the first element from the left
   
    // just like bubble sort it runs at O(n^2)
    // bad choice for larger arrays
    // cannot be short circuited
    
    public static String selectionSort(int [] array){
        
        for(int i = 0; i < array.length; i++){
        int index = i;
        for(int j = i + 1; j < array.length; j++){
            if(array[j] < array[index]){
                index = j;
            }
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
    }
        return Arrays.toString(array);
        
}
    
    // Insertion sort
    // start at the second element of the array
    // compare each item with the item to its left
    // if smaller, move the item to its correct location
    
    // just like bubble Sort insertion sort runs at O(n^2)
    // much faster in certain cases
    
    
    public static void insertionSort(int [] A){
        int size = A.length;
        int partition;
        for(int i = 1; i < size; i++){
            partition = A[i];
            for(int j = i - 1; j >= 0 ; j--){
                if(A[j] >= partition){
                    swap(A, j + 1, j);
                }
                else{
                    break;
                }
                
            }
            System.out.println("Iteration : " + i);
            System.out.println(Arrays.toString(A));
            
        }
        System.out.println(Arrays.toString(A));
    } 
    private static int [] swap(int []A, int x1, int x2){
        int temp = A[x2];
        A[x2] = A[x1];
        A[x1] = temp;
        return A;
        
    }
    public static void ShitInsertion(int A[]){
        
        int i, key, j;
        for(i = 1; i < A.length; i ++){
            key = A[i];
            j = i - 1;
            
            while(j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j = j-1;
                System.out.println(Arrays.toString(A));
                key--;
                
            }
            A[j+1] = key;
            
            
        }
        System.out.print("Sorted : ");
        System.out.println(Arrays.toString(A));;
    }
    
    
    
    
    // merge sort
    // sorts an array by cutting it half, sorting the halves recursively and merging the sorted halves
    // dramatically faster than bubble, selection, and insertion
    
    //Divide and Conquer
    
    
    // merge sort runs in O(nlogn)
    
    
    public static void mergeSort( int [] array) {
         
        
        if( array.length < 2){
            return Arrays.toString(array);
        }
        
        int mid = array.length/2;
        
        int [] left = new int[mid];
        int [] right = new int [array.length - mid];
        
        for( int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for( int j = mid; j < array.length; j++){
            right[j] = array[j];
        }
        mergeSort(left);
        mergeSort(right);
        
        merge(array, left, right, mid, array.length - mid);
    }
    public static String merge( int [] array, int [] left, int [] right, int l, int r){
        
        int i = 0, j = 0, k = 0;
        
        while ( i < l && j < r){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < l){
            array[k++] = left[i++];
        }
        while(j < r){
            array[k++] = right[j++];
        }
        return String.format(Arrays.toString(array));
        
    }
}


