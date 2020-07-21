package Prototype;

/**
 * @author whc
 * @date 2020/7/21
 * @description 具体原型类
 */

public class RealizeType implements Cloneable{
    RealizeType(){
        System.out.println("具体原型类创建成功！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
