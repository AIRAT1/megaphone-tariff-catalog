package ru.itpark.model.concretetariff;

import ru.itpark.model.basetariff.TurnOnTariffGroup;

public class ChooseTariff extends TurnOnTariffGroup {
    public ChooseTariff(int id, String name, int price, int freeMinutesCount, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, int freeGigabytesCount, int freeSMSCount, boolean thirtyDaysFee) {
        super(id, name, price, freeMinutesCount, unlimitedInternetAccess, unlimitedSMSAccess, freeGigabytesCount, freeSMSCount, thirtyDaysFee);
    }
}