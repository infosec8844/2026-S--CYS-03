public class JTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor 1: default
    public JTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Constructor 2: hour, minute, second
    public JTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor 3 (Task 1c): total seconds after 12 am
    public JTime(int totalSeconds) {
        totalSeconds = totalSeconds % 86400; // 24 hours = 86400 seconds
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Helper: convert this time to seconds
    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    // Task 1a: elapsed time in seconds between two timestamps
    public int elapsedSeconds(JTime other) {
        return Math.abs(this.toSeconds() - other.toSeconds());
    }

    // Task 1b: elapsed time as another timestamp
    public JTime elapsedTime(JTime other) {
        return new JTime(elapsedSeconds(other));
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Driver
    public static void main(String[] args) {
        JTime t1 = new JTime(10, 30, 15);
        JTime t2 = new JTime(12, 45, 50);

        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

        // Task 1a
        System.out.println("Elapsed seconds: " + t1.elapsedSeconds(t2));

        // Task 1b
        JTime diff = t1.elapsedTime(t2);
        System.out.println("Elapsed time: " + diff);

        // Task 1c
        JTime t3 = new JTime(3725);
        System.out.println("Time from 3725 seconds: " + t3);
    }
}