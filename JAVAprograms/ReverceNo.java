
import java.util.*;
public class ReverceNo {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter a number :");
        int number = sc.nextInt();
        int ans=0,rem;
        while(number>0)
        {
             rem = number % 10;
             ans =  ans * 10 + rem ;
             number = number / 10;
        }
        System.out.println("reverce number : " +ans);

    }
}
