package ru.itpark.model.concretetarrifs;

import ru.itpark.model.basetarrifs.TurnOnTariffGroup;

public class CommunicateTariff extends TurnOnTariffGroup {
    public CommunicateTariff(int id, String name, int price, int freeMinutesCount, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, int freeGigabytesCount, int freeSMSCount, boolean thirtyDaysFee) {
        super(id, name, price, freeMinutesCount, unlimitedInternetAccess, unlimitedSMSAccess, freeGigabytesCount, freeSMSCount, thirtyDaysFee);
    }
}
