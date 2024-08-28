package lecture5;
import java.util.*;

public class rotate_half_pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            for (int k = 0; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }  
}

