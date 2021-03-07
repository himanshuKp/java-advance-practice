package in.himanshu.enums;

public enum PaymentOptions {
    CREDITCARD(5),DEBITCARD(12),CASH(2);

    int fee;

    PaymentOptions(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
