package Builder;

/**
 * @author whc
 * @date 2020/7/20
 * @description
 */

public class Test {
    public static void main(String[] args) {
        Human.Builder builder = new Human.Builder("王浩晨");
        System.out.println(builder.setAge(18).setSex(Byte.valueOf("1")).build().toString());
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        CalZone calZone = new CalZone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println(nyPizza);
        System.out.println(calZone);
    }
}
