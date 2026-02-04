package basics;
import java.util.*;
public class P6 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int mul =0;
        System.out.println("Enter the the number to be reversed:");
        int num = sc.nextInt();
        int mum = num;
        int res = 0;
        while(num>0){
            int digit = num %10;
            System.out.println("Extracted digit is:"+digit);
            res = res *10 + digit;
            num = num /10;
            count ++;
        }
        if(mum == res)
            System.out.println("The given number is Palindrome");
        else
            System.out.println("The given number is not plaindrome");
        System.out.println(res);
        System.out.println(count +" is the number of digits");
    }
}
