package com.demo.patternDemo.factory.abstractFactory;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
    @Override
    public IBook sale() {
        return new JavaBook();
    }
}
