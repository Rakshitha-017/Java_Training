//Write a program to check whether the given character is lower case or upper case
import java.util.*;
public class P2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character that has to be checked");
        char ch = sc. nextLine().charAt(0);
        int ascii = (int) ch;
        if( ascii >= 65 && ascii <= 90 ){
            System.out.println("Upper case");
        }
        else if (ascii >= 97 && ascii <= 122){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
}