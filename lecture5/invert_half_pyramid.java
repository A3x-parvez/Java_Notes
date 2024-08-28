package lecture5;
import java.util.*;

public class invert_half_pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();

        for (int i = n; i >=0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }  
}

