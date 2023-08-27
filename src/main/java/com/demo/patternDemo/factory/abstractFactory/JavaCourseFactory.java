package com.demo.patternDemo.factory.abstractFactory;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }

    @Override
    public IBook sale() {
        return new JavaBook();
    }
}
