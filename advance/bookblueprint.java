public class bookblueprint {
    double price ;
    String author ;
    String title ;

    public bookblueprint(double p, String a, String t) {
        price = p;
        author = a;
        title = t;
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public bookblueprint(String t){
        title = t;
        System.out.println(title);
    }

    public bookblueprint(String a, String t){
        author = a;
        title = t;
        System.out.println(title);
        System.out.println(author);
    }
}
