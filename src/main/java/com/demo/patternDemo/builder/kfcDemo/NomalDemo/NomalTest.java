package com.demo.patternDemo.builder.kfcDemo.NomalDemo;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.meal.NonVegMeal;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.meal.VegMeal;

/**
 * 业务场景
 * 1、kfc有很多食品，比如汉堡(Burger)(装在纸盒中(Wrapper)）、冷饮(ColdDrink)(装在瓶子中(Bottle)）,
 * 汉堡有蔬菜汉堡(VegBurger)、鸡肉汉堡(ChickenBurger),
 * 冷饮有百事可乐(Pepsi)或者可口可乐(Coke)
 * 2、不同食物(Item)之间可以组合成不同的套餐(Meal)
 * 3、每种食物都有名字(name)、打包方式(Packing)、价格(price)
 * 4、现要求创建两个套餐VegMeal和NonVegMeal
 * 5、VegMeal包括蔬菜汉堡和可口可乐
 * 5、NonVegMeal包括鸡肉汉堡和百事可乐
 *
 * @author syh
 */
public class NomalTest {
    public static void main(String[] args) {
        NonVegMeal nonVegMeal = new NonVegMeal();
        VegMeal vegMeal = new VegMeal();
        System.out.println("nonVegMeal");
        nonVegMeal.show();
        System.out.println("vegMeal");
        vegMeal.show();
    }

}
