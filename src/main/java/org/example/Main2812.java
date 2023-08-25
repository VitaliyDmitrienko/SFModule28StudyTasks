package org.example;

public class Main2812 {
    public static void main1(String[] args) throws ClassNotFoundException {
        Integer integer = 12;
        Class<? extends Integer> cl = integer.getClass();
        System.out.println(cl);

        Class<?> cla = Class.forName("java.lang.Integer");
        System.out.println(cla);

        Class<Integer> clas = Integer.class;
        System.out.println(clas);
    }
    public static void main(String[] args) {
        Object str = "example";
        Class<?> clazz = str.getClass();

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
    }
}