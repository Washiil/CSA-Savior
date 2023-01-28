public class ComputerTester
{
    public static void main(String[] args)
    {
        Laptop macBook = new Laptop();
        macBook.setBatteryLife(8.5);
        macBook.setMemory(4);
        
        Desktop dell = new Desktop();
        dell.setScreenSize(18);
        
        Computer surface = new Computer();
        surface.setScreenSize(11);
        surface.setMemory(8);
        
        System.out.println(macBook.getBatteryLife());
        System.out.println(macBook.getMemory());
        System.out.println(dell.getScreenSize());
        System.out.println(surface.getScreenSize());
        System.out.println(surface.getMemory());
    }
}