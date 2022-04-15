
package hotelproject;

/**
 *
 * @author rileyoest
 */
public class singleRoom extends room 
{
    
    public String bedType; // (Ex: Queen, King, Twin)
    
    public boolean smoking; // if smoking is allowed
    
    public singleRoom(int roomNo, double price, String bedType, boolean smoking)
    {
        
        super(roomNo, price);
        
        this.bedType = bedType;
        
        this.smoking = smoking;
        
    }
    
    @Override 
    public String getRoomInfo()
    {
        String info = "Room " + roomNo + "\t$" + price + "\t\t" + bedType + "\t\t";
        
        if(smoking)
        {
            return info + "Smoking" + "\n";
        }
        
        else
        {
            return info + "No Smoking" + "\n";
        }
        
                  
    }
    
}
