import java.util.*;
public class Arraydiv {
    
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            int [] array = new int[10];
          

            System.out.println("Enter a values : ");
           for(int i = 1 ;  i<10 ; i++)
            {
                array[i] = sc.nextInt();
            }   
            
            for( int i =1  ; i<10 ; i++){

                     if(array[i] % 7 == 0)
                     {
                         System.out.println(" val : "+array[i]);
                     } 
                     else {

                     }                
            }        
           
            


        }

}
