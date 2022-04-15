
package yomommatranslator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author rileyoest
 */
public class YoMommaTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        Map<String, String> acronyms = new HashMap<>();
        
        File input = new File("acronyms.txt");
        
        Scanner scan = new Scanner(input);
        
        while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] splitted = line.split("\\t");
                acronyms.put(splitted[0].toLowerCase(), splitted[1].toLowerCase());
        }
        
        scan.close();
        
        System.out.println("Enter a sentence: ");
        
        Scanner cin = new Scanner(System.in).useDelimiter("\\n");
        String userInput = cin.next();
        
        String [] split = userInput.split("\\s+");
        
        String translate = "";
        
        for(String word: split){
            if(acronyms.containsKey(word.toLowerCase())){
                translate += acronyms.get(word.toLowerCase());
                translate += " ";
            }
            else{
                translate += word;
                translate += " ";
            }  
        }
        System.out.println(translate);
       
        
   
    }
}

    
