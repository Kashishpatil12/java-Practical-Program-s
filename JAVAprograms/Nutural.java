import java.util.*;


public class Nutural {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value : ");
        int val = sc.nextInt();

        if(0<val)
        {
            System.out.println("positive number");

        }
        else if(val==0)
        {
            System.out.println("nutural number");
        }
        else 
        {
            System.out.println("negative number");
        }
    }
    

}

