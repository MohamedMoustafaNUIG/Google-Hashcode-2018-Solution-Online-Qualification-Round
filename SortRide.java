import java.util.*;
public class SortRide implements Comparator<Ride>
{
    
    public int compare(Ride a, Ride b){
        if(a.equals(b)){return 0;}
        
        if(a.getStartStep()>b.getStartStep()){return 1;}
        if(a.getStartStep()<b.getStartStep()){return -1;}
        
        if(a.getEndStep()>b.getEndStep()){return 1;}
        
        return -1;
    }
}
