package ru.itpark.model.concretetarrifs;

import ru.itpark.model.basetarrifs.OtherTariffGroup;

public class WarmWelcomeTariff extends OtherTariffGroup {
    public WarmWelcomeTariff(int id, String name, int price, boolean perMinuteBilling, boolean perSecondBilling, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, boolean unlimitedCallsInsideNetwork, int freeGigabytesCount, boolean monthlyPayment, boolean twoWeeksPayment, boolean weeklyPayment) {
        super(id, name, price, perMinuteBilling, perSecondBilling, unlimitedInternetAccess, unlimitedSMSAccess, unlimitedCallsInsideNetwork, freeGigabytesCount, monthlyPayment, twoWeeksPayment, weeklyPayment);
    }
}
