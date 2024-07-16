import java.util.*;
class Branch{
    
    int branch_id;
    String branch_name;
    Scanner sc= new Scanner(System.in);
    public static int globalInt =0 ;
    
public void getBranchDetail()
{
    System.out.println("Please enter BralinextLine %d Id : ".formatted(++globalInt));
    branch_id = Integer.parseInt(sc.nextLine());
    System.out.println("Please enter branch name : ");
    branch_name = sc.nextLine();
}
public void printBranchDetails()
{
    System.out.println(branch_id);
    System.out.println(branch_name);
}
}

public class Objarrayloop {
    public static void main (String args[]){

        Branch B[] = new Branch[3];

        for(int i=0 ; i<3 ; i++)
        {
            B[i] = new Branch();
            B[i].getBranchDetail();
        }
        System.out.println("---------output------------");
        for(int i = 0;  i<3 ; i++)
        {
            B[i].printBranchDetails();
        }
    }
}
