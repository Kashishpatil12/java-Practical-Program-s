import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Logical {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b &&  a>c){
            System.out.println("a is grater than a and c : "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is grater than a and c :"+b);
        }
        else
        {
            System.out.println("try again");
        }
       


    }    
}
