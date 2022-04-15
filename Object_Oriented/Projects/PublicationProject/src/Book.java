
package publicationproject;

/**
 *
 * @author rileyoest
 */
public class Book extends Publication{
    
    protected String author;
    
    public Book(String author, String title, Genre genre, int edition, int year) {
        
        super(title, edition, year, genre);
        
        this.author = author;
        
    }
       
    @Override
    public void printInfo(){
        
        super.printInfo();
        
        System.out.println(genre + " book by " + author);
        
        super.printFooter();
        
    }
    
    
}
