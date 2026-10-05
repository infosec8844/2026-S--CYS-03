import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        var total = minutes;
        var a = (total / 60)%24;
        var b = total / 60;
        int a2 = a  % 12;
        System.out.println("hours: " + a);
        System.out.println("remaining minutes :" + b);
        System.out.println(a2);
    }
}