import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String regex1 = "\\d+";
        String regex2 = "[a-zA-Z]+";   
        String regex3 = "\\b\\w{5}\\b"; 
        String regex4 = "\\d{3}-\\d{2}-\\d{4}"; 
        String regex5 = "^[A-Za-z]\\w{5,29}$";   

        String positiveCase1 = "778";
        String negativeCase1 = "abc";

        String positiveCase2 = "Hello";
        String negativeCase2 = "123";

        String positiveCase3 = "Regex1";
        String negativeCase3 = "Java";

        String positiveCase4 = "123-45-6789";
        String negativeCase4 = "123456789";

        String positiveCase5 = "username888";
        String negativeCase5 = "888username";

        testRegex(regex1, positiveCase1, negativeCase1);
        testRegex(regex2, positiveCase2, negativeCase2);
        testRegex(regex3, positiveCase3, negativeCase3);
        testRegex(regex4, positiveCase4, negativeCase4);
        testRegex(regex5, positiveCase5, negativeCase5);
    }

    private static void testRegex(String regex, String positiveCase, String negativeCase) {
        System.out.println("Testing regular expression: " + regex);

        System.out.println("Positive case:");
        if (matches(regex, positiveCase)) {
            System.out.println("  " + positiveCase + " matches");
        } else {
            System.out.println("  " + positiveCase + " does not match");
        }

        System.out.println("Negative case:");
        if (!matches(regex, negativeCase)) {
            System.out.println("  " + negativeCase + " does not match");
        } else {
            System.out.println("  " + negativeCase + " matches");
        }

        System.out.println(); 
    }

    private static boolean matches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
