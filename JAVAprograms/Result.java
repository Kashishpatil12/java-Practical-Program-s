import java.util.*;

public class Result {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter c marks: ");
        int c = sc.nextInt();  
        System.out.println(" enter cpp marks: ");
        int cpp = sc.nextInt();
        System.out.println(" enter ds marks: ");
        int ds = sc.nextInt();
        System.out.println(" enter dbms marks: ");
        int dbms = sc.nextInt();
        System.out.println(" enter java marks: ");
        int java = sc.nextInt();

      int total = c + cpp + ds + dbms + java ;
      System.out.println("Total :"+total);
      
      int result = total / 5 ;

      System.out.println(" Grad :");
      if(result>80)
      {
        System.out.println(" A ");
      }
      else if(result>70)
      {
        System.out.println(" B ");
      }
      else if(result>60)
      {
        System.out.println(" C ");
      }
      else if(result>50)
      {
        System.out.println(" D ");
      }
      else 
      {
        System.out.println(" FAIL ");
      }

    }
}
