package lecture5;
import java.util.*;

public class square_patten 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
