package lecture3;
import java.util.*;

public class calculator 
{
    public static void main(String[] args) 
    {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter 1st number :");
          double n1 = sc.nextDouble();
          System.out.print("Enter operator :");
          String op = sc.next();
          System.out.print("Enter 1st number :");
          double n2 = sc.nextDouble();

          switch (op) {
            case "+":System.out.println("Addition : "+(n1+n2));
            break;
            case "-":System.out.println("Subtraction : "+(n1-n2));
            break;
            case "*":System.out.println("Multiplication : "+(n1*n2));
            break;
            case "/":System.out.println("Division : "+(n1/n2));
            break;
            case "%":System.out.println("Modulo : "+(n1%n2));
            break;
            default: System.out.println("Invalid Expression.");
                break;
          }
        sc.close();
    }
}
