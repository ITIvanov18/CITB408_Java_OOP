package org.informatics.triangle.service;

import org.informatics.triangle.data.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class TriangleServiceImplTest {
    TriangleService triangleService;
    Triangle triangle;

    @BeforeEach
    void setup() {
        triangleService = new TriangleServiceImpl();
        triangle = new Triangle(5, 6, 7);
    }

    @Test
    void whenAllSidesAreZero_thenReturnZero() {
        // given
        Triangle triangle = new Triangle(0, 0, 0);

        // then
        assertEquals(0, triangleService.perimeter(triangle));
    }

    @Test
    void whenAllSide1_5Side2_6Side3_7_thenReturn18(){
        // given
        Triangle triangle = new Triangle(5, 6, 7);

        // then
        assertEquals(18, triangleService.perimeter(triangle));
    }

    @Test
    void whenAllSidesToBePositive_thenReturnPositiveNumber() {
        // given
        Triangle triangle = new Triangle(5, 6, 7);

        // then
        assertEquals(true, triangleService.perimeter(triangle) > 0);
    }

    @Test
    void whenOneOfTheSidesIsNegative_thenIllegalArgumentExceptionIsThrown() {
        // given
        Triangle triangleWithNegativeSide = new Triangle(-1, 5, 6);

        // then
        assertThrows(IllegalArgumentException.class, () -> triangleService.perimeter(triangleWithNegativeSide));
    }

    @Test
    void whenTrianglesListIsEmpty_thenReturnEmptyList() {
        // given
        ArrayList<Triangle> triangles = new ArrayList<>();

        // then
        assertEquals(0, triangleService.listOfPerimeters(triangles).size());
    }

    @Test
    void whenTrianglesListIsNotEmpty_thenReturnListOfTriangles() {
        // given
        ArrayList<Triangle> triangles = new ArrayList<>();
        Triangle triangle1 = new Triangle(3, 4, 5);

        triangles.add(triangle1);
        triangles.add(triangle);

        // 12 18
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(12.0);
        expected.add(18.0);

        assertIterableEquals(expected, triangleService.listOfPerimeters(triangles));
    }
}