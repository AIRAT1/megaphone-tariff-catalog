package ru.itpark.model;

public class WriteTariff extends TurnOnTariffGroup {
    public WriteTariff(int id, String name, int price, int freeMinutesCount, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, int freeGigabytesCount, int freeSMSCount, boolean thirtyDaysFee) {
        super(id, name, price, freeMinutesCount, unlimitedInternetAccess, unlimitedSMSAccess, freeGigabytesCount, freeSMSCount, thirtyDaysFee);
    }
}
