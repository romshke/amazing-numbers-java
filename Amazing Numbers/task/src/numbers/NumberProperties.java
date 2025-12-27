package numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberProperties {
    long number;

    public NumberProperties(long number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isBuzz() {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public boolean isDuck() {
        return String.valueOf(number).contains("0");
    }

    public boolean isPalindrome() {
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length() / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(numberString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        return String.format("""
                Properties of %s
                    even: %b
                    odd: %b
                    buzz: %b
                    duck: %b
                    palindromic: %b
                """, numberFormat.format(number), isEven(), !isEven(), isBuzz(), isDuck(), isPalindrome());
    }
}
