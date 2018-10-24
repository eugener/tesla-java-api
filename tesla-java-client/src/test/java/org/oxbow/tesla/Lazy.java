package org.oxbow.tesla;

import java.util.Objects;
import java.util.function.Supplier;

class Lazy<T> {

    private T value = null;
    private Supplier<T> supplier;


    Lazy(Supplier<T> supplier) {
        this.supplier = Objects.requireNonNull(supplier);
    }

    T get() {

        return value == null? value = supplier.get() : value;


//        if ( value == null ) {
//            value = supplier.get();
//        }
//        return value;
    }

}
