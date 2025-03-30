//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Figures.Figure;
import Figures.Triangle;
import Figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Figure figure;

        Triangle triangle = new Triangle(10, 6);
        System.out.println(triangle);

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle);

        figure = triangle;
        System.out.println(figure);

        figure = rectangle;
        System.out.println(figure);

        System.out.println(figure.totalArea(triangle, figure));
    }
}