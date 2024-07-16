import java.util.*;


public class Userpass {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your username and password : ");
        int username = sc.nextInt();
        int password = sc.nextInt();

        System.out.println("Enter your log in username and password : ");
        int log_user = sc.nextInt();
        int log_pass = sc.nextInt();

        if(username == log_user)
        {
            if(log_pass == password){
                System.out.println("Created account");
            }
            else{
                System.out.println("incorect password");
            }

        }
        else 
        {
            System.out.println("username is not found");

        }


    }
}
