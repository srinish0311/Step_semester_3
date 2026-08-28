public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog.isEmpty()) {
            System.out.println("No Signal Readings");
            return;
        }

        char currentSignal = signalLog.charAt(0);
        int currentStreak = 1;
        char longestSignal = currentSignal;
        int longestStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentSignal) {
                currentStreak++;
            } else {
                currentSignal = signalLog.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestSignal = currentSignal;
            }
        }

        System.out.println("Longest Streak: '" + longestSignal
                + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYGG");
    }
}
