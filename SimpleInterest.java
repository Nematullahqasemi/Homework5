import java.util.*;
public class SimpleInterest {

  
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in) ;
        System.out.println("please enter the principal");
        double principal = input.nextDouble();
        System.out.println("please enter the rate");
        double rate = input.nextDouble();
        System.out.println("please enter the time in year");
        double time = input.nextDouble();
        double simpleInterest =(principal*rate*time)/100;
        System.out.println(simpleInterest);
    
}
}