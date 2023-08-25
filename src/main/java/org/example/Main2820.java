package org.example;

import java.lang.reflect.Modifier;

public class Main2820 {

    public static void main(String[] args) throws ClassNotFoundException {
        // Получаем класс для java.util.HashMap
        Class<?> hashMap = Class.forName("java.util.HashMap");

        // Получаем класс для java.util.AbstractMap
        Class<?> abstractMap = Class.forName("java.util.AbstractMap");

        // Получаем класс для java.util.Map
        Class<?> map = Class.forName("java.util.Map");


        //Получаем модификаторы для HashMap
        int hashMapModifiers = hashMap.getModifiers();

        //Получаем модификаторы для AbstractMap
        int abstractMapModifiers = abstractMap.getModifiers();

        //Получаем модификаторы для Map
        int mapModifiers = map.getModifiers();


        //Выводим, имеет ли HashMap public модификатор
        System.out.println("HashMap class is public :" + Modifier.isPublic(hashMap.getModifiers()));
//        System.out.println("HashMap class is public :" + Modifier.isPublic(hashMapModifiers));

        //Выводим, имеет ли AbstractMap abstract модификатор
        System.out.println("AbstractMap class is abstract :" + Modifier.isAbstract(abstractMapModifiers));

        //Выводим, имеет ли Map interface модификатор
        System.out.println("Map is interface :" + Modifier.isInterface(mapModifiers));

        //Выводим, имеет ли HashMap abstract модификатор
        System.out.println("HashMap class is abstract :" + Modifier.isAbstract(hashMapModifiers));
    }
}
