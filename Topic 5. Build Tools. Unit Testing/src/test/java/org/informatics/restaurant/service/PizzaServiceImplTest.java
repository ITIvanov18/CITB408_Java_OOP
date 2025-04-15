package org.informatics.restaurant.service;

import org.informatics.restaurant.data.Pizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class PizzaServiceImplTest {

    PizzaService pizzaService;
    Pizza pizza1;
    Pizza pizza2;

    @BeforeEach
    void setUp() {
        pizzaService = new PizzaServiceImpl();
        pizza1 = Mockito.mock(Pizza.class);
        pizza2 = Mockito.mock(Pizza.class);
    }

    @Test
    void whenFirstSellingPriceIsGreaterThanSecondSellingPrice_thenPositiveNumberReturned() {
        when(pizza1.getSellingPrice()).thenReturn(12.0);
        when(pizza2.getSellingPrice()).thenReturn(10.0);

        assertEquals(2, pizzaService.differenceSellingPrice(pizza1, pizza2));
    }

    @Test
    void whenSecondSellingPriceIsGreaterThanFirstSellingPrice_thenNegativeNumberReturned() {
        when(pizza1.getSellingPrice()).thenReturn(10.0);
        when(pizza2.getSellingPrice()).thenReturn(15.0);

        assertEquals(-5, pizzaService.differenceSellingPrice(pizza1, pizza2));
    }

    @Test
    void whenPricesArePositive_thenPositiveNumberReturned() {
        when(pizza1.getSellingPrice()).thenReturn(20.0);
        when(pizza2.getSellingPrice()).thenReturn(15.0);

        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        pizzas.add(pizza2);

        assertEquals(35, pizzaService.totalSellingPrice(pizzas));
    }

    @Test
    void whenTwoTotalPricesAreEqual_thenZeroReturned() {
        Pizza pizza3 = Mockito.mock(Pizza.class);
        Pizza pizza4 = Mockito.mock(Pizza.class);

        when(pizza1.getSellingPrice()).thenReturn(15.0);
        when(pizza2.getSellingPrice()).thenReturn(15.0);
        when(pizza3.getSellingPrice()).thenReturn(20.0);
        when(pizza4.getSellingPrice()).thenReturn(10.0);

        ArrayList<Pizza> pizzaList1 = new ArrayList<>();
        pizzaList1.add(pizza1);
        pizzaList1.add(pizza2);

        ArrayList<Pizza> pizzaList2 = new ArrayList<>();
        pizzaList2.add(pizza3);
        pizzaList2.add(pizza4);

        PizzaService pizzaServiceSpy = Mockito.spy(PizzaServiceImpl.class);
        Mockito.doReturn(30.0).when(pizzaServiceSpy).totalSellingPrice(any());
        Mockito.doReturn(30.0).when(pizzaServiceSpy).totalSellingPrice(any());


        assertEquals(0, pizzaServiceSpy.differenceTotalPrice(pizzaList1, pizzaList2));

    }
}