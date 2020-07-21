package Builder;

/**
 * @author whc
 * @date 2020/7/21
 * @description
 */

public class LombokBuilderTest {
    public static void main(String[] args) {
        System.out.println(Person.builder().skin("123").name("").eye("").age(123).build());
    }
}
