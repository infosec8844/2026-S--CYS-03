import java.util.Scanner;

public class Walls {
    private String flavor;
    private int scoops;
    private String cone;
    private int price;

    // Default constructor
    public Walls() {
        this("Vanilla", 1, "Sugar");
    }

    // Parameterized constructor
    public Walls(String flavor, int scoops, String cone) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.cone = cone;
        price = scoops * 75;
        if (cone.equals("Waffle"))
            price += 40;
    }

    public void display() {
        System.out.println("\n--- Your Order ---");
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Cone: " + cone);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Flavors: 1.Chocolate 2.Vanilla 3.Strawberry 4.Mango 5.Tutti Fruit 6.Almond Crunch 7.Coffee");
        System.out.print("Choose flavor (1-7): ");
        int f = sc.nextInt();
        String flavor;
        switch (f) {
            case 1: flavor = "Chocolate"; break;
            case 2: flavor = "Vanilla"; break;
            case 3: flavor = "Strawberry"; break;
            case 4: flavor = "Mango"; break;
            case 5: flavor = "Tutti Fruit"; break;
            case 6: flavor = "Almond Crunch"; break;
            case 7: flavor = "Coffee"; break;
            default: flavor = "Vanilla"; System.out.println("Invalid, using Vanilla.");
        }

        System.out.print("Number of scoops: ");
        int scoops = sc.nextInt();

        System.out.print("Cone type (1.Sugar 2.Waffle): ");
        int c = sc.nextInt();
        String cone = (c == 2) ? "Waffle" : "Sugar";

        Walls order = new Walls(flavor, scoops, cone);
        order.display();
    }
}