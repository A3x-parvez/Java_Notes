//Expression axb/a-b  , where a=10,b=5 , the ans should be 10 .
//There is two expression 1) int ans = a*b / a-b;
//                        2) int ans = (a*b) / (a-b);
// which will be correct.

package lecture2;

public class quiz1 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        
        int ans1 = a*b/a-b;
        int ans2 = (a*b)/(a-b);
        System.out.println("Ans 1 :"+ans1);
        System.out.println("Ans 2 :"+ans2);
        System.out.println("Ans 2 is correct so this is the right expression.");
    }
}
