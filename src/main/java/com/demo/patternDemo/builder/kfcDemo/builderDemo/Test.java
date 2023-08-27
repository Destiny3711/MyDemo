package com.demo.patternDemo.builder.kfcDemo.builderDemo;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.meal.Meal;

/**
 * 业务场景
 * 1、kfc有很多食品，比如汉堡(Burger)、冷饮(ColdDrink), 汉堡有蔬菜汉堡(VegBurger)、鸡肉汉堡(ChickenBurger),
 * 冷饮有百事可乐(Pepsi)或者可口可乐(Coke)
 * 2、不同食物(Item)之间可以组合成不同的套餐(Meal)
 * 3、每种食物都有名字(name)、包装(Packing)、价格(price)
 * 4、现要求创建两个套餐VegMeal和NonVegMeal
 * 5、VegMeal包括蔬菜汉堡和可口可乐
 * 5、NonVegMeal包括鸡肉汉堡和百事可乐
 *
 * @author syh
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("vegMeal");
        vegMeal.showItems();
        System.out.println("total cost ：" + vegMeal.getCost());
        System.out.println("nonVegMeal");
        nonVegMeal.showItems();
        System.out.println("total cost ：" + nonVegMeal.getCost());

    }
}
