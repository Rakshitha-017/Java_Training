public class lcm {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int max = a > b ? a : b;
        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }
        System.out.println("LCM is: " + lcm);
    }
}
