public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    
    public Pinata(String type_candy, String type_colour, String type_shape)
    {
        candy = type_candy;
        color = type_colour;
        shape = type_shape;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    
    public Pinata(String type_colour, String type_shape)
    {
        candy = "hard candy";
        color = type_colour;
        shape = type_shape;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    
    public Pinata(String type_candy)
    {
        candy = type_candy;
        color = "rainbow";
        shape = "donkey";
    }
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}