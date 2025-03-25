package Figures;

public abstract class Figure implements AreaCalculations {

    private double dim1;
    private double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public abstract double area();



    public double totalArea(Figure figure1, Figure figure2) {
        return figure1.area() + figure2.area();
    }

    @Override
    public String toString() {
        return "Figure{" +
                "dim1=" + dim1 +
                ", dim2=" + dim2 +
                '}';
    }
}
