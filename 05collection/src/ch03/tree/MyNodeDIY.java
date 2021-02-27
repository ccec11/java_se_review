package ch03.tree;

/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月27日 05:00:00
 */
public class MyNodeDIY {
    @Override
    public String toString() {
        return "MyNodeDIY{" +
                "left=" + left +
                ", right=" + right +
                ", rootValue=" + rootValue +
                '}';
    }

    private MyNodeDIY left;

    private MyNodeDIY right;

    private Object rootValue;

    public void add(Object toJoin) {
        if (null == this.rootValue) {
            rootValue = toJoin;
        } else {//如果当前节点已经有元素了呢？
            //当前节点比root节点要大，更大的应该放右边
            //当前节点比root节点要小，小的放在当前节点的左边
            if ((Integer) toJoin - (Integer) rootValue >= 0) {
                if (null == right) {
                    right = new MyNodeDIY();
                }
                right.add(toJoin);
            }
            if ((Integer) toJoin - (Integer) rootValue <= 0) {
                if (null == left) {
                    left = new MyNodeDIY();
                }
//                如果不为空就直接加上去
                left.add(toJoin);
            }
        }
    }

    public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        MyNodeDIY root = new MyNodeDIY();
        for (int num : randoms) {
            root.add(num);
            System.out.println(root);
        }

    }
}
