public class Methodoveriding {
                           
        public static void main(String args[]){

            car obj = new car();
            obj.run();
        }
}

class vehicle
{
    void run()
    {
        System.out.println("Vehicle is runing");
    }
}
class car extends vehicle
{
    void run()
    {
        System.out.println("car is runing");
    }
}
