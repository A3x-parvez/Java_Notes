package lecture4;
import java.util.*;

public class table_of_a_num 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
    
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num+" X "+i+" = "+num*i);
        }
        sc.close();
    }
}
