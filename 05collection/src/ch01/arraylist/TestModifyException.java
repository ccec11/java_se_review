package ch01.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月26日 22:07:00
 */
public class TestModifyException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(5);//只想移除 index=5的元素 但是吧后面的那些都删除了
            list.remove(integer);
        }

        System.out.println(list);//[0, 1, 2, 3, 4]
//很奇怪的是 它不抛出异常，但是把从5往后的元素到删除掉了
//我认为是多线程 多个线程进入了
//第一个线程进入之后 删除了第5号元素
//之后下一个线程进来了 5号已经删除了 再来删除5号只能删除下一个元素了
//为了验证 使用Collections工具箱进行线程安全化

        System.out.println("使用Collections安全化");
        List<Integer> safeList = Collections.synchronizedList(list);
        System.out.println("before"+safeList);

        System.out.println("after"+safeList);
    }
}
