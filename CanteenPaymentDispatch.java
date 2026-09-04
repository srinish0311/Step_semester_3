class Payment {
    public void pay(double amount) {
        System.out.printf("Paid (cash): Rs %.1f%n", amount);
    }
}

class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        double amountWithFee = amount * 1.02;
        System.out.printf("Charged (card, incl. fee): Rs %.1f%n", amountWithFee);
    }
}

public class CanteenPaymentDispatch {
    public static void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            payment.pay(amount);
        } else {
            payment.pay(amount);
        }
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };
        double[] amounts = {100, 50, 200, 75, 120};
        double totalCollected = 0.0;

        for (int i = 0; i < payments.length; i++) {
            processTransaction(payments[i], amounts[i]);

            if (payments[i] instanceof CardPayment) {
                totalCollected += amounts[i] * 1.02;
            } else {
                totalCollected += amounts[i];
            }
        }

        System.out.printf("Total Collected: Rs %.1f%n", totalCollected);
    }
}
