public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println("A rectangle with a width of " + rect1.getWidth() + " and a height of " + rect1.getHeight());
        System.out.println("A rectangle with a width of " + rect2.getWidth() + " and a height of " + rect2.getHeight());
        System.out.println("A rectangle with a width of " + rect3.getWidth() + " and a height of " + rect3.getHeight());
        // Print one true statement comparing rectangles
        System.out.println(rect1.equals(rect2));
        // Print one false statment comparing rectangles
        System.out.println(rect1.equals(rect3));
    }
}