package ru.itpark;

import ru.itpark.model.concretetarrifs.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WriteTariff writeTariff = new WriteTariff(
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
        LookTariff lookTariff = new LookTariff(
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
        CommunicateTariff communicateTariff = new CommunicateTariff(
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
        HaveFunTariff haveFunTariff = new HaveFunTariff(
                3,
                "Have fun",
                300,
                100,
                false,
                false,
                10,
                0,
                true);
        Arrays.asList(haveFunTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        ChooseTariff chooseTariff = new ChooseTariff(
                4,
                "Choose",
                260,
                300,
                false,
                false,
                10,
                0,
                true);
        Arrays.asList(chooseTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        PremiumTariff premiumTariff = new PremiumTariff(
                5,
                "Premium",
                2000,
                4000,
                true,
                true,
                0,
                0,
                true);
        Arrays.asList(premiumTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        SpeakTariff speakTariff = new SpeakTariff(
                6,
                "Speak",
                300,
                500,
                false,
                false,
                5,
                0,
                true);
        Arrays.asList(speakTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        SixMonthsUnlimitedTariff sixMonthsUnlimitedTariff = new SixMonthsUnlimitedTariff(
                7,
                "Six months unlimited",
                3100,
                true,
                false);
        Arrays.asList(sixMonthsUnlimitedTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        TwelveMonthsUnlimitedTariff twelveMonthsUnlimitedTariff = new TwelveMonthsUnlimitedTariff(
                8,
                "Twelve months unlimited",
                5100,
                false,
                true);
        Arrays.asList(twelveMonthsUnlimitedTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        MegafonOnlineTariff megafonOnlineTariff = new MegafonOnlineTariff(
                9,
                "Megafon online",
                0,
                false,
                false);
        Arrays.asList(megafonOnlineTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        GoToZeroTariff goToZeroTariff = new GoToZeroTariff(
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
        WarmWelcomeTariff warmWelcomeTariff = new WarmWelcomeTariff(
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
        HelloTariff helloTariff = new HelloTariff(
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
        PerSecondTariff perSecondTariff = new PerSecondTariff(
                13,
                "Per second",
                0,
                false,
                true,
                false,
                false,
                false,
                0,
                false,
                false,
                false);
        Arrays.asList(perSecondTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
        SmartThingsTariff smartThingsTariff = new SmartThingsTariff(
                14,
                "Smart things",
                20,
                false,
                false,
                true,
                true,
                true,
                0,
                false,
                false,
                true);
        Arrays.asList(smartThingsTariff.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
    }
}
