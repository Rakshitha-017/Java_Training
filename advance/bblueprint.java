public class bblueprint {
    int x;
    int y;
    bblueprint(int a , int b){
        x = a;
        y = b;
    }
    void display(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    public static void main(String[] args) {
        bblueprint obj = new bblueprint(10,20);
        obj.display();
    }
    
}
