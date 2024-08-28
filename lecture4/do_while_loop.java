package lecture4;

public class do_while_loop 
{
    public static void main(String[] args) 
    {
      int i = 11;
      //it is a exit control loop.
      //it first execute then check the condition.
      //if the condition is false at starting then aslo it exexute 1 time.
      do {
        System.out.println(i);
        i++;
      } while (i<10);   
    }
}
