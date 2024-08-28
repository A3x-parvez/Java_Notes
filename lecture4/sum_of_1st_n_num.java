package lecture4;
import java.util.*;

public class sum_of_1st_n_num 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
          sum=sum+i; 
        }
        System.out.println("The sum of 1 to "+num+" natural is = "+sum);
    }
}
