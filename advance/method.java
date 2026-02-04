
import java.util.*;
public class method {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the two numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int mul = multiply(a,b);
       System.out.println("Multiplication of two numbers is :" +mul);
       
    }
       
    static int multiply(int a, int b){
        return a*b;
    }
    
}
