public class largest {
    public static void main(String[] args) {
        int a=10,b=5,c=6;
        int d = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("The largest number is: " + d);
    }
}
