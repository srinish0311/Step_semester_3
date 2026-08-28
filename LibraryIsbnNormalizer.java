public class LibraryIsbnNormalizer {
    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must contain exactly 13 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: ISBN body must contain only digits";
            }
        }

        StringBuilder formatted = new StringBuilder();
        formatted.append("[").append(code.substring(0, 3)).append("] ");
        formatted.append("YEAR: ").append(code.substring(3, 7));
        formatted.append(" | CATALOG: ").append(code.substring(7));
        return formatted.toString();
    }

    public static void main(String[] args) {
        String validCode = normalizeCode(" pen2026004251 ");
        String invalidCode = normalizeCode("12N2026004251");

        System.out.println(validateAndFormat(validCode));
        System.out.println(validateAndFormat(invalidCode));
    }
}
