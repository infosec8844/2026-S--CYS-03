class Student {
    private String name;
    private int rollno;
    public Student(String name, int age) {
        this.name = name;
        this.rollno = rollno;
    }

    private int Rollno;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getrollno() {
        return rollno;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    public class Info{
        public static void main(String [] args) {
            Student s1 = new Student("Tehreem",03);
            s1.setName("Tehreem");
            System.out.println(s1.getName());
            s1.setrollno(3);
            System.out.println(s1.getrollno());
        }
    }
}





