import java.util.*;
public class Funhello {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            hello();
            name();
            address();
            phone();
    }

    public static void hello()
    {
       System.out.println(" hello ");
       

    }
    public static void name()
    {
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter your name : ");
        String name =  sc.nextLine();
        System.out.println("your name : " + name);

    }
    
    public static void address()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your address : ");
        String address = sc.nextLine();
        System.out.println(" your addresss is  : " +address);
    }
    public static void phone()
    {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter your phone : ");
        int phone = sc.nextInt();
        System.out.println(" phone : " + phone);
    }
}

