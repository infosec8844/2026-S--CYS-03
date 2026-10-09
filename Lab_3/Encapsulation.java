class info {

    private String name;
    private int age;
    private long CNIC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCNIC() {
        return CNIC;
    }

    public void setCNIC(long CNIC) {
        this.CNIC = CNIC;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        info i = new info();
        i.setName("Tehreem");
        i.setAge(18);
        i.setCNIC(3650123456789L);
        System.out.println("Name: " + i.getName());
        System.out.println("Age: " + i.getAge());
        System.out.println("CNIC: " + i.getCNIC());
    }
}