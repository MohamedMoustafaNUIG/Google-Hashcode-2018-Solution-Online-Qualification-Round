import java.util.ArrayList;
public class Route
{
    
    private ArrayList<Ride> rides = new ArrayList();


    public Route()
    {
        
    }

    public Ride getRide(int input)
    {
          return rides.get(input);
    }
}
