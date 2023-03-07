public class Instrument
{
    public String name;
    public String family;
    
    public Instrument(String name, String family) {
        this.name = name;
        this.family = family;
    }
    
    public String getFamily() {
        return this.family;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + " is a member of the " + this.family + " family.";
    }
}