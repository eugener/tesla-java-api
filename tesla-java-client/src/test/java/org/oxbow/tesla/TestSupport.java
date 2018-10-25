package org.oxbow.tesla;

import java.util.function.Supplier;

final class TestSupport {

    /**
     * Convertes supplier to a the one which caches the value
     * @param supplier given supplier
     * @param <T> value type
     * @return cached supplier
     */
    public static <T> Supplier<T> chached(final Supplier<T> supplier ) {
        return new Supplier<T>() {
            private T value; // = null
            @Override public T get() {
                return value == null? value = supplier.get(): value;
            }
        };
    }

}
