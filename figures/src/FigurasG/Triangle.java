package FigurasG;

public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * base;
    }

    @Override
    public double getPerimeter() {
        return 4 * base;
    }
}
