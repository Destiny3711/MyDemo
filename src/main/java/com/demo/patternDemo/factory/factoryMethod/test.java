package com.demo.patternDemo.factory.factoryMethod;

public class test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
