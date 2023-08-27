package com.demo.collectionDemo.map;

import java.util.*;
import org.testng.annotations.Test;

public class HashMapDemo {
    Map<Integer, Integer> map = Map.of(1,1,2,2,3,3,4,4,5,5);

    /**
     *
     * @return
     */
    @Test
    void forEachTest(){
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + ", value :" + entry.getValue());
        }
    }
    @Test
    void lambdaTest(){
        map.forEach((key, value) -> {
            System.out.println("key:" + key + ", value :" + value);
        });
    }
    @Test
    void StreamTest(){
        map.entrySet().stream().forEach(key){
            
        };
    }
}
