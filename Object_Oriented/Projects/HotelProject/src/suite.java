
package hotelproject;

/**
 *
 * @author rileyoest
 */
public class suite extends room
{
    public int numRoom; // number of rooms in the suite
    
    public boolean hasKitchen; // if suite comes with a kitchen
    
    public suite(int roomNo, double price, int numRoom, boolean hasKitchen)
    {
        super(roomNo, price);
        
        this.numRoom = numRoom;
        
        this.hasKitchen = hasKitchen;
        
    }
    
    @Override 
    public String getRoomInfo()
    {
        String info = "Suite " + roomNo + "\t$" + price + "\t\t" + numRoom + " rooms" + "\t\t";
        
        if(hasKitchen)
        {
            return info + "Kitchen" + "\n";
        }
        
        else
        {
            return info + "No Kitchen" + "\n";
        }
        
                  
    }
    
}
