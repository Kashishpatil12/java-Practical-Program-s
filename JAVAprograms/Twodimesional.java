import java.util.*;
public class Twodimesional {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

            int [][] a = new int[3][3];
            int i,j;
    
            System.out.println("enter elements : ");
            for(i=0; i<3 ; i++)
            {
                for(j=0 ;  j<3 ; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            } 
            for(i=0 ; i<3 ; i++){
            
                for(j=0 ; j<3; j++){
                    
                System.out.println(a[i][j]+"");
                System.out.println();
                }
            }

       
    }
}
