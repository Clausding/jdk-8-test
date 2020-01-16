package com.ding.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * hashmap特点：
 * 1.非同步
 * 2.允许键值为null
 * 3.不保证元素顺序
 */
public class HashMap_Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("双龙", "3");
        map.put("六约", "3");
        map.put("布吉", "3,5");
        map.put("少年宫", "3,4");
        map.put("景田", "2，9");
        map.put(null, "3");
        map.put("梧桐山", null);
        map.put(null, null);
        System.out.println("--------------遍历方式1----------------------------------------------------------------------");
        for (Map.Entry<String, String> e :map.entrySet()) {
            System.out.printf("%s--%s %n", e.getKey(), e.getValue());
        }
        System.out.println("--------------遍历方式2----------------------------------------------------------------------");
        Collection<String> c = map.values();
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.printf("--%s %n", value);
        }
    }
}
