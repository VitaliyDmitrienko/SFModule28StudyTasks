package org.example;

import java.lang.reflect.Modifier;

public class Main2821 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> arrayList = Class.forName("java.util.ArrayList");
        Class<?> abstractList = Class.forName("java.util.AbstractList");
        Class<?> collection = Class.forName("java.util.Collection");

        int arrayListModifiers = arrayList.getModifiers();
        int abstractListModifiers = abstractList.getModifiers();
        int collectionModifiers = collection.getModifiers();


        System.out.println("ArrayList class is public? \"" + Modifier.isPublic(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is private? \"" + Modifier.isPrivate(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is protected? \"" + Modifier.isProtected(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is abstract? \"" + Modifier.isAbstract(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is final? \"" + Modifier.isFinal(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is static? \"" + Modifier.isStatic(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is strict? \"" + Modifier.isStrict(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is synchronized? \"" + Modifier.isSynchronized(arrayList.getModifiers())+ "\".");
        System.out.println("ArrayList class is Interface? \"" + Modifier.isInterface(arrayList.getModifiers())+ "\".");
        System.out.println();

        System.out.println("AbstractList class is public? \"" + Modifier.isPublic(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is private? \"" + Modifier.isPrivate(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is protected? \"" + Modifier.isProtected(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is abstract? \"" + Modifier.isAbstract(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is final? \"" + Modifier.isFinal(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is static? \"" + Modifier.isStatic(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is strict? \"" + Modifier.isStrict(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is synchronized? \"" + Modifier.isSynchronized(abstractList.getModifiers())+ "\".");
        System.out.println("AbstractList class is Interface? \"" + Modifier.isInterface(abstractList.getModifiers())+ "\".");
        System.out.println();

        System.out.println("Collection class is public? \"" + Modifier.isPublic(collectionModifiers)+ "\".");
        System.out.println("Collection class is private? \"" + Modifier.isPrivate(collectionModifiers)+ "\".");
        System.out.println("Collection class is protected? \"" + Modifier.isProtected(collectionModifiers)+ "\".");
        System.out.println("Collection class is abstract? \"" + Modifier.isAbstract(collectionModifiers)+ "\".");
        System.out.println("Collection class is final? \"" + Modifier.isFinal(collectionModifiers)+ "\".");
        System.out.println("Collection class is static? \"" + Modifier.isStatic(collectionModifiers)+ "\".");
        System.out.println("Collection class is strict? \"" + Modifier.isStrict(collectionModifiers)+ "\".");
        System.out.println("Collection class is synchronized? \"" + Modifier.isSynchronized(collectionModifiers)+ "\".");
        System.out.println("Collection class is Interface? \"" + Modifier.isInterface(collectionModifiers)+ "\".");

    }
}
