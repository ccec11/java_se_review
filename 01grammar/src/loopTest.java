/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月27日 21:06:00
 */
public class loopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("执行业务逻辑");
            System.out.println("执行步进语句i++");
        }

        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s<60;s++) {
                    count++;
                    System.out.println(h + "小时" + m + "分钟"+s+"秒");
                }

            }
        }
        System.out.println(count);


    }
}
