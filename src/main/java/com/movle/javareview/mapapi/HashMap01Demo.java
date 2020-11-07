package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName HashMap01Demo
 * @MethodDesc: HashMap存储自定义类型键值
 * @Author Movle
 * @Date 11/8/20 1:47 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class HashMap01Demo {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    /**
     * HashMap存储自定义类型键值
     *      key:Person类型-Person类必须重写hashCode方法与equals方法，以保证key唯一
     *      value:String类型-可以重复
     */
    private static void demo02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("张三",19),"北京");
        map.put(new Person("李四",22),"南京");
        map.put(new Person("王五",99),"重庆");
        map.put(new Person("赵六",38),"上海");
        map.put(new Person("张三",19),"天津");

        Set<Map.Entry<Person, String>> entrys = map.entrySet();
        for (Map.Entry<Person,String> en:entrys) {
            Person person = en.getKey();
            String value = en.getValue();
            System.out.println(person+"-->"+value);
        }


    }

    /**
     * HashMap存储自定义类型键值
     *      key：String类型 -String类型重写HashCode和equals方法，可以保证唯一
     *      value：Person类型 - value可以重复(同名同年龄的人视为同一个)
     */
    private static void demo01() {
        HashMap<String,Person> map = new HashMap<>();

        map.put("北京",new Person("张三",19));
        map.put("南京",new Person("李四",17));
        map.put("重庆",new Person("王五",22));
        map.put("上海",new Person("赵六",30));
        map.put("天津",new Person("胡八",18));

        Set<String> set = map.keySet();
        for (String s:set) {
            Person value = map.get(s);
            System.out.println(s+"-->"+value);
        }

    }
}
