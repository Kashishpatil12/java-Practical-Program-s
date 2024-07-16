
import java.util.*;
public class Funfactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int a, ans = 1;
        System.out.println(" please enter number for factorial : "); 
        a = sc.nextInt();
        while(a > 0 ){
                ans =  ans * a;
                a--; 
        }
        System.out.println(" the factorial value is " +ans);
        
        System.out.println(" please enter number for factorial  :");
        a = sc.nextInt();
            
             
            int f_ans =  factorial(a);
            System.out.println(" the factorial value is " + f_ans);
        }
        
        public static  int factorial(int no)
        {
            int ans = 1 ;
            for(int i = 1; i <=no ; i++)
            {
                ans =  ans * i ;
            }
            return ans ;
        }
}
