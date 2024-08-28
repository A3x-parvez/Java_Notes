package lecture5;
import java.util.*;

public class _0_1_triangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();
        int num=1;
        for (int i = 0; i <=n; i++) 
        {
            for (int j = 0; j <=i; j++) 
            {
                if(num%2==0)
                {
                System.out.print("0 ");
                }
                else
                {
                System.out.print("1 ");
                }
                num++;
            }
            System.out.println("");
        }
        sc.close();
    }  
}


