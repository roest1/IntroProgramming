package enumandinterfaces;

/**
 *
 * @author rileyoest
 */
public class EnumAndInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // sometimes you want a variable that can take on only a certain listed (enumerated) set of values
        // enums are implicitly public, static, and final
        
        
        
        //Interfaces
        //==================
        
        // interfaces are another way for achieving abstraction
        // methods declared in any interface are by defrault abstract ( only method signature - no body)
        // interfaces are all about capabilities
        
        // For Example: the Comparable interface means that the class has to implement the compareTo() method
        // An interface defines a contract which an implementing class must adhere to
        
        // we can't create an instance of interface
        // a class can implement more than one interface
        //a class that implements an interface must implement all the methods in that interface
        // all methods are public and abstract.
        // all fields are public static and final
        
        // extend one (base class) implement many ( subclasses/ interfaces)
        
        // popular interfaces:
        //----------------------
        //serializable, cloneable, readable, appendable, closeable, autocloseable,observable, iterable
        
        
        //create an object of the media class
        Media mediaFile = new Media();
        
        
        
    }
    
}
