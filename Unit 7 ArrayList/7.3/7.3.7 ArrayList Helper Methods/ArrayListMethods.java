import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> array){
        for(double num : array) {
            System.out.println(num);
        }
   }
   
   public static void condense(ArrayList<Double> array)
   {
        int i = 0;
        while (i < array.size()) 
        {
           array.set(i, array.get(i) * array.get(i + 1));
           array.remove(i + 1);
           i++;
        }
    }

    public static void duplicate(ArrayList<Double> array)
    {
        int i = 0;
        int size = array.size();
        while(i < size)
        {
            array.add(array.get(i));
            i++;
        }
    }
}