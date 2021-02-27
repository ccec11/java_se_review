package ch04.map;

import ch01.arraylist.Hero;

import java.util.TreeMap;

/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月27日 04:55:00
 */
public class sortedmap {
    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<>();
        treemap.put("1", "第一个");
        treemap.put("2", "第2个");
        treemap.put("3", "第3个");
        treemap.put("4", "第4个");

        System.out.println(treemap);
        for (String key : treemap.keySet()) {
            System.out.println(key+":"+treemap.get(key));
        }
        System.out.println("treeMap保证有序");
    }
}
