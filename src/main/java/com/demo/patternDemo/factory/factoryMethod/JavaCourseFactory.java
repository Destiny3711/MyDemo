package com.demo.patternDemo.factory.factoryMethod;

import org.springframework.beans.factory.BeanFactory;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
