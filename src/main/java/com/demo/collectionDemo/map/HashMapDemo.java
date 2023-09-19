//package com.demo.collectionDemo.map;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.*;
//
//class HashMapDemo {
//    public  static Map<Integer, Integer> map;
//
//    public static void main(String[] args) {
//        map = new HashMap<>();
////        Map.Entry
//    }
//}
///**
// * 遍历
// */
//class HashMapCircle {
//    Map<Integer, Integer> map = new HashMap<>();
//
//    @Test
//    void forEachTest(){
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println("key:" + entry.getKey() + ", value :" + entry.getValue());
//        }
//    }
//    @Test
//    void lambdaTest(){
//        map.forEach((key, value) -> {
//            System.out.println("key:" + key + ", value :" + value);
//        });
//    }
//    @Test
//    void StreamTest(){
//        map.entrySet().stream().forEach(entry -> {
//
//        });
//    }
//}
///**
// * 扩容
// */
