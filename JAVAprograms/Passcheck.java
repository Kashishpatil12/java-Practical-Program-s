
import java.util.Scanner;
public class Passcheck {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       
        int username = 1234;
        int password = 1208 ;
        

        
            System.out.print("enter your log in username : ");
            int Loguser = sc.nextInt();
            System.out.print("enter your log in password : ");
            int Logpass = sc.nextInt();
           
            if(Loguser == username && Logpass == password){
                System.out.println("*** Log in Succesfully ");
            }
            else
            {
                int login;
               
                for(login = 0 ; login <3 ; login++){
                    System.out.print("Please Try Again *** ");
                    System.out.println("----------------------------");
                    System.out.print("enter username : " );
                    Loguser  = sc.nextInt();
                    System.out.print("enter password : ");
                    Logpass = sc.nextInt();
               
                if(Loguser == username && Logpass == password)
                 {
                     System.out.println("*** Log in succesfully ");
                     break;
                 }
                System.out.println();
             }
            if(login==3)
            {
                System.err.println("sorry you have entered login detail wrong many times");
                System.out.println("Please try again after 24 hours");
            }            
          }
        }
     }

