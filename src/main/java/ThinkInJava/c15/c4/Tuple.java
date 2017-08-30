//: net/mindview/util/Tuple.java
// Tuple library using type argument inference.
package ThinkInJava.c15.c4;

import ThinkInJava.c15.c2_1.FiveTuple;
import ThinkInJava.c15.c2_1.FourTuple;
import ThinkInJava.c15.c2_1.ThreeTuple;
import ThinkInJava.c15.c2_1.TwoTuple;

public class Tuple {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new FourTuple<>(a, b, c, d);
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<>(a, b, c, d, e);
    }
}