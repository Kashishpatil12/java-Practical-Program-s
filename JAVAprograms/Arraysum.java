import java.util.*;
public class Arraysum {

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
             
            int [] a = new int[5];
            int [] b = new int[5];
            int [] c = new int[5];          
            System.out.print("enter value for a :");
            for(int i=0 ; i<5 ; i++)
            {
             a[i]   = sc.nextInt();
            }
            System.out.print("enter values for b : ");
            for(int i = 0 ; i<5 ; i++)
            {
                 b[i]   = sc.nextInt();
            }
            System.out.println("Answers : ");
            for(int i=0 ; i<5 ; i++)
            {
                c[i] = a[i] + b[i];
                System.out.println(+a[i]  +b[i] +c[i]);
            }


        }
}
