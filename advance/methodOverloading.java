public class methodOverloading {
    
    public static void main(String[] args) {
        System.out.println("The sum of two integers 5 and 10 is: " + sum(5, 10));
        System.out.println("The sum of three integers 5, 10 and 15 is: " + sum(5, 10, 15));
        System.out.println("The sum of two double values 5.5 and 10.5 is: " + sum(5.5, 10.5));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
