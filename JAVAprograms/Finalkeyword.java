
class OneFinal{
        public  void  print_one(){
            System.out.println(" this is parent class");
        }
} 

class TwoFinal extends  OneFinal{
    public void print_two(){
        
        System.out.println("this is child class");   
        super.print_one();
    }
}

public class Finalkeyword{
    public static void main(String args[])
    {
            System.out.println("this is main class");
            TwoFinal T = new TwoFinal();
            T.print_two();
    }

}
