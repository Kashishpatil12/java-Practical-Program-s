import java.util.*;



public class Vote {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("not eligible for vote ");
        }
        else if(age>18 && age<100)
        {
            System.out.println("eligible for vote ");
        }
        else 
        {
            System.out.println(" please take a rest ");
        }

    }
}
