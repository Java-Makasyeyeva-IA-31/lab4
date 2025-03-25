package org.example.first;

import org.example.first.clazz.ExtendsGenericClass;
import org.example.first.clazz.GenericClass;
import org.example.first.method.GenericMethod;

public class FirstMain {
    public static void main(String[] args) {
        System.out.println("Generic classes examples");

        GenericClass<String> genericClass = new GenericClass<>("Hello");
        System.out.println(genericClass.getT() + " world!!!");

        ExtendsGenericClass<Integer> extendsGenericClass = new ExtendsGenericClass<>(100);
        System.out.println("Value is " + extendsGenericClass.getNumber());

        System.out.println("\nGeneric method examples");

        boolean sameClassType = GenericMethod.isSameClassType(1, "Some text");
        System.out.println("Is the same type: " + sameClassType);

        sameClassType = GenericMethod.isSameClassType(1, 2);
        System.out.println("Is the same type: " + sameClassType);

        String text = GenericMethod.concatToString("Result is ", 100);
        System.out.println("Text: " + text);
    }
}