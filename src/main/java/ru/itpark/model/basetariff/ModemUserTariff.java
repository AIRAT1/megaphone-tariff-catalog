package ru.itpark.model.basetariff;

public class ModemUserTariff extends BaseTariffGroup {
    private boolean unlimitedInternetAccessForSixMonths;
    private boolean unlimitedInternetAccessForTwelveMonths;

    public ModemUserTariff(int id, String name, int price, boolean unlimitedInternetAccessForSixMonths, boolean unlimitedInternetAccessForTwelveMonths) {
        super(id, name, price);
        this.unlimitedInternetAccessForSixMonths = unlimitedInternetAccessForSixMonths;
        this.unlimitedInternetAccessForTwelveMonths = unlimitedInternetAccessForTwelveMonths;
    }

    public boolean isUnlimitedInternetAccessForSixMonths() {
        return unlimitedInternetAccessForSixMonths;
    }

    public void setUnlimitedInternetAccessForSixMonths(boolean unlimitedInternetAccessForSixMonths) {
        this.unlimitedInternetAccessForSixMonths = unlimitedInternetAccessForSixMonths;
    }

    public boolean isUnlimitedInternetAccessForTwelveMonths() {
        return unlimitedInternetAccessForTwelveMonths;
    }

    public void setUnlimitedInternetAccessForTwelveMonths(boolean unlimitedInternetAccessForTwelveMonths) {
        this.unlimitedInternetAccessForTwelveMonths = unlimitedInternetAccessForTwelveMonths;
    }
}
