import java.util.*;
public class Factorial {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fac = 1;

        System.out.print("enter the number : ");
        int no = sc.nextInt();

        while(no>0)
        {
            fac = fac * no;
            System.out.println(no);
            no--;

        }
        System.out.print("no factorial is :"+fac);

    }
}
