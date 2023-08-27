package com.demo.patternDemo.builder.kfcDemo.builderDemo;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.food.ChickenBurger;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.food.Coke;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.food.Pepsi;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.food.VegBurger;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.meal.Meal;

/**
 * 创建套餐
 *
 * @author syh
 */

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
