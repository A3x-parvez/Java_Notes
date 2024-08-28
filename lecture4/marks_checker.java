package lecture4;
import java.util.*;

public class marks_checker 
{
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        double marks=0;
        while (true) 
        {
            System.out.print("Enter the operation (1-take marks , 0-show marks/grade) :");
            int op = sc.nextInt();
            
            if(op==1 || op==0)
            {
                if((op ==0 && count==0) || op==1)
                {
                   int n=op;
                   do {
                      System.out.print("Enter the marks : ");
                      marks = sc.nextDouble();
                      count++;
                      op++;
                  } while (op<=1*n);
                }
                else if(op==0 && count!=0)
                {
                    if(marks >=90)
                    {
                        System.out.println("This is good");
                    }
                    else if(marks >=60 && marks <=89)
                    {
                        System.out.println("This is avarage.");
                    }
                    else if(marks >=0 && marks <=59)
                    {
                        System.out.println("Bellow avarage.");
                    }
                }
                
            }
            else
            {
                System.out.println("Invalid operations.");
            }
        }
    }
}
