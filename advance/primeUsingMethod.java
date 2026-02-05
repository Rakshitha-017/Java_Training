import java.util.*;
public class primeUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime:");
        int num = sc.nextInt();
        prime(num);
    }
    static void prime(int n){
        int count =1;
        for(int i=1 ; i<=n/2 ;i++){
            if(n%i ==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
