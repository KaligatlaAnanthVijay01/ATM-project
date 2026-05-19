class Student {

    int id;
    String name;
    double cgpa;

    // Constructor
    Student(int id, String name, double cgpa) {

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method
    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);

        System.out.println("----------------");
    }
}

public class COLLEGE{

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 8.5);

        Student s2 = new Student(102, "Amit", 7.9);

        s1.display();

        s2.display();
    }
}