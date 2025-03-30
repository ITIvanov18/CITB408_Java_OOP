package Figures;

public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return getDim1() * getDim2();
    }

}
