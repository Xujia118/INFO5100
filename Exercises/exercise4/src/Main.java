import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // Regular expression patterns
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
        String phoneNumberPattern = "\\b\\d{3}-\\d{3}-\\d{4}\\b";
        String datePattern = "\\b(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(\\d{4})\\b";
        String postalCodePattern = "\\b\\d{5}(-\\d{4})?\\b";
        String digitPattern = "\\b\\d+\\b";

        // Test subjects
        String[] subjects = {
                "john.doe@example.com",  // Valid email
                "123-456-7890",         // Valid phone number
                "02/22/2023",           // Valid date
                "95112",                // Valid post code
                "123456",                // Valid digit

                "invalid.email@com",     // Invalid email
                "555-5555",              // Invalid phone number
                "13/00/1800",            // Invalid date
                "123456",                // Invalid post code
                "12345s",                 // Invalid digit
        };

        // Test the regular expression patterns with the subjects
        testPattern(emailPattern, "Email address", subjects);
        testPattern(phoneNumberPattern, "Phone numbers", subjects);
        testPattern(datePattern, "Dates", subjects);
        testPattern(postalCodePattern, "Post code", subjects);
        testPattern(digitPattern, "Digit", subjects);
    }

    private static void testPattern(String pattern, String description, String[] subjects) {
        Pattern regex = Pattern.compile(pattern);

        System.out.println("Testing " + description + ":");
        for (String subject : subjects) {
            Matcher matcher = regex.matcher(subject);
            if (matcher.find()) {
                System.out.println("   ✓ " + subject + " is a valid " + description.toLowerCase());
            } else {
                System.out.println("   ✗ " + subject + " is not a valid " + description.toLowerCase());
            }
        }
        System.out.println();
    }
}