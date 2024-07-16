import java.util.Scanner;

class Student{
    
    int id;
    String name;
    int phone;
}

public class Candidateobj {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        Student c1 = new  Student();
        
        System.out.print("Enter the frist candidate's name : \n");
        c1.name = sc.nextLine();
        System.out.print("Enter the first candidate's id : \n");
        c1.id = sc.nextInt();
        System.out.print("Enter the frist candidate's phone number : \n");
        c1.phone = sc.nextInt();

        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.phone);
    }
}
