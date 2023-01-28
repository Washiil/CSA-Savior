public class Computer
{
    public boolean monitor;
    public double batteryLife;
    public int memory;
    public int screenSize;
    
    public int getMemory()
    {
        return this.memory;
    }
    
    public void setMemory(int memory)
    {
        this.memory = memory;
    }
    
    public int getScreenSize() {
        return this.screenSize;
    }
    
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}