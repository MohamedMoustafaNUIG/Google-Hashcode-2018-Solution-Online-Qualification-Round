public class Ride
{
    private int id;
    private int startRow;
    private int startCol;
    private int endRow;
    private int endCol;
    private int startStep;
    private int endStep;

    public Ride()
    {
        id=0;
        startRow=0;
        startCol=0;
        endRow=0;
        endCol=0;
        startStep=0;
        endStep=0;
    }

    public void setId(int input)
    {
        id=input;
    }
    public int getId()
    {
        return id;
    }
    
    public void setStartRow(int input)
    {
        startRow=input;
    }
    public int getStartRow()
    {
        return startRow;
    }
    
    public void setStartCol(int input)
    {
        startCol=input;
    }
    public int getStartCol()
    {
        return startCol;
    }
    
    public void setEndRow(int input)
    {
        endRow=input;
    }
    public int getEndRow()
    {
        return endRow;
    }
    
    public void setEndCol(int input)
    {
        endCol=input;
    }
    public int getEndCol()
    {
        return endCol;
    }
    
    public void setStartStep(int input)
    {
        startStep=input;
    }
    public int getStartStep()
    {
        return startStep;
    }
    
    public void setEndStep(int input)
    {
        endStep=input;
    }
    public int getEndStep()
    {
        return endStep;
    }

}
