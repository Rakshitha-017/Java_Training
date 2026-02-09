public class prefectNumber {
    static boolean isPrefect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n = 28;
        if(isPrefect(n)){
            System.out.println(n+" is a prefect number");
        }else{
            System.out.println(n+" is not a prefect number");
        }
    }
}