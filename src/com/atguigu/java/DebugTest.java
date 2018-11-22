package com.atguigu.java;

import java.util.HashMap;

/**
 * @author ZYY
 * @data 2018/11/22 - 15:08
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","10");
        map.put("school","kmust");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println(age);//age.sout
        System.out.println("age = " + age);//soutv

        map.remove("major");
        System.out.println(map);
    }
}
