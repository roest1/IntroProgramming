package objects;

/**
 *
 * @author rileyoest
 */
public class Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Encapsulation is the process of concealing them implementation process
        
        // It is the grouping of subprograms that are logically related into a unit that can be separately compiled
        
        Student s1 = new Student("Riley", 899859039);
        s1.printInfo();
        
        // Principle of least privilege = members should be assigned the minimum accessibility needed for the program to work
        
        // in general, all data members of  a class should be declared private
        
        // a constructor is what is automatically called when an object is created and has the same name as the class. They never have return values.
        
        //Initializing instance variables = numbers are set to zero, booleans are set to false, object and arrays are set to null(no object is associated with the variable)
        
        // OOP is the art of decomposing a problem's world into well defined objects
        
        // Objects = each object is defined by a class. A class describes a set of objects with the same behavior
        
        
    }
    
}
