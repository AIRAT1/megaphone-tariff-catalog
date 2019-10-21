package ru.itpark.model.concretetarrifs;

import ru.itpark.model.basetarrifs.ModemUserTariffGroup;

public class MegafonOnlineTariff extends ModemUserTariffGroup {
    public MegafonOnlineTariff(int id, String name, int price, boolean unlimitedInternetAccessForSixMonths, boolean unlimitedInternetAccessForTwelveMonths) {
        super(id, name, price, unlimitedInternetAccessForSixMonths, unlimitedInternetAccessForTwelveMonths);
    }
}
