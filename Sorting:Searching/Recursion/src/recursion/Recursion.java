package recursion;

import java.util.Arrays;

/**
 *
 * @author rileyoest
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // recursion is when the same computation occurs repeatedly
        
        // recursive factorial method
        
        System.out.println(Recursion.factorial(5));
        
        //isPalindrome recursive method
        
        System.out.println(Recursion.isPalindrome("Do geese see God"));
        
        // recursive solutions book part of the stack memory every time a method is called
        
        // measure execution time with:
        
        long start = System.currentTimeMillis();
        Recursion.isPalindrome("abcdcbd");
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
        
        //in most cases iterative and recursive approaches have comparable efficiency
        
        // sometimes recursive solutions run much slower than iterative ones
        
        // recursion is usually easier to implement than iterative
        
        
        
        // Memory
        //=================================
        // stack memory contains primitive values that are specific to a method and references to objects that are in heap, referred from the method
        // variables in stack exist only as long type as the method that created them is running
        // if stack is full java throws java.lang.StackOverFlowError
        
        
        // heap memory contains java objects
        // heap may increase or decrease in size while the application runs
        // objects that are no longer used are cleared using garbage collection, thus making space for new objects
        
        
        
        
    }
    
    
    public static int factorial(int n){
        int factorial;
        if(n == 0){
            factorial = 1;
        }
        else{
            factorial = n*factorial(n-1); 
        }
        
        
        return factorial;
    }
    
    
    public static boolean isPalindrome(String input){
        
        input = input.replaceAll(" ", ""); //removes all white spaces from a sentence
        
        if(input.length() < 2){
            return true;
        }
        // Character.toLowerCase(char c); converts the letter at index c to lower case.
        else if(Character.toLowerCase(input.charAt(0)) == Character.toLowerCase(input.charAt(input.length()-1))){
            return isPalindrome(input.substring(1, input.length()-1));
        }
        else{
            return false;
        }
    }

        
        
        
    }

