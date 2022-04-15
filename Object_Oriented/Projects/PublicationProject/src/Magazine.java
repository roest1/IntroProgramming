
package publicationproject;

/**
 *
 * @author rileyoest
 */
public class Magazine extends Publication {
    
    protected String publisher;
  
    
    public Magazine(String publisher, String title, Genre genre, int edition, int year) {
        
        super(title, edition, year, genre);
        
        this.publisher = publisher;
     
    }
    
    
    @Override
    public void printInfo() {
        
        super.printInfo();
        
    
        
        System.out.println( genre + " magazine by " + publisher);
        
        super.printFooter();
        
                
    }
    
}
