package ru.itpark.model.concretetariff;

import ru.itpark.model.basetariff.OtherTariffGroup;

public class PerSecondTariff extends OtherTariffGroup {
    public PerSecondTariff(int id, String name, int price, boolean perMinuteBilling, boolean perSecondBilling, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, boolean unlimitedCallsInsideNetwork, int freeGigabytesCount, boolean monthlyPayment, boolean twoWeeksPayment, boolean weeklyPayment) {
        super(id, name, price, perMinuteBilling, perSecondBilling, unlimitedInternetAccess, unlimitedSMSAccess, unlimitedCallsInsideNetwork, freeGigabytesCount, monthlyPayment, twoWeeksPayment, weeklyPayment);
    }
}