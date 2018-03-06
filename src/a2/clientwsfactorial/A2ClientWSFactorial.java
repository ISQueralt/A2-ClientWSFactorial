package a2.clientwsfactorial;

/**
 *
 * @author queralt
 */

public class A2ClientWSFactorial {
    public static void main(String[] args) {
        System.out.println("10! = " + fact(10));
        System.out.println("0! = " + fact(0));
        System.out.println("(-10)! = " + fact(-10));
    }

    private static int fact(int n) {
        factorial.Factorial_Service service = new factorial.Factorial_Service();
        factorial.Factorial port = service.getFactorialPort();
        return port.fact(n);
    }   
}