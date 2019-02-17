import java.io.*;
import java.util.*;

public class World
{
    private int gridRow;
    private int gridCol;
    private int vehicleNum;
    private int rideNum;
    private int bonus;
    private int steps;
    ArrayList <Ride> rides = new ArrayList();
    ArrayList <Vehicle> vehicles = new ArrayList();
    public static void main(String[] args)
    {
        
    }
    
    public World()
    {
        populateRides();
        printList();
    }
    
    public void populateRides()
    {
            try {
                    BufferedReader br = new BufferedReader(new FileReader("C:/Users/.../input.txt")) ;//replace with appropriate directory
                    String thisLine=null;
                    String thisInt=null;
                    thisLine = br.readLine();
                    String[] s = thisLine.split(" ");
                    gridRow=Integer.parseInt(s[0]);
                    gridCol=Integer.parseInt(s[1]);
                    vehicleNum=Integer.parseInt(s[2]);
                    rideNum=Integer.parseInt(s[3]);
                    bonus=Integer.parseInt(s[4]);
                    steps=Integer.parseInt(s[5]);
                    int id = 0;
                    while ((thisLine = br.readLine()) != null) {
                        s = thisLine.split(" ");
                        Ride ride = new Ride();
                        ride.setId(id);
                        ride.setStartRow(Integer.parseInt(s[0]));
                        ride.setStartCol(Integer.parseInt(s[1]));
                        ride.setEndRow(Integer.parseInt(s[2]));
                        ride.setEndCol(Integer.parseInt(s[3]));
                        ride.setStartStep(Integer.parseInt(s[4]));
                        ride.setEndStep(Integer.parseInt(s[5]));
                        rides.add(ride);
                        id++;
                    }       
                }
                catch (FileNotFoundException e){
                        System.out.println(e);
                    }
                    catch (IOException e){
                        System.out.println(e);
                    }
         
         
    }
    
    public void printList()
    {
        for(Ride temp : rides)
        {
            System.out.print(temp.getStartRow()+" ");
            System.out.print(temp.getStartCol()+" ");
            System.out.print(temp.getEndRow()+" ");
            System.out.print(temp.getEndCol()+" ");
            System.out.print(temp.getStartStep()+" ");
            System.out.print(temp.getEndStep()+" \n");
        }
    }
}
