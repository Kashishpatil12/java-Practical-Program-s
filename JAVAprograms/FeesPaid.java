import java.util.Scanner;

interface FeesCollection{

        public void FeesPaid();

    
}
class VastralBranch implements FeesCollection{

    public void FeesPaid(){

        System.out.println(" -- Vastral Branch -- ");


    }

}
class RajendraParkBranch implements FeesCollection{

    public void FeesPaid(){

        System.out.println(" -- RajendraPark Branch -- ");
    }

}

public class FeesPaid {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


       System.out.println("enter option :  \n 1.Vatsral Branch \n 2.RajedraPark Branch " );
       int option = sc.nextInt();
        switch(option){

            case 1 :
                     VastralBranch P = new VastralBranch();
                     P.FeesPaid();
                     break;
            case 2 : 
                     RajendraParkBranch R = new RajendraParkBranch();
                     R.FeesPaid();
                     break;
            default : System.out.println("Inavalid input");
                    

        }
       
       
       
       

        
        

    }
}


