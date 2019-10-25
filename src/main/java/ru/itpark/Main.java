package ru.itpark;

import ru.itpark.model.basetariff.ModemUserTariff;
import ru.itpark.model.basetariff.OtherTariff;
import ru.itpark.model.basetariff.TurnOnTariff;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff writeTariff = new TurnOnTariff(
                0,
                "Write",
                250,
                300,
                false,
                false,
                6,
                300,
                true);
        Arrays.asList(writeTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        TurnOnTariff lookTariff = new TurnOnTariff(
                1,
                "Look",
                650,
                1200,
                true,
                false,
                0,
                300,
                true);
        Arrays.asList(lookTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        TurnOnTariff communicateTariff = new TurnOnTariff(
                2,
                "Communicate",
                350,
                600,
                true,
                false,
                0,
                0,
                true);
        Arrays.asList(communicateTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        ModemUserTariff sixMonthsUnlimitedTariff = new ModemUserTariff(
                7,
                "Six months unlimited",
                3100,
                true,
                false);
        Arrays.asList(sixMonthsUnlimitedTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        ModemUserTariff twelveMonthsUnlimitedTariff = new ModemUserTariff(
                8,
                "Twelve months unlimited",
                5100,
                false,
                true);
        Arrays.asList(twelveMonthsUnlimitedTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        ModemUserTariff megafonOnlineTariff = new ModemUserTariff(
                9,
                "Megafon online",
                0,
                false,
                false);
        Arrays.asList(megafonOnlineTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        OtherTariff goToZeroTariff = new OtherTariff(
                10,
                "Go to zero",
                0,
                true,
                false,
                false,
                false,
                false,
                0,
                false,
                false,
                false);
        Arrays.asList(goToZeroTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        OtherTariff warmWelcomeTariff = new OtherTariff(
                11,
                "Warm welcome",
                350,
                false,
                false,
                true,
                false,
                true,
                0,
                true,
                false,
                false);
        Arrays.asList(warmWelcomeTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        OtherTariff helloTariff = new OtherTariff(
                12,
                "Hello",
                750,
                false,
                false,
                false,
                false,
                true,
                30,
                false,
                true,
                false);
        Arrays.asList(helloTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
    }
}
