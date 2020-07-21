package Prototype;

/**
 * @author whc
 * @date 2020/7/21
 * @description 原型模式的测试类
 */

public class RealizeTypeTest {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        try {
            RealizeType realizeType2 = (RealizeType) realizeType.clone();
            System.out.println(realizeType==realizeType2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
