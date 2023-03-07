public class FoodTester {
    public static void main(String[] args) {
        Food iceCream = new Food("Ice Cream", 200);
        System.out.println(iceCream);
        System.out.println(iceCream.getName());

        HealthyFood spinach = new HealthyFood("Spinach", 23, "Vegetable", "Green");
        System.out.println(spinach);
        System.out.println(spinach.getGroup());

        Fruit apple = new Fruit("Apple", 95, "Red", true, "Vitamin C");
        System.out.println(apple);
        System.out.println(apple.isInSeason());
    }
}

/* OUTPUT:
Ice Cream has 200 calories
Spinach has 23 calories
Apple has 95 calories
*/