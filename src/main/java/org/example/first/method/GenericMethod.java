package org.example.first.method;

public class GenericMethod {

    public static <S, U> boolean isSameClassType(S s, U u) {
        return s.getClass().equals(u.getClass());
    }

    public static <S, U> String concatToString(S s, U u) {
        return s.toString() + u.toString();
    }
}
