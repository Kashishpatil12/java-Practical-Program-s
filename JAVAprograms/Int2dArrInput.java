import java.util.*;

public class Int2dArrInput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int m,n,i,j;

        System.out.println("enter the numbers for row : ");
        //row input
        m = sc.nextInt();

        System.out.println("enter the numbers for col : ");
        //col input
        n= sc.nextInt();

        //declaring the two dimensinal matrix 
        int arry[][] = new int [m][n];

        //read the matrix values 
        System.out.println("enter the elements of the array :");

        //read the row
        for(i=0 ; i< m ; i++){
            //inner for the loop for column
            for(j=0; j<n ; j++){
                arry[i][j] = sc.nextInt();
            }
            
            //accending array elemnets 

            System.out.println("elemnets of the array are : ");

            for(j=0 ; j<n ; j++)
            {
                System.out.println(arry[i][j] +"");
                System.out.println("");
            }
        }
}
}