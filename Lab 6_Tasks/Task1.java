class Counter {
    private int value;
    private int limit;

    public Counter(int limit) {
        this.limit = limit;
        value = 0;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        if (v < 0 || v >= limit)
            throw new IllegalArgumentException("Out of range");
        value = v;
    }
}

class DigitalTimer {
    private Counter hours;
    private Counter minutes;

    public DigitalTimer() {
        hours = new Counter(24);
        minutes = new Counter(60);
    }

    public DigitalTimer(int h, int m) {
        this();
        set(h, m);
    }

    public void tick() {
        minutes.increment();
        if (minutes.getValue() == 0)
            hours.increment();
    }

    public void set(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("Invalid time");
            return;
        }
        hours.setValue(h);
        minutes.setValue(m);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours.getValue(), minutes.getValue());
    }
}

public class Task1 {
    public static void main(String[] args) {
        DigitalTimer t = new DigitalTimer();
        System.out.println(t);          // 00:00

        t.set(23, 59);
        System.out.println(t);          // 23:59

        t.tick();
        System.out.println(t);          // 00:00

        DigitalTimer t2 = new DigitalTimer(7, 5);
        System.out.println(t2);         // 07:05
        t2.tick();
        System.out.println(t2);         // 07:06
    }
}