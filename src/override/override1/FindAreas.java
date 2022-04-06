package override.override1;

public class FindAreas {

    public static void main(String[] args) {
       // Figure f = new Figure(14, 12);
        Rectangle r = new Rectangle(13, 17);
        Triangle t = new Triangle(15, 11);
        Figure figref;

        figref = r;
        System.out.println("The area is: " + figref.area());
        figref = t;
        System.out.println("The area is: " + figref.area());
//        figref = f;
//        System.out.println("The area is: " + figref.area());

    }
}
