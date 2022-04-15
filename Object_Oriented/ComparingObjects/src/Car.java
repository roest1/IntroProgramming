package comparingobjects;

/**
 *
 * @author rileyoest
 */
public class Car implements Comparable<Car>{
    
    private String make;
    private int year;
    
    
    public Car(String make, int year){
        this.make = make;
        this.year = year;
    }
    
    public void printInfo(){
        System.out.printf("Make: %S\nYear: %d\n", make, year);
    }
    
    
    // compareTo method 
    // returns -1 if year < other.year
    // returns 0 if year == other.year
    // returns 1 if year > other.year
   
    
    
    // Sort based on year. If year is equal, sort based on make.
    
    public int compareTo(Car other) {
        if(Integer.compare(year, other.year) != 0){
           return Integer.compare(year, other.year);
        }
        else{
            return make.compareTo(other.make);
        }
        
    }
    
}
