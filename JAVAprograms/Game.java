import java.util.Scanner;


public class Game {
        
        public int Topupamt(int A){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your topup amount");
        int topup = sc.nextInt();

        A = A + topup ;       
        return A; 
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Totalamt=1500;
        int gameamt = 0;
        int N;
       
        do{
            System.out.println("your total amount is = " +Totalamt);
            System.out.println("_____________________________________________________");
            System.out.println(" -  Choose one Game - ");
            System.out.println(" 1. VollyBall Price   : 2500/-");
            System.out.println(" 2. CycleRace Price   : 1100 /-");
            System.out.println(" 3. Tennis Price      : 900 /-");
            System.out.println(" 4. Jumping Price     : 1500/-");
            System.out.println(" 5. Badminton Price   : 3000/-");
            System.out.println("_____________________________________________________");
            int ch = sc.nextInt();
            switch(ch){

            case 1 : System.out.println("______VollyBall______");
                      gameamt = 2500;    
                     break;
                
            case 2 : System.out.println("_____CycleRace_____");
                      gameamt = 1100;
                     break;
            
            case 3 : System.out.println("_______Teniss______");
                      gameamt = 900;
                     break;
            
            case 4 : System.out.println("_____Jumping______");
                      gameamt = 3000;
                     break;
            
            case 5 : System.out.println("______Badminton____");
                     gameamt = 3000;
                     break; 
            
            default : System.out.println("Invalid Input");
                     break;
        }
        
        if(Totalamt > gameamt){
            System.out.println("___________________________________________");
            Totalamt = Totalamt - gameamt;
            System.out.println("Your total amount is : " +Totalamt);
        }
        else{
            System.out.println("Please topup your amount");
            
            Game G = new Game();
            Totalamt = G.Topupamt(Totalamt);
            System.out.println("Your total amount is :" +Totalamt);
        
        }
        System.out.println("_____________________________________________________");
        System.out.println("Do you want to countinue this game ? If YES press '1' , If NO press 2");
        System.out.println("_____________________________________________________");
        N = sc.nextInt();
     }while(N == 1);

    }
}


   

   
   
   

   






