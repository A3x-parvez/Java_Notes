package lecture5;
import java.util.*;

public class floyds_triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();
        int num=1;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
        sc.close();
    }  
}

