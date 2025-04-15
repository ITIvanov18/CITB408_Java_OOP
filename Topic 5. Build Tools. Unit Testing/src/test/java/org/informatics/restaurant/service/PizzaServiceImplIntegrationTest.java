package org.informatics.restaurant.service;

import org.informatics.restaurant.data.Pizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaServiceImplIntegrationTest {
    PizzaService pizzaService;

    @BeforeEach
    void setUp() {
        pizzaService = new PizzaServiceImpl();
    }

    @Test
    void whenTwoTotalPricesAreEqual_thenZeroReturned() {
        Pizza pizza1 = new Pizza("Marg", 15);
        Pizza pizza2 = new Pizza("Marg", 15);
        Pizza pizza3 = new Pizza("Marg", 20);
        Pizza pizza4 = new Pizza("Marg", 10);

        ArrayList<Pizza> pizzaList1 = new ArrayList<>();
        pizzaList1.add(pizza1);
        pizzaList1.add(pizza2);

        ArrayList<Pizza> pizzaList2 = new ArrayList<>();
        pizzaList2.add(pizza3);
        pizzaList2.add(pizza4);

        assertEquals(0, pizzaService.differenceTotalPrice(pizzaList1, pizzaList2));
    }
}
