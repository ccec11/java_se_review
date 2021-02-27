package ch04.map;

import java.util.HashMap;
import java.util.Map;

import ch01.arraylist.Hero;
/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月27日 04:47:00
 */
public class hashmap2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("adc", "ad主要输出英雄");
        hashMap.put("apc", "ap主要输出英雄");
        hashMap.put("tank", "坦克英雄");
        System.out.println(hashMap);
        System.out.println(hashMap.get("tank"));

        HashMap<String, Hero> heroMap = new HashMap<>();
        Hero garren = new Hero("老版本盖伦garren");
        heroMap.put("garren", garren);
        System.out.println(heroMap);
        heroMap.put("garren", new Hero("新版本盖伦"));//成功覆盖
        System.out.println(heroMap);

        heroMap.clear();
        System.out.println("after clear() the map is empty");
        System.out.println(heroMap);

        heroMap.put("hero1", garren);
        heroMap.put("hero2", garren);
        heroMap.put("hero3", garren);
        heroMap.put("hero4", garren);
        heroMap.put("hero5", garren);
        heroMap.put("hero6", garren);
        System.out.println("key不同，value可以是同一个对象"+"hashmap不保证有序"+
                "\n"+heroMap);
        for (Map.Entry<String, Hero> stringHeroEntry : heroMap.entrySet()) {
            System.out.println(stringHeroEntry);
        }



    }
}
