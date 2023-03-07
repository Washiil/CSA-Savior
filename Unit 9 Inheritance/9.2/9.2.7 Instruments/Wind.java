public class Wind extends Instrument
{
    public boolean reed;
 
    public Wind(String name, String family, boolean reed ) {
        super(name, family);
        this.reed = reed;
    }
}