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
    }

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
    SixMonthsUnlimitedTariff sixMonthsUnlimitedTariff = new SixMonthsUnlimitedTariff(
            7,
            "Six months unlimited",
            3100,
            true,
            false);
    TwelveMonthsUnlimitedTariff twelveMonthsUnlimitedTariff = new TwelveMonthsUnlimitedTariff(
            8,
            "Twelve months unlimited",
            5100,
            false,
            true);
    MegafonOnlineTariff megafonOnlineTariff = new MegafonOnlineTariff(
            9,
            "Megafon online",
            0,
            false,
            false);
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
}
