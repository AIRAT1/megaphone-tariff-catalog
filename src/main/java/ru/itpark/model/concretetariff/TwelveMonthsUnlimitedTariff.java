package ru.itpark.model.concretetariff;

import ru.itpark.model.basetariff.ModemUserTariffGroup;

public class TwelveMonthsUnlimitedTariff extends ModemUserTariffGroup {
    public TwelveMonthsUnlimitedTariff(int id, String name, int price, boolean unlimitedInternetAccessForSixMonths, boolean unlimitedInternetAccessForTwelveMonths) {
        super(id, name, price, unlimitedInternetAccessForSixMonths, unlimitedInternetAccessForTwelveMonths);
    }
}
