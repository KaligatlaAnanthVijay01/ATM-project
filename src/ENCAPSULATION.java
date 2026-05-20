class USER {

    private String name;

    // Setter
    public void setName(String n) {

        name = n;
    }

    // Getter
    public String getName() {

        return name;
    }
}

public class ENCAPSULATION {

    public static void main(String[] args) {

        USER s1 = new USER();

        s1.setName("VIJAY");

        System.out.println(s1.getName());
    }
}