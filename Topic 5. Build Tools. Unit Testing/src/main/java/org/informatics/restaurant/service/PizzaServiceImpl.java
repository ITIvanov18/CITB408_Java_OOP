package org.informatics.restaurant.service;

import org.informatics.restaurant.data.Pizza;

import java.util.ArrayList;

public class PizzaServiceImpl implements PizzaService {
    @Override
    public double differenceSellingPrice(Pizza pizza1, Pizza pizza2) {
        return pizza1.getSellingPrice() - pizza2.getSellingPrice();
    }

    @Override
    public double totalSellingPrice(ArrayList<Pizza> pizzas) {
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.getSellingPrice();
        }
        return totalPrice;
    }

    public double differenceTotalPrice(ArrayList<Pizza> pizzaList1, ArrayList<Pizza> pizzaList2) {
        return totalSellingPrice(pizzaList1) - totalSellingPrice(pizzaList2);
    }


}
