public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public boolean equals(Rectangle other) {
        if(this.width == other.getWidth() && this.height == other.getHeight()) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "A rectangle with a width of " + this.width + " and a height of " + this.height;
    }
}