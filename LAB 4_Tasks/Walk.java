import java.util.Random;
import java.util.Scanner;

class Walker {
    String name;
    int x = 0, y = 0;

    Walker(String name) {
        this.name = name;
    }

    void move(int dx, int dy) {
        int nx = x + dx, ny = y + dy;
        if ((nx == 1 && ny == 2) || (nx == 2 && ny == 0)) {   // obstacles
            System.out.println(name + " encounters hurdle at (" + nx + ":" + ny + ")");
        } else {
            x = nx;
            y = ny;
        }
        System.out.println(name + " is at = (" + x + " : " + y + ")");
    }
}

public class Walk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Walker ali = new Walker("Ali");
        Walker hasan = new Walker("Hasan");

        while (true) {
            System.out.print("Ali: Where should I go now (^ v < > or q): ");
            char c = input.next().charAt(0);
            if (c == 'q') break;

            ali.move(c == '<' ? -1 : c == '>' ? 1 : 0, c == '^' ? 1 : c == 'v' ? -1 : 0);

            int r = random.nextInt(4);
            hasan.move(r == 0 ? -1 : r == 1 ? 1 : 0, r == 2 ? 1 : r == 3 ? -1 : 0);
        }
    }
}