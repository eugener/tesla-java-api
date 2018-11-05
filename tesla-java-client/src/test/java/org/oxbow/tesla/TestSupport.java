package org.oxbow.tesla;

import java.util.Objects;
import java.util.function.Supplier;

final class TestSupport {

    /**
     * Converts supplier to a the one which caches the value
     * @param supplier given supplier
     * @param <T> value type
     * @return cached supplier
     */
    static <T> Supplier<T> cached(final Supplier<T> supplier) {
        return new Supplier<T>() {

            { Objects.requireNonNull(supplier); }

            private T value;
            @Override public T get() {
                return value == null? value = supplier.get(): value;
            }
        };
    }

}
