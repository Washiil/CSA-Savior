public class ClothingTester {
    public static void main(String[] args) {
        TShirt tshirt = new TShirt("Medium", "Red", "Cotton");
        System.out.println("TShirt size: " + tshirt.getSize());
        System.out.println("TShirt color: " + tshirt.getColor());
        System.out.println("TShirt fabric: " + tshirt.getFabric());

        Sweatshirt sweatshirt = new Sweatshirt("Large", "Black", true);
        System.out.println("Sweatshirt size: " + sweatshirt.getSize());
        System.out.println("Sweatshirt color: " + sweatshirt.getColor());
        System.out.println("Sweatshirt has hood: " + sweatshirt.hasHood());

        Jeans jeans = new Jeans("Small");
        System.out.println("Jeans size: " + jeans.getSize());
        System.out.println("Jeans color: " + jeans.getColor());
    }
}