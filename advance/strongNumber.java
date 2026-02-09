public class strongNumber {
    static boolean isStrong(int n){
        int sum = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n = 145;
        if(isStrong(n)){
            System.out.println(n+" is a strong number");
        }else{
            System.out.println(n+" is not a strong number");
        }
    }
}
