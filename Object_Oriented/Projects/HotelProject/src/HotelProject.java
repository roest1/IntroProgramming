package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hotel.java edited by Riley Oest
 * Submitted at 6:53 pm
 * @author amahmo4
 */
public class HotelProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Hotel> hotels = new ArrayList<>();         
        
        Hotel h1 = new Hotel("Hilton", 5);
        h1.setGoogleRating(4.1);
        
        h1.rooms.add(new singleRoom(101, 122.5, "Queen", true)); 
        h1.rooms.add(new singleRoom(102, 180.99, "King", true)); 
        h1.rooms.add(new singleRoom(203, 160.0, "Twin", false)); 
        h1.rooms.add(new suite(601, 400.5, 2, false)); 
        h1.rooms.add(new suite(602, 600.5, 3, true)); 
          
        Hotel h2 = new Hotel("Marriott", 4);
        h2.setGoogleRating(4.5);
        
        h2.rooms.add(new singleRoom(1001, 350, "Queen", false));
        h2.rooms.add(new singleRoom(1002, 377, "King", true)); 
        h2.rooms.add(new suite(3304, 1001, 2, true)); 
        h2.rooms.add(new suite(4304, 1500, 4, true)); 
        
        hotels.add(h1);
        hotels.add(h2);

        Collections.sort(hotels);
        
        System.out.println("----------------------------------------------------------");
        for(Hotel h: hotels)
        {
            System.out.println(h.getInfo());
            System.out.println("----------------------------------------------------------");
            h.listRooms();
            System.out.println("----------------------------------------------------------");
        
        }
        
    }
    
}