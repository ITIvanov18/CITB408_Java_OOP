package org.informatics.triangle.service;

import org.informatics.triangle.data.Triangle;

import java.util.ArrayList;

public interface TriangleService {
    double perimeter(Triangle triangle);

    ArrayList<Double> listOfPerimeters(ArrayList<Triangle> triangles);

}
