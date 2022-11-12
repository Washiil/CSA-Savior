public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    

    // Put your methods here
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    
    public int getArea()
    {
        return width * height;
    }
    
    public int getPerimeter()
    {
        return (width * 2) + (height * 2);
    }

    
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}