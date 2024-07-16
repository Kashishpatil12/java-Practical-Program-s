import java.util.*;
public class Sumswitch {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter val1 : ");
        int val1 = sc.nextInt();
        System.out.println("enter val2 : ");
        int val2 = sc.nextInt();

        System.out.println("Enter your option : \n 1 - add \n 2 - mul \n 3 -div \n 4 - sup");
        int option = sc.nextInt();
        int ans ;
        
        switch(option)
        {

                case 1 : ans = val1 + val2;
                        System.out.println("add = "+ans);
                        break;

                case 2 : ans = val1 * val2 ;
                         System.out.println("mul = "+ans);
                         break;
                
                case 3 :
                        ans = val1 / val2 ;
                        System.out.println("div = "+ans);
                        break;

                case 4 :
                        ans = val1 - val2 ;
                        System.out.println("sup = "+ans);
                        break;
              
                default :    System.out.println("Please try again");
        
        }

    }
}
