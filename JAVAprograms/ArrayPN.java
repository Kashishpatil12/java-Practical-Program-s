import java.util.*;


public class ArrayPN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int i;
       int [] number = new int[10];
       System.out.println("enter values :");
        for( i=0 ; i<10 ; i++)
        {
             number[i] = sc.nextInt();
        }

        if(number[i] < 0){
            for(i=0 ; i <number[i] ; i++){
                System.out.println("nagative numbers ***"+number[i]);
            }
        }
        else if(0 > number[i]){
           
            System.out.println(" Positive numbers ***"+number[i]);
        }
        else if(number[i] == 0){
            
            System.out.println("  zero ***"+number[i]);
        }
        else{
            System.out.println("try again");
        }
    
        
    
        
        
       

        
        
    }
}
