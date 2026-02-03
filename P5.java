//Program to write all factors of given number

import java.util.*;
public class P5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int count =0;
        // System.out.println("Enter a number:");
        // int num = sc.nextInt();
        // System.out.println("Factors of the given number is :");
        // for(int i=1;i<=num;i++){
        //         if(num%i == 0){
        //             count ++;
        //             System.out.println(i);
        //         }
        // }
        // System.out.println("The number of factors are:" +count);
        
        //Different method for more efficiency 
        int count =1;
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Factors of the given number is :");
        for(int i=1;i<=num/2;i++){
                if(num%i == 0){
                    count ++;
                    System.out.println(i);
                }
        }
        System.out.println(num);
        System.out.println("The number of factors are:" +count);
        if(count ==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        
    }
    
}
