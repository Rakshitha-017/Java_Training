import java.util.*;
public class ascii {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        int ascii = asciii(ch);
        int ascii2 = ascii2(ch);
        System.out.println("The ASCII value of " +ch+ " is: " +ascii);
        System.out.println("The ASCII value of " +ch+ " is: " +ascii2);
    }
    static int asciii(char ch){
        return (int)ch;
    }
    static int ascii2(char ch){//implicit type casting
        return ch;
    }
}
