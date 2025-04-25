package org.informatics.triangle.service;

import org.informatics.triangle.data.Triangle;

import java.util.ArrayList;

public class TriangleServiceImpl implements TriangleService {
    @Override
    public double perimeter(Triangle triangle) {
        if(triangle.getSide1() < 0 || triangle.getSide2() < 0 || triangle.getSide3() < 0) {
            throw new IllegalArgumentException();
        }
        return triangle.getSide1() +
                triangle.getSide2() +
                triangle.getSide3();
    }

    @Override
    public ArrayList<Double> listOfPerimeters(ArrayList<Triangle> triangles) {
        ArrayList<Double> perimeters = new ArrayList<>();    // 3 4 5 -> 12; 5 6 7 -> 18

        for(Triangle triangle : triangles) {
            perimeters.add(perimeter(triangle));
        }
        return perimeters;
    }
}
