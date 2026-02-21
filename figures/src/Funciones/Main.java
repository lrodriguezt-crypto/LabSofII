package Funciones;
import FigurasG.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figure f1 = new Circle(1.0);
        Figure f2 = new Square(2.3);
        Figure f3 = new Triangle(4.2, 4.5);

        List<Figure> figuras = new ArrayList<>();
        figuras.add(f1);
        figuras.add(f2);
        figuras.add(f3);

        for (Figure f : figuras) {
            System.out.println("Area: " + f.calculateArea());
            System.out.println("Perimetro: " + f.getPerimeter());
            System.out.println("----------------");
        }
    }
}