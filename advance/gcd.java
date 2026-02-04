public class gcd {
    public static void main(String[] args) {
        int a = 18;
        int b = 36;
        int max = a>b? a:b;
        for (int i = max; i >=1; i--) {
            if (a % i == 0 && b % i == 0) {
                a = i;
                break;
            }
        }
        System.out.println("GCD is: " + a);
    }
}
