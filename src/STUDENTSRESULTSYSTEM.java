import java.util.*;
public class STUDENTSRESULTSYSTEM {
    public static double Average(int total,int subjects){
        return (double) total/subjects;
    }
    public static String FindGrade(double average){
        if(average>90){
            return "A";
        }else if(average>=75){
            return "B";
        }else if(average>=65){
            return "C";
        }else{
            return "Fail";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[4];
        int total=0;
        for(int i=0;i<4;i++){
            System.out.print("Enter the marks:");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        double average=Average(total,3);
        String grade=FindGrade(average);
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);


    }
}
