package lecture2;
import java.util.*;
public class input {
    public static void main(String[] args) 
    {
     Scanner sc =new Scanner(System.in);
      //Input nultiple token or full line.
        String name2 = sc.nextLine();
      //Input single token or word.
        String name = sc.next();
      //Input integer .
        int num = sc.nextInt();
      //Input decimal number.
        float num2 = sc.nextFloat();

        //print all the input veriables.
        System.out.println(name);
        System.out.println(name2);
        System.out.println(num);
        System.out.println(num2);
    }
}
