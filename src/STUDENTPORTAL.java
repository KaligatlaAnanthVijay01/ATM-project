class Student03{

    private int id;
    private String name;
    private double cgpa;

    // Constructor
    Student03(int id, String name, double cgpa) {

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter
    public double getCgpa() {

        return cgpa;
    }

    // Setter
    public void setCgpa(double cgpa) {

        if(cgpa >= 0 && cgpa <= 10) {

            this.cgpa = cgpa;
        }
        else {

            System.out.println("Invalid CGPA");
        }
    }

    // Display
    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class STUDENTPORTAL {

    public static void main(String[] args) {

        Student03 s1 = new Student03(101, "Rahul", 8.5);

        s1.display();

        System.out.println("\nUpdating CGPA...");

        s1.setCgpa(9.1);

        s1.display();
    }
}