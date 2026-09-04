
class FeeAccount {
    public void pay(double amount) {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {
    @Override
    public void pay(double amount) {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class AccountBatchPayments {
    static void processPayment(FeeAccount account, double amount) {
        if (account != null) {
            account.pay(amount);
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };
        double amount = 60000;
        int hostelAccounts = 0;
        int dayScholarAccounts = 0;

        for (FeeAccount account : accounts) {
            processPayment(account, amount);

            if (account instanceof HostelFeeAccount) {
                hostelAccounts++;
            } else {
                dayScholarAccounts++;
            }
        }

        System.out.println("Hostel accounts processed: " + hostelAccounts
                + " | Day-scholar accounts processed: " + dayScholarAccounts);
    }
}
