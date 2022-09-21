public class PizzaTester 
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Veggie", "Tomatoes, onions, olives", 12);
        Pizza pizza2 = new Pizza("Cheese", "Cheese", 15);
        Pizza pizza3 = new Pizza("Meat", "Pepperoni, sausage, bacon", 20);
    
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}