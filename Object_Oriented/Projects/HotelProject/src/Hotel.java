package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Prof: Dr. Mahmoud
 * Submit time: 6:15 pm
 * @author rileyoest
 */
public class Hotel implements Comparable<Hotel> {

    private String name;
    
    private int stars;
    
    private double googleRating;
    
    private double averageRoomPrice;
    

    public Hotel(String name, int stars) {
        
        this.name = name;
        
        this.stars = stars;

    }

    public void setGoogleRating(double rating) {
        
        googleRating = rating;

    }

    public void setRoomPrice(double price) {
        
        averageRoomPrice = price;
        
    }

    public String getInfo() {
        
        return String.format("%-10s%8d%8s%.2f%8.2f", name, stars, "$", getAverageRoomPrice(), googleRating);

    }

    public int compareTo(Hotel other) {
        
        if (Double.compare(averageRoomPrice, other.averageRoomPrice) != 0) 
        {
            return Double.compare(averageRoomPrice, other.averageRoomPrice);
        } 
        
        else if (Integer.compare(stars, other.stars) != 0) 
        {
            return Integer.compare(stars, other.stars) * -1;
        } 
        
        else 
        {
            return Double.compare(googleRating, other.googleRating) * -1;
        }

    }
    
    ArrayList<room> rooms = new ArrayList<>();  

    public double getAverageRoomPrice()
    {
        double averageRoomPrice = 0;
        
        for(room r: rooms)
        {
            averageRoomPrice += r.price;
        }
        return averageRoomPrice/rooms.size();
    }
    
    public void addRoom(room r)
    { 
        rooms.add(r);
    }
    
    public void listRooms()
    {
        Collections.sort(rooms);
        for(room c: rooms)
            
            System.out.println(c.getRoomInfo());
        
        
    }
}


