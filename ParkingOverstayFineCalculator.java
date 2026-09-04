
class ParkingTicket {
    private final String vehicleNo;
    private final double ratePerMinute;

    public ParkingTicket(String vehicleNo, double ratePerMinute) {
        this.vehicleNo = vehicleNo;
        this.ratePerMinute = ratePerMinute;
    }

    public final double calculateFine(int overstayMinutes) {
        return overstayMinutes * ratePerMinute;
    }

    public final void printReceipt(int overstayMinutes) {
        System.out.printf("%s - Fine: Rs %.1f%n",
                vehicleNo, calculateFine(overstayMinutes));
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
}

public class ParkingOverstayFineCalculator {
    public static void main(String[] args) {
        String[] vehicleNos = {
            "TN09AB1234", "TN22CD5678", "TN09EF9012", "TN10GH3456"
        };
        double[] ratesPerMinute = {2, 2, 3, 2};
        int[] overstayMinutes = {15, 0, -5, 8};

        for (int i = 0; i < vehicleNos.length; i++) {
            ParkingTicket ticket = new ParkingTicket(
                    vehicleNos[i], ratesPerMinute[i]);

            if (overstayMinutes[i] > 0) {
                ticket.printReceipt(overstayMinutes[i]);
            } else {
                System.out.println(ticket.getVehicleNo()
                        + " - No fine, within allotted time");
            }
        }
    }
}
