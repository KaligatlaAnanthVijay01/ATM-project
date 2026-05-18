import java.util.*;
public class STOREDARRAY {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] Numbers=new int[5];
        for(int i=0;i<5;i++){
        System.out.println("Enter the Numbers:");
        Numbers[i]=sc.nextInt();
    }
        System.out.println("\n Stored data:");
        for(int i=0;i<5;i++){
            System.out.println(Numbers[i]);
        }
}
}