

import java.util.*;
public class Or {
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values :");
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();

            if(val1==100  || val2==50)
            {
                System.out.println("Jackpot");
            }
            else{
                System.out.println("sorry try again");
            }




    }   
}
