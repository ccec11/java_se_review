/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月27日 21:41:00
 */
public class swapIntTest {
    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapString(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Integer a = 3;Integer b = 5;
        String aString = "hello";String bString = "world";

        swap(a, b);
        System.out.println(a + " " + b);//3 5
        // 即便传递Integer过去 还是不改变他的值
        //        因为进行了自动拆箱 自动封装
        //        穿过去的是值 而不是地址

        swapString(aString,bString);
        System.out.println(aString+bString);
//        String是常量？
//        改变了之后 只在方法里面改了 临时参数 退出来之后其生命周期结束。
//        但是呢 传递数组 一定是传递了地址值！

    }
}
