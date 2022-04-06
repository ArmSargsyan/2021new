package override.override1;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Triangle is: ");
        return dim1 * dim2 / 2;
    }
}
