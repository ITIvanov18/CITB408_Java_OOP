package Figures;

public interface AreaCalculations {
    double area();

    default double totalArea(Figure figure1, Figure figure2){
        return figure1.area() + figure2.area();
    }
}