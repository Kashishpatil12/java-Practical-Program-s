
public class Threadone {
    public static void main(String args[]){
        
        One A = new One();
        A.start();
       
        System.out.println("Start"); 
        for(int i=0 ; i<10 ; i++){
            System.out.println("print2 Main: " +i);
        }
        System.out.println("End");
   
    }
}
class One extends Thread{

    public void run(){
       
         for(int i=0 ; i<10; i++){
            System.out.println("print1 One : " +i);
        }
}










        

}
