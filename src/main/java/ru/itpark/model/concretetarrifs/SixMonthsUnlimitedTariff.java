package ru.itpark.model.concretetarrifs;

import ru.itpark.model.basetarrifs.ModemUserTariffGroup;

public class SixMonthsUnlimitedTariff extends ModemUserTariffGroup {
    public SixMonthsUnlimitedTariff(int id, String name, int price, boolean unlimitedInternetAccessForSixMonths, boolean unlimitedInternetAccessForTwelveMonths) {
        super(id, name, price, unlimitedInternetAccessForSixMonths, unlimitedInternetAccessForTwelveMonths);
    }
}
