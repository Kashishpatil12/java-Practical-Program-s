import java.util.*;
public class DaysArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String [] days = new String[7];
        System.out.println("enter values : ");
        for(int i=0 ; i<7 ; i++)
        {
            days[i] = sc.nextLine();

        }
        System.out.println("all value is belowed ");
        for(String a : days){
            System.out.println(a + " ");
        }

    }
}
