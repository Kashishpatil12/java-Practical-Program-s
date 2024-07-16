class Animal{
    
    void eat(){
            System.out.println("Eating...");
    }
}
class Dog extends Animal{
   
    void Bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Dog{

    void meow(){
        System.out.println("Meoewing...");
    }
} 
public class Hierarchicalinheri{

    public static void main(String args[]){

        Cat C = new Cat();
        C.meow();
        C.eat();
    }

}