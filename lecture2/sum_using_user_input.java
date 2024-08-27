package lecture2;
import java.util.*;

public class sum_using_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take two number from user
        System.out.print("Enter number 1 :");
        int a = sc.nextInt();
        System.out.print("Enter number 2 :");
        int b = sc.nextInt();

        //add two number and store into sum veriable.
        int sum = a+b;

        System.out.println("The ans is : "+sum);
        sc.close();
    }
}
