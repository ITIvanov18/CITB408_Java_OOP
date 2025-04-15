package org.informatics.restaurant.service;

import org.informatics.restaurant.data.Pizza;

import java.util.ArrayList;

public interface PizzaService {
    double differenceSellingPrice(Pizza pizza1, Pizza pizza2);

    double totalSellingPrice(ArrayList<Pizza> pizzas);

    double differenceTotalPrice(ArrayList<Pizza> pizzaList1, ArrayList<Pizza> pizzas);
}
