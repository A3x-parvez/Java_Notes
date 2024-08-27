package lecture3;
import java.util.*;

public class switch_case 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button (1:hello,2:namaste,3:bonjor) : ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("Hello."); 
                   break;
            case 2: System.out.println("Namaste.");
                   break;
            case 3: System.out.println("Bonjor.");
                   break;
            default: System.out.println("Invalid button press.");
                break;
        }
        sc.close();
    }
}
