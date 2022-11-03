public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    
    public Dog(String fname, String dogBreed, boolean shots)
    {
        name = fname;
        breed = dogBreed;
        hasShots = shots;
    }
    
    public Dog(String fname, String dogBreed)
    {
        name = fname;
        breed = dogBreed;
        hasShots = false;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}