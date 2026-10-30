import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Obstacles {
    private ArrayList<int[]> list = new ArrayList<>();

    public void add(int x, int y) { list.add(new int[]{x, y}); }

    public boolean isHurdle(int x, int y) {
        for (int[] h : list)
            if (h[0] == x && h[1] == y) return true;
        return false;
    }
}

abstract class Walker {
    protected String name;
    protected int x = 0, y = 0;
    protected Obstacles obstacles;   // association

    public Walker(String name, Obstacles obstacles) {
        this.name = name;
        this.obstacles = obstacles;
    }

    protected abstract char nextMove();

    public void walk() {
        char d = nextMove();
        int nx = x, ny = y;
        if (d == 'v') ny--;
        else if (d == '^') ny++;
        else if (d == '<') nx--;
        else if (d == '>') nx++;

        if (obstacles.isHurdle(nx, ny))
            System.out.println(name + " encounters hurdle at [" + nx + ":" + ny + "]");
        else { x = nx; y = ny; }

        System.out.println(name + " is at " + x + ":" + y);
    }
}

class DirectedWalker extends Walker {
    private Scanner sc = new Scanner(System.in);

    public DirectedWalker(String name, Obstacles o) { super(name, o); }

    @Override
    protected char nextMove() {
        System.out.print(name + ": Where should i go now: ");
        return sc.next().charAt(0);
    }
}

class RandomWalker extends Walker {
    private Random r = new Random();

    public RandomWalker(String name, Obstacles o) { super(name, o); }

    @Override
    protected char nextMove() {
        return "v^<>".charAt(r.nextInt(4));
    }
}

public class Task2 {
    public static void main(String[] args) {
        Obstacles obs = new Obstacles();
        obs.add(1, 2);   // hurdle

        Walker ali = new DirectedWalker("Ali", obs);
        Walker hasan = new RandomWalker("Hasan", obs);

        System.out.println("Starting: Ali's Location is = 0:0   Hasan's Location is = 0:0");
        for (int i = 0; i < 5; i++) {
            ali.walk();
            hasan.walk();
            System.out.println();
        }
    }
}