public class SnapShot
{
    public static void main(String[] args)
    {
        String[] arr = { "Welcome", "to", "the snap shot", "app!"};
    
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        System.out.println();
        
        arr[0] = "Upgrade";
        arr[3] = "premium app!";
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}