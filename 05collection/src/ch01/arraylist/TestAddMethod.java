package ch01.arraylist;

import java.util.ArrayList;

/**
 * 测试list的add方法
 * 复习add()带参数的重载方法
 */
public class TestAddMethod {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Hero("hero" + i));
        }
        System.out.println(arrayList);
//        此时的arrayList没有规定泛型，可以添加其他的封装数据类型，如String Integer
        arrayList.add(2, new Integer(3));
        arrayList.add(3, "str-abc");
        System.out.println(arrayList);

    }
 
}