public class Product {
    private String name;
    private int price;
    private int quantity;

    private static int totalProduct = 0;

    // Parameter-less constructor
    public Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        counter();
    }

    // Parameterized constructor
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        counter();
    }

    // Product ka data show karta hai
    public void getData() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Har naye object par total 1 se barhta hai
    public static void counter() {
        totalProduct++;
    }

    // Total products return karta hai
    public static int countProduct() {
        return totalProduct;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen", 20, 100);
        Product p3 = new Product("Book", 150, 50);
        Product p4 = new Product("Bag", 1200, 10);
        Product p5 = new Product("Bottle", 350, 25);

        p1.getData();
        p2.getData();
        p3.getData();
        p4.getData();
        p5.getData();

        System.out.println("Total Products: " + Product.countProduct());
    }
}