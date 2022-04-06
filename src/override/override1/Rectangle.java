package override.override1;

public class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Rectangle is: ");
        return dim1*dim2;
    }
}
