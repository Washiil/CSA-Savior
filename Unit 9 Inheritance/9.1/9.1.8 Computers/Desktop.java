public class Desktop extends Computer
{
    public int screenSize;
    
    public int getScreenSize()
    {
        return this.screenSize;
    }
    
    public void setScreenSize(int screenSize)
    {
        this.screenSize = screenSize;
    }
    
    public boolean hasMonitor()
    {
        return monitor;
    }
    
    public void setMonitor(boolean monitor)
    {
        this.monitor = monitor;
    }
}