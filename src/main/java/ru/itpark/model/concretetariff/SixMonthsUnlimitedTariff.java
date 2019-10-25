package ru.itpark.model.concretetariff;

import ru.itpark.model.basetariff.ModemUserTariffGroup;

public class SixMonthsUnlimitedTariff extends ModemUserTariffGroup {
    public SixMonthsUnlimitedTariff(int id, String name, int price, boolean unlimitedInternetAccessForSixMonths, boolean unlimitedInternetAccessForTwelveMonths) {
        super(id, name, price, unlimitedInternetAccessForSixMonths, unlimitedInternetAccessForTwelveMonths);
    }
}
