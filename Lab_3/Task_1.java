class Hi {
    void sayhi() {
        System.out.println("Hi");
    }

    void Name() {
        System.out.println("Name: Tehreem");
    }

    void RegNo() {
        System.out.println("RegNo: 2026-(S)-CYS-03");
    }

    void City() {
        System.out.println("City: Lahore");
    }
}

class Friends {
    void Ayesha() {
        System.out.println("Ayesha");
    }

    void Sara() {
        System.out.println("Sara");
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Hi h = new Hi();
        h.sayhi();
        h.Name();
        h.RegNo();
        h.City();

        Friends f = new Friends();
        f.Ayesha();
        f.Sara();
    }
}
