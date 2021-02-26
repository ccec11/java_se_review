package ch03.tree;


/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月26日 19:24:00
 */
public class HeroNode {

    public HeroNode leftNode;

    public HeroNode rightNode;

    public Object value;

//        传入的参数比当前根节点小
    public static boolean compare(Object value,Object parameterV) {
        boolean falg = (Integer)parameterV - (Integer)value <= 0;
        return falg;
    }

    public void add(Object parameterV) {
        if (null == value) {
            value = parameterV;
        } else {
//      当前this根节点不为空，根节点已经有元素
            if (compare(value, parameterV)) {
                leftNode = new HeroNode();
                leftNode.add(parameterV);
            } else {
                if (null == rightNode) {
                    rightNode = new HeroNode();
                }
            }
        }
    }
}
