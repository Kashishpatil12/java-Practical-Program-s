import java.util.*;
public class Productprice {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int totalprice, price;
        
        System.out.println("enter product price");
         price = sc.nextInt();
        totalprice = price ;
        
        while (totalprice<1000) {
            
            System.out.println("enter another product price :");
             price = sc.nextInt();
             totalprice = totalprice + price ;

        }
        System.out.println("thankyou for visiting ***");
        System.out.println("total price is  : "+ totalprice);

    }
}
