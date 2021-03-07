package in.himanshu.enums;

public class Test {
    public static void main(String[] args) {
        PaymentOptions pt = PaymentOptions.DEBITCARD;
//        System.out.println(pt);

        PaymentOptions[] paymentOptions = PaymentOptions.values();
        for (PaymentOptions payment:paymentOptions) {
            System.out.println("Options: "+payment+", Positon: "+payment.ordinal()+", Fee: "+payment.getFee()+"%");
        }
    }

}
