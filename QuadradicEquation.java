
package quadradicequation;
import java.util.*;

public class QuadradicEquation {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        System.out.println("a = ");
       int a = input.nextInt();
        System.out.println("b =");
        int b = input.nextInt();
        System.out.println("c = ");
        int c = input.nextInt();
        double result1 = (-b+Math.sqrt(b*b-(4*a*c)));
        double result2 = (-b-Math.sqrt(b*b-(4*a*c)));
        System.out.println("first answer is:"+result1);
        System.out.println("second answer is:"+result2);
    }
    
}
