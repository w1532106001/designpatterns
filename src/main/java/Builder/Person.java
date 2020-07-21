package Builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author whc
 * @date 2020/7/21
 * @description
 */
@Builder
@Data
public class Person {
    private String name;
    private String skin;
    private String eye;
    private int age;
}
