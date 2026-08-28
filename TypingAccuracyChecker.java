public class TypingAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println("The two strings must have equal length");
            return;
        }

        int matchedCharacters = 0;
        int firstMismatchPosition = -1;
        char originalMismatch = '\0';
        char typedMismatch = '\0';

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i + 1; // Positions are 1-based.
                originalMismatch = original.charAt(i);
                typedMismatch = typed.charAt(i);
            }
        }

        double accuracy = (matchedCharacters * 100.0) / original.length();

        if (firstMismatchPosition == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matchedCharacters, original.length(), accuracy);
        } else {
            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matchedCharacters, original.length(), accuracy,
                    firstMismatchPosition, originalMismatch, typedMismatch);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
