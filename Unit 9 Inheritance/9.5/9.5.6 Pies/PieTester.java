import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        Pie pies[] = new Pie[3];
        
        PecanPie pecan = new PecanPie(8, "Chocolate");
        ApplePie apple = new ApplePie(6);
        Pie pie = new Pie("Rubarb", 12);
        
        pies[0] = pecan;
        pies[1] = apple;
        pies[2] = pie;
        
        System.out.println(pecan.getSlices() + " slice Pecan pie");
        System.out.println(apple.getSlices() + " slice Apple pie");
        System.out.println(pie.getSlices() + " slice Rubarb pie");
    }
}