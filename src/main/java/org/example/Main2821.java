package org.example;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main2821 {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchFieldException {

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
        System.out.println();

        Object obj = 5;
        Class<?> clazz = obj.getClass();
        Package classPackage = clazz.getPackage();
        System.out.println("Class Package fo Object is: " + classPackage.getName() + "\".");
        System.out.println();

        String str = "example";
        Class<?> superClass = str.getClass().getSuperclass();
        System.out.println("Super Class for type \"String\" is: " + superClass.getSimpleName()+ "\".");
        System.out.println();

        Object map = new HashMap<>();
        Class<?>[] interfaces = map.getClass().getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
        System.out.println();

        System.out.println("HashMap Constructors: ");
        Constructor<?>[] constructors = map.getClass().getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println();

        System.out.println("HashMap Fields: ");
        Field[] fields = map.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println();

        System.out.println("HashMap Methods: ");
        Method[] methods = map.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println();

        Class<?> mapClass= Class.forName("java.util.HashMap");
        Constructor<?> constructor = mapClass.getConstructor();
        HashMap<?,?> map2 = (HashMap<?,?>) constructor.newInstance();
        System.out.println(map2.getClass().getSimpleName());
        System.out.println(map2.isEmpty());
        System.out.println();

//        Class<?> clazz2 = map2.getClass(); //Получим у него класс
//        //Создадим новый объект класса HashMap
//        HashMap<?,?> instance = (HashMap<?,?>) clazz2.getConstructor().newInstance();
//        //Получим у созданного объекта поле size
//        Field field = instance.getClass().getDeclaredField("size");
//        //Установим доступность поля
//        field.setAccessible(true);
//        //Установим полю size значение 10
//        field.setInt(instance, 10);
//        System.out.println("Map is empty: " + instance.isEmpty());
//        System.out.println("Map size:" + instance.size());
//        System.out.println("Values: " + instance.toString());






    }
}
