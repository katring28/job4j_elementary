package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + expected + " euro. Test result: " + passed);
        float in1 = 180;
        double expected1 = 3;
        float out1 = Converter.rubleToDollar(180);
        boolean passed2 = expected1 == out1;
        System.out.println("140 rubles are " + expected1 + " dollar. Test result: " + passed2);
    }
}

