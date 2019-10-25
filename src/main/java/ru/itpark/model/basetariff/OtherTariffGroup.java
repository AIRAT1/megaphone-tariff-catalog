package ru.itpark.model.basetariff;

public abstract class OtherTariffGroup extends BaseTariffGroup {
    private boolean perMinuteBilling;
    private boolean perSecondBilling;
    private boolean unlimitedInternetAccess;
    private boolean unlimitedSMSAccess;
    private boolean unlimitedCallsInsideNetwork;
    private int freeGigabytesCount;
    private boolean monthlyPayment;
    private boolean twoWeeksPayment;
    private boolean weeklyPayment;

    public OtherTariffGroup(int id, String name, int price, boolean perMinuteBilling, boolean perSecondBilling, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, boolean unlimitedCallsInsideNetwork, int freeGigabytesCount, boolean monthlyPayment, boolean twoWeeksPayment, boolean weeklyPayment) {
        super(id, name, price);
        this.perMinuteBilling = perMinuteBilling;
        this.perSecondBilling = perSecondBilling;
        this.unlimitedInternetAccess = unlimitedInternetAccess;
        this.unlimitedSMSAccess = unlimitedSMSAccess;
        this.unlimitedCallsInsideNetwork = unlimitedCallsInsideNetwork;
        this.freeGigabytesCount = freeGigabytesCount;
        this.monthlyPayment = monthlyPayment;
        this.twoWeeksPayment = twoWeeksPayment;
        this.weeklyPayment = weeklyPayment;
    }

    public boolean isPerMinuteBilling() {
        return perMinuteBilling;
    }

    public void setPerMinuteBilling(boolean perMinuteBilling) {
        this.perMinuteBilling = perMinuteBilling;
    }

    public boolean isPerSecondBilling() {
        return perSecondBilling;
    }

    public void setPerSecondBilling(boolean perSecondBilling) {
        this.perSecondBilling = perSecondBilling;
    }

    public boolean isUnlimitedInternetAccess() {
        return unlimitedInternetAccess;
    }

    public void setUnlimitedInternetAccess(boolean unlimitedInternetAccess) {
        this.unlimitedInternetAccess = unlimitedInternetAccess;
    }

    public boolean isUnlimitedSMSAccess() {
        return unlimitedSMSAccess;
    }

    public void setUnlimitedSMSAccess(boolean unlimitedSMSAccess) {
        this.unlimitedSMSAccess = unlimitedSMSAccess;
    }

    public boolean isUnlimitedCallsInsideNetwork() {
        return unlimitedCallsInsideNetwork;
    }

    public void setUnlimitedCallsInsideNetwork(boolean unlimitedCallsInsideNetwork) {
        this.unlimitedCallsInsideNetwork = unlimitedCallsInsideNetwork;
    }

    public int getFreeGigabytesCount() {
        return freeGigabytesCount;
    }

    public void setFreeGigabytesCount(int freeGigabytesCount) {
        this.freeGigabytesCount = freeGigabytesCount;
    }

    public boolean isMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(boolean monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public boolean isTwoWeeksPayment() {
        return twoWeeksPayment;
    }

    public void setTwoWeeksPayment(boolean twoWeeksPayment) {
        this.twoWeeksPayment = twoWeeksPayment;
    }

    public boolean isWeeklyPayment() {
        return weeklyPayment;
    }

    public void setWeeklyPayment(boolean weeklyPayment) {
        this.weeklyPayment = weeklyPayment;
    }
}
