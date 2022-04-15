
package hotelproject;

/**
 *
 * @author rileyoest
 */

// rooms need to be compared based on price lowest to highest

public class room implements Comparable<room>
{
    
    public int roomNo; // the room's number
    
    public double price; // the price of the room per night
   
    
    public room(int roomNum, double roomPrice)
    {
        roomNo = roomNum;
        
        price = roomPrice;
    }
    
    public void setPrice(double RoomPrice)
    {
        price = RoomPrice;
    }
    
    public String getRoomInfo()
    {
        return String.format("");
    }
    
    public int compareTo(room other)
    {
        return Double.compare(price, other.price);
    }
    
    
}
