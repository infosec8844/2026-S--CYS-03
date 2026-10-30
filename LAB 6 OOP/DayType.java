import java.util.Scanner;

public class DayType {
    private static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private int day;

    public DayType(String d) { setDay(d); }

    public void setDay(String d) {
        for (int i = 0; i < 7; i++)
            if (DAYS[i].equalsIgnoreCase(d)) { day = i; return; }
        System.out.println("Invalid day!");
    }

    public void printDay(){
        System.out.println(DAYS[day]);
    }
    public String getDay(){
        return DAYS[day];
    }
    public String nextDay(){
        return DAYS[(day + 1) % 7];
    }
    public String previousDay(){
        return DAYS[(day + 6) % 7];
    }
    public String addDays(int n){
        return DAYS[((day + n) % 7 + 7) % 7];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day (Sun, Mon, Tue, Wed, Thu, Fri, Sat): ");
        DayType d = new DayType(sc.next());

        System.out.print("Current day: ");
        d.printDay();
        System.out.println("Return day: " + d.getDay());
        System.out.println("Next day: " + d.nextDay());
        System.out.println("Previous day: " + d.previousDay());

        System.out.print("Enter number of days to add: ");
        int n = sc.nextInt();
        System.out.println("Day after adding " + n + " days: " + d.addDays(n));
    }
}