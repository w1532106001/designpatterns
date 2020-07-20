package Builder;

/**
 * @author whc
 * @date 2020/7/20
 * @description
 */

public class Human {
    private final String name;
    private final Integer age;
    private final byte sex;

    public static class Builder {
        private final String name;
        private Integer age;
        private byte sex;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setSex(byte sex) {
            this.sex = sex;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }

    private Human(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Builder.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
