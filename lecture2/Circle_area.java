package lecture2;
import java.util.*;
public class Circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //initilize the Pi value as constant
        final double PI = 3.14;

        //userinput the radius.
        System.out.print("Enter the Radious of the circle : ");
        double rad = sc.nextDouble();
         
        double area = PI * (rad * rad);
        System.out.println("The area of the circle is = "+area);
    }
}
