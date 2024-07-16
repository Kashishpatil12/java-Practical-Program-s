
import java.util.*;


public class Nestedif {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values: ");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        if(val1>val2){

            if(val1>val3){
                System.out.println("val1 is large than val3 " +val1 +val3);

            }
            else {
                System.out.println("val3 is large than val1 " +val3 +val1);
            }
        }
        else 
        {
            if(val2>val3){
                System.out.println("val2 is large than val3 " +val2 +val3);

            }
            else{
                System.out.println("val3 is large tha val2 " +val3 +val2);
            }
        }
    
    

    


    }    
}
