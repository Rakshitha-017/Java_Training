
import java.util.*;
public class twistedPrime {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int mum = num;
        int count =1;
        for(int i =1 ;i<num/2 ;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        int res = 0;
        while(mum>0){
            int digit = mum %10;
            mum = mum /10;
            res = res*10+ digit;
        }
        int count1 =1;
        for(int i =1 ;i<res/2 ;i++){
            if(res%i==0){
                count1++;
            }
        }
        if(count ==2 && count1 ==2){
            System.out.println("It is a twisted prime number");
        }
        else{
            System.out.println("Not a twisted prime number");
        }

    }
}
