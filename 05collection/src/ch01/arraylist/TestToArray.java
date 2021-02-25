package ch01.arraylist;

import java.util.ArrayList;

/**
 * 测试将封装ArrayList转换成数组[]
 * 注意：不传参的时候返回Object数组，
 * 传参的时候要穿一个完整的数组对象
 * 完整语法：new + 封装数据类型（或者基本数据类型） + []{}
 * 例如：new Hero[]{}  new Integer[]{}
 */
public class TestToArray {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(new Hero("hero" + i));
        }
        Hero specialHero = new Hero("special hero");
        list.add(specialHero);
        System.out.println(list);

        Hero[] heroes = (Hero[])list.toArray(new Hero[]{});
        System.out.println(heroes);

        for (Hero hero : heroes) {
            System.out.println(hero);
        }

    }
}