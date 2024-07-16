import java.util.*;
public class Recursion {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending digit numbers : ");
        int l_digit = sc.nextInt();

        int result = sum(l_digit);
        System.out.println(result);
    }
    public static int sum(int k){
        if(k > 0 ){
            return k + sum (k - 1);

        }
        else{
            return 0; 
        }
    }
}
