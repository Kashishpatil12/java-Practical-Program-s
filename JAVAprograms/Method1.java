import java.util.*;
class Student
{
    int id;
    String name;

    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name : ");
        name = sc.nextLine();
        System.out.println("Enter student id : ");
        id =  sc.nextInt();
    }
    void setdata()
    {
        System.out.println("student name : "+name);
        System.out.println("id : "+id);
    }
}



public class Method1 {
    public static void main(String args[])
    {
        
        Student s1 =  new Student();
        s1.getdata();
        s1.setdata();
     }
}
