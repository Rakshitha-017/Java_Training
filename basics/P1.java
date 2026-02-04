package basics;
//Program to check temperature and print appropriate message

import java.util.Scanner;

public class P1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        int n = sc.nextInt();
        if (n<20){
            System.out.println("Cool");
        }
        else if(n > 30 && n<50){
            System.out.println("Hot");
        }
        else {
            System.out.println("More hot");
        }
    }
}