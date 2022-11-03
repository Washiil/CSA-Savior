public class DogTester
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Name", "Breed", true);
        Dog dog2 = new Dog("Name", "Breed");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}