import java.util.Scanner;

import Mypackage.Students;
public class StuFun {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Student name : " );
        String N = sc.next();

        System.out.println("enter student id : ");
        int ID = sc.nextInt();
    
        
        Students S1 = new Students();
        S1.name(N);
        S1.id(ID);






        
        

    }
}
