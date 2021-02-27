package ch04.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月26日 22:03:00
 * 一边遍历map 一边删除元素会怎样
 */
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("abc", "abc");
        map.put("abc2", "abc");
        map.put("abc3", "abc");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry);
            String key = entry.getKey();
//            java.util.ConcurrentModificationException
            map.remove(key);
        }
        System.out.println(map);


    }
}
