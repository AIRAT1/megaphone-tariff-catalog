package ru.itpark;

import ru.itpark.model.WriteTariff;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WriteTariff tariff = new WriteTariff(0,
                "Write",
                250,
                300,
                false,
                false,
                6,
                300,
                true);
        Arrays.asList(tariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
    }
}
