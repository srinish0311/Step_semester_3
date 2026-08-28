public class SeatDuplicationChecker {
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyPrinted = false;

            for (int previous = 0; previous < i; previous++) {
                if (seatNumbers[previous] == seatNumbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: "
                            + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] seatsWithDuplicate = {101, 102, 103, 102, 105};
        int[] seatsWithoutDuplicate = {101, 102, 103, 104, 105};

        checkDuplicateSeats(seatsWithDuplicate);
        checkDuplicateSeats(seatsWithoutDuplicate);
    }
}
