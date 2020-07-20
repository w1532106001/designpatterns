package Builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author whc
 * @date 2020/7/20
 * @description
 */

public class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        builder.addTopping(Topping.HAM);
        toppings = builder.toppings;
        System.out.println(toppings);
    }
}
