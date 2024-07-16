import java.util.*;
public class Userpassand{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int Username = 1208;
        int password = 3333;

        System.out.println("enter your username : ");
        int loguser = sc.nextInt();
        System.out.println("enter your password : ");
        int logpass = sc.nextInt();

        if(loguser==Username && logpass == password){

            System.out.println("Succesfully create your account ");
        }
        else{
            System.out.println("sorry try again");
        }
        

     


    }
}