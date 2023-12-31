package com.demo.patternDemo.factory.simplyFactory;

public class CourseFactory {
//    public ICourse create(String className) {
        //方式1
//        if("java".equals(name)){
//            return new JavaCourse();
//        } else if ("python".equals(name)) {
//            return new PythonCourse();
//        }else {
//            return null;
//        }

        //方式2
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
