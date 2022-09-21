public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website test = new Website("google", "com");
        Website test2 = new Website("youtube", "gov");
        Website test3 = new Website("washi", "dev", 1000000);
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
    }
}