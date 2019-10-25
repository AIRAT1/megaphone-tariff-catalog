package ru.itpark.model.basetariff;

public abstract class TurnOnTariffGroup extends BaseTariffGroup {
    private int freeMinutesCount;
    private boolean unlimitedInternetAccess;
    private boolean unlimitedSMSAccess;
    private int freeGigabytesCount;
    private int freeSMSCount;
    private boolean thirtyDaysFee;

    public TurnOnTariffGroup(int id, String name, int price, int freeMinutesCount, boolean unlimitedInternetAccess, boolean unlimitedSMSAccess, int freeGigabytesCount, int freeSMSCount, boolean thirtyDaysFee) {
        super(id, name, price);
        this.freeMinutesCount = freeMinutesCount;
        this.unlimitedInternetAccess = unlimitedInternetAccess;
        this.unlimitedSMSAccess = unlimitedSMSAccess;
        this.freeGigabytesCount = freeGigabytesCount;
        this.freeSMSCount = freeSMSCount;
        this.thirtyDaysFee = thirtyDaysFee;
    }

    public int getFreeMinutesCount() {
        return freeMinutesCount;
    }

    public void setFreeMinutesCount(int freeMinutesCount) {
        this.freeMinutesCount = freeMinutesCount;
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

    public int getFreeGigabytesCount() {
        return freeGigabytesCount;
    }

    public void setFreeGigabytesCount(int freeGigabytesCount) {
        this.freeGigabytesCount = freeGigabytesCount;
    }

    public int getFreeSMSCount() {
        return freeSMSCount;
    }

    public void setFreeSMSCount(int freeSMSCount) {
        this.freeSMSCount = freeSMSCount;
    }

    public boolean isThirtyDaysFee() {
        return thirtyDaysFee;
    }

    public void setThirtyDaysFee(boolean thirtyDaysFee) {
        this.thirtyDaysFee = thirtyDaysFee;
    }
}
