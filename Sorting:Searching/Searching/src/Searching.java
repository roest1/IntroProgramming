package searching;

/**
 *
 * @author rileyoest
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // linear search 
        // searches for a specific value in the array
        // iterates through all elements of the array
        // keeps track of index when the value is encountered
        int[] array = {2, 4, 7, 3, 8, 1, 8, 5};

        int key = 5;
        
        
       // System.out.println("Key found at index: " + Searching.linearSearch(array, key) + "from linear search");
        
        // binary search 
        // locates a value in a sorted array by determining whether the value occurs in the first or second half of the array
        // then repeating hte search in one of the halves
        // the size of the search is cut in half with each step
        
        System.out.println("Key found at index: " + Searching.binarySearch(array, key) + " from binary search ");
        
        // other algorithms:
        // encryption, decryption, compression, ptahfindings ( graph algroithms ) , machine learning, artificial intelligence, bioinformatics
        
        // categories
        // brute force, greedy, recursive, backtracking, divide and conquer, dynamic programming, randomised
        
        

    }
    
    
    // the slowest it will run or worst case scenario is O(n) time complexity
    
    public static int linearSearch(int [] array, int key){
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return  i;
    }
        }
        
            return -1;

}
    
    
    // binary search
    
    public static int binarySearch(int [] array, int key){
        int min = 0;
        int max = array.length -1;
    
        
        while(min <= max){
            int mid = (min + max)/2;
            
            if( array[mid] == key){
                return mid;
            }
            
            else if(array[mid] < key){
                min = mid +1;
            }
            else{
                max = mid - 1;
            }
            
            
        }
        return -1;
    }
    }

