package de.telran.home20240215.bank;

public enum OperationType {
    CONSULTATION ("консультации"),
    WITHDRAWAL ("изъятия"),
    DEPOSIT ("депозита"),
    ACCOUNT_OPENING ("открытия счета"),
    COMMUNAL_FEES ("коммунальных платежей");

    OperationType() {
    }
    private String title;

    OperationType(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return  title;
    }
}
