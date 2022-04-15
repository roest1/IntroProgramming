package publicationproject;

/**
 *
 * @author rileyoest
 */
enum Genre {
    SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT, THRILLER
}

public class Publication implements Comparable<Publication> {

    protected String title;

    protected int edition;

    protected int year;

    protected Genre genre;

    public Publication(String title, int edition, int year, Genre genre) {

        this.title = title;

        this.edition = edition;

        this.year = year;

        this.genre = genre;
    }

    public void printInfo() {

        System.out.println(title + " Edition (" + edition + ") published in " + year);
        
    }

    public void printFooter() {

        System.out.println("All rights reserved.\n--------------------");
        
    }

    // compares genre then title
    @Override
    public int compareTo(Publication other) {

        if (genre.name().compareTo(other.genre.name()) != 0) {

            return genre.name().compareTo(other.genre.name());
            
        } 
        else 
        {
            return title.compareToIgnoreCase(other.title);
        }
       
    }

}
