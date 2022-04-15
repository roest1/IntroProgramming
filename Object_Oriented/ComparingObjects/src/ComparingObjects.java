package comparingobjects;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rileyoest
 */
public class ComparingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Comparable interface allows you to determine how your objects will be compared
        
        //Create an ArrayList to store Car objects in 
        ArrayList<Car> myCars = new ArrayList<>();
       
        //Add objects ( cars ) to your array list
        myCars.add(new Car("Chevy", 2020));
        myCars.add(new Car("Ford", 2020));
        myCars.add(new Car("Toyota", 2018));
     
        
        
        
        
        
                
        
       
        //Collections.sort(List) calls the object's compareTo() method
        
        Collections.sort(myCars);
        

        
        // when you call the compareTo method from an object and compare it to another object it is trying to tell you what object is first in order
        // If the object you called the method from is first in order, it will return -1
        // Likewise if the object that you told the method to compareTo comes first it will return 1
        
        
        // To print the cars in sorted order:
        
        for(Car c : myCars){
            c.printInfo();
           
        }
        
        // If elements of the list are numbers, Collections.Sort(List) sorts numerically
        // If elements of the list are Strings, Collections.Sort(List) sorts alphabetically
        // If elements of the list are objects, Collections.Sort(List) sorts based on the compareTo() method implementation
        
        
        int x = 5, y = 10;
        
        System.out.println(Integer.compare(x,y));
        System.out.println(Integer.compare(y,x));
        int z = 5;
        System.out.println(Integer.compare(x, z));
        
        // Comparing variables
        // ==========================
        
        // Integer.compare(a,b);
        // Double.compare(a,b);
        // str1.compareTo(str2);
        
    }
    
}
