package numbers;

public class NumberProperties {
    int number;

    public NumberProperties(int number) {
        this.number = number;
    }

    public boolean isNatural() {
        return number > 0;
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

    @Override
    public String toString() {
        if (isNatural()) {
            return String.format("Properties of %d%n" +
                    "even:%6b%n" +
                    "odd:%6b%n" +
                    "buzz:%6b%n" +
                    "duck:%6b%n", number, isEven(), !isEven(), isBuzz(), isDuck());
        } else {
            return "This number is not natural!";
        }
    }
}
