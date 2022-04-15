package collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author rileyoest
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // a collection groups together elements and allows them to be retrieved later
        
        // Lists: a list is a collection that remembers the order of its elements
        // Two types of lists: ArrayList and LinkedList
        
        // LinkedList: consists of a number of nodes; each node has a reference to the next and the previous node
        // adding and removing elements in the middle of a linked list is efficient 
        // visiting elements of a linked list in sequential order is efficient
        // random access is not efficient
        // only adjacent nodes need to be updating when inserting and removing nodes
        
        // use LinkedList when you are concerned about the efficiency of insterting or removing elements
        
        // you rarely need element access in random order
        
//        LinkedList <Student> myStudents = new LinkedList<>();
//        
//        myStudents.add(new Student("Riley", 899859039));
//        //or
//        Student s1 = new Student("Michael" , 239480237);
//        myStudents.add(s1);
//        
//        myStudents.add(new Student("Ashton", 2309809));
//        
//        
//        myStudents.add(2, s1); //add elements at index 2
//        // or
//        myStudents.add(3, new Student("Bryan", 473872)); //add elements at index 3
//        
//        // add elemetns at the beginning of the list
//        myStudents.addFirst(new Student("Craig", 238947));
//        
//        // add elements at the end of the list
//        myStudents.addLast(new Student("Murphy", 329032));
//        
//        //myStudents.clear();// clears all elements in the list
//        
//        LinkedList <Student> lsuStudents = new LinkedList <>();
//        lsuStudents = (LinkedList) myStudents.clone();// creates the LinkedList named lsuStudents with the same elements as the LinkedList named myStudents
//        
//        
//        for(Student c: lsuStudents){
//            c.printInfo();
//        }
//        
//        for(Student s : myStudents){
//            s.printInfo();
//        }
        
        // implement the Comparable interface 
        // use Collections.sort(list)
        
        
        // ArrayList vs LinkedList
        // If there is a requirement of frequent addition and deletion, LinkedList is better
        // If there are more search operations, ArrayList is better
        
        
        
        
        // Maps
        //===================
        
        // maps allow you to associate elements from a key set with elements from a value collection
        // use a map when you want to look up objects by using a key ( translator)
        // two types of maps: HashMap and TreeMap
        
        // TreeMaps
        
//        TreeMap<String,String> translator = new TreeMap<>();// keys have to be unique
//        translator.put("anaranjado", "orange");
//        //treemaps order items by key 
//        
//        for(String key: translator.keySet()){ // iterates through entire map
//            String value = translator.get(key);
//            System.out.println(key + " in english is " + value);
//        }
//         // in case of objects implement the Comparable interface
//         
//         // elements are ordered in alphabetical order by key
//         
//         
//         
//         //HashMaps
//         
//         HashMap<String,String> transltr = new HashMap<>(); // keys have to be unique
//        
//        transltr.put("azul", "blue");
//        
//        for( String key: transltr.keySet()){ //iterates through entire map
//            String val = transltr.get(key);
//            System.out.println(key + " in english is " + val);
//        }
        
        
        // items are ordered based on a hashcode
        
        
        
        
        // Stacks 
        //==============
        
        // stacks let you insert and remove elements only at one end
        // Last in, First out
        
        Stack<String> s = new Stack<>();// diamond syntax
        s.push("alpha");
        s.push("beta");
        s.push("gamma");
        
        System.out.println(s.peek());// shows top of stack ( gamma )
        
        
        while(s.size() > 0){
            System.out.println(s.pop()); // removes from stack in order LIFO and prints to console
        }
        
        s.push("zeta");
        System.out.println(s.peek()); // shows top of stack ( zeta ) 
        
        // stack operations:
        // push = add an element to top
        // pop = remove top element
        // peek = examine top element
        
        // applications ( undo button )
        
        // queues
        // ===================
        
        // add items to one end ( the tai) and remove them from the other end ( the head)
        // First in, First out
        
        // add, remove peek methods
        
        Queue<String> q = new LinkedList<>();
        
        // priority queue is a specdial type of queue wherein all the elements are orders as per their natural ordering or based on a custom Comparator supplied at the time of creation
        // in case of objects, implement the Comparable interface
        
        
        
        
        // how to choose a collection
        // 1 determine how you access the values
        // 2 determine the element types of key/value types
        // 3 determine whether element or key order matters
        // 4 for a collection, determine which operations must be efficient
        
        
        
        
        
    }
    
}
