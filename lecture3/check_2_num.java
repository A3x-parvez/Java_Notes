package lecture3;
import java.util.*;

public class check_2_num 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int n2=sc.nextInt();

        if (n1==n2)
        {
            System.out.println("Two numbers are Equal.");
        }
        else if(n1>n2)
        {
            System.out.println("First number is Grater.");
        }
        else
        {
            System.out.println("Second number is Grater.");
        }

        sc.close();
    }
}
