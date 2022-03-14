package com.example.pizza.service;

import com.example.pizza.classes.Pizza;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements IDao<Pizza> {
    List<Pizza> pizzas;
    private static PizzaService instance;

    public PizzaService() {
        this.pizzas = new ArrayList<>();
    }

    public static PizzaService getInstance() {
        if(instance == null)
            instance = new PizzaService();
        return instance;
    }

    @Override
    public boolean create(Pizza o) {
        return pizzas.add(o);
    }

    @Override
    public boolean update(Pizza o) {
        for(int i = 0; i < pizzas.size(); i++) {
            if(pizzas.get(i).getId() == o.getId()) {
                pizzas.remove(o);
                pizzas.add(o.getId(), o);
                return  true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Pizza o) {
        return pizzas.remove(o);
    }

    @Override
    public Pizza findById(int id) {
        for(int i = 0; i < pizzas.size(); i++) {
            if(pizzas.get(i).getId() == id) {
                return pizzas.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Pizza> findAll() {
        return pizzas;
    }
}
