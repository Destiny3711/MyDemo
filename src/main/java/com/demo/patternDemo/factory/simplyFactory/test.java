package com.demo.patternDemo.factory.simplyFactory;

import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        //原始方法
        Course course = new Course();
        course.record();
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.record();

        //简单工厂
//        ICourse course2 = new CourseFactory().create("java");
//        course2.record();

        ICourse course2 = new CourseFactory().create(null);
        course2.record();

        //举例
        Calendar.getInstance();
//        LoggerFactory.getLogger();
    }
}
