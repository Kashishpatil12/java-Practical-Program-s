import java.util.Scanner;
public class Tryandcatch{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(" C language ");
        System.out.println(" C++ language ");

        System.out.println("enter no : ");
        int no = sc.nextInt();

        try{
            System.out.println(" Befor divide ");
            int a = no / 0 ;
            System.out.println(" After divide :  "+a);
        }
        catch(ArithmeticException e){
            System.out.println(" number is not divided by 0 ");
        }
        System.out.println(" Web development ");
        System.out.println(" Web designing ");
        


    }

}