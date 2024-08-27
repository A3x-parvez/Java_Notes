//print the table of a nubler without using loops
package lecture2;
import java.util.*;
public class table_of_a_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input the number.
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //print the multiplication table
        System.out.println("The Table of "+num+":");

        System.out.println(num+" X "+1+" = "+num*1);
        System.out.println(num+" X "+2+" = "+num*2);
        System.out.println(num+" X "+3+" = "+num*3);
        System.out.println(num+" X "+4+" = "+num*4);
        System.out.println(num+" X "+5+" = "+num*5);
        System.out.println(num+" X "+6+" = "+num*6);
        System.out.println(num+" X "+7+" = "+num*7);
        System.out.println(num+" X "+8+" = "+num*8);
        System.out.println(num+" X "+9+" = "+num*9);
        System.out.println(num+" X "+10+" = "+num*10);
    }
}
