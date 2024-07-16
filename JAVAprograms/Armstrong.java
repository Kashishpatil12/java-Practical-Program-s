import java.util.*;

public class Armstrong {
    public static void main(String args[]){

        Scanner  sc = new Scanner(System.in);

        int number , rem , ans=0 , orno;
        System.out.println("enter number");
        number = sc.nextInt();
        orno = number;

        while(number>0)
        {
            rem = number % 10 ;
            ans = ans + (rem * rem * rem);
            number = number / 10 ;
        }
        if (ans == orno)
        {
            System.out.println("number is armstrong");

        }
        else 
        {
            System.out.println("number is not amrstrong");
        }


    }
}
