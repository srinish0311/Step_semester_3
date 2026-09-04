
class LateFeeAccount {
    private final String registrationNumber;
    private final double totalFee;

    public LateFeeAccount(String registrationNumber, double totalFee) {
        this.registrationNumber = registrationNumber;
        this.totalFee = totalFee;
    }

    public final double calculateLateFee(int daysLate) {
        return totalFee * daysLate * 0.01;
    }

    public final void printSummary(int daysLate) {
        System.out.printf("%s | Total Fee: Rs %.1f | Late Fee: Rs %.1f%n",
                registrationNumber, totalFee, calculateLateFee(daysLate));
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

public class LateFeeBatch {
    public static void main(String[] args) {
        String[] registrationNumbers = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < registrationNumbers.length; i++) {
            LateFeeAccount account = new LateFeeAccount(
                    registrationNumbers[i], totalFees[i]);

            if (daysLate[i] > 0) {
                account.printSummary(daysLate[i]);
            } else {
                System.out.println(account.getRegistrationNumber()
                        + " - On time, no late fee");
            }
        }
    }
}
