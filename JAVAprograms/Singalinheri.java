class Animal{

    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal
{
    void Bark(){
        System.out.println("Barking...");
    }
}
public class Singalinheri{
    public static void main(String args[]){

        Dog d = new Dog();
        
        d.Bark();
        d.eat();
    }

}




