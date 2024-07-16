import java.util.*;
public class months {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

           String [] month = new String[12];
           System.out.println("enter months name : ");
           for(int i=0 ; i<12 ; i++)
           {
                month[i] = sc.nextLine();
           } 
           System.out.println("all months display");
           for(String s : month)
           {
                System.out.println( s + "");
           }
    }
}
