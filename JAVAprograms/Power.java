import java.util.*;

public class Power
{
     static int power(int base , int exponent)
    {
        
        int power1 =1;
        // for( int i =1 ; i <= exponent;
        //power = power  * base ;
        // return power ;

        int i=1;
        while(i<=exponent)
        {
            
            power1 = power1 * base;
            i++;
        }
        return power1;

    }

public static void main(String args[]) {
    int base , exponent ;
    Scanner sc = new Scanner(System.in);
    
    System.out.print(" enter the base : ");
    base= sc.nextInt();
    
    System.out.print(" enter the exponent : ");
    exponent=sc.nextInt();

    int pow=power(base, exponent);
    System.out.println(base + " the power " +exponent + " is : " +pow);

}
}
