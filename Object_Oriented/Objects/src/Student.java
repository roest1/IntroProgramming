package objects;

/**
 *
 * @author rileyoest
 */
public class Student extends Objects {
    
    private String name;
    private int id;
    
    
    public Student(String name, int id){
        this.name = name;
        
        this.id = id;
    }
    
    public void printInfo(){
        System.out.printf("Student Name: %s\nStudent ID: %d\n", name, id);
    }

}
