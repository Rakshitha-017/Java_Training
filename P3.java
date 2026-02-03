//Program to check whether the given alphabet is vowel or not a vowel using switch and if-else statement

import java.util.*;
public class P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Aplhabet to be checked");
        
        char ch = sc.nextLine().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Not a vowel");

        char chh = sc.nextLine().charAt(0);
        switch(chh){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");

    }
}
}