package AccessibleObjectTest;

import Builder.Human;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/**
 * @author whc
 * @date 2020/7/21
 * @description 通过反射机制修改private修饰的属性 破坏私有化
 *
 * getFields()与getDeclaredFields()区别：
 * getFields()只能访问类中声明为公有的字段,私有的字段它无法访问.
 * getDeclaredFields()能访问类中所有的字段,与  public,private,protect无关
 *
 * getMethods()与getDeclaredMethods()区别：
 * getMethods()只能访问类中声明为公有的方法,私有的方法它无法访问,能访问从其它类继承来的公有方法.
 * getDeclaredFields()能访问类中所有的字段,与public,private,protect无关,不能访问从其它类继承来的方法
 *
 * getConstructors()与getDeclaredConstructors()区别：
 * getConstructors()只能访问类中声明为public的构造函数.
 * getDeclaredConstructors()能访问类中所有的构造函数,与public,private,protect无关
 */

public class Test {

    public static void main(String[] args) {
        Human human = new Human.Builder("whc").setAge(18).setSex(Byte.valueOf("1")).build();
        Field[] fields = human.getClass().getDeclaredFields();
        //对所有属性设置访问权限  当类中的成员变量为private时 必须设置此项
        AccessibleObject.setAccessible(fields,true);
        try {
            System.out.println(fields[0].toString()+"="+fields[0].get(human));
            fields[0].set(human,"hhh");
            System.out.println(fields[0].toString()+"="+fields[0].get(human));
            System.out.println(human);
            System.out.println(human.getClass().desiredAssertionStatus());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
