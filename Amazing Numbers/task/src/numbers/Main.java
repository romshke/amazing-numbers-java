package numbers;

import java.util.Scanner;

public class Main {
    public static boolean isNatural(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String checkBuzz(int number) {
        boolean isDivisibleBy7 = number % 7 == 0, isEndsWith7 = String.valueOf(number).endsWith("7");

        if (isDivisibleBy7 && isEndsWith7) {
            return String.format("It is a Buzz number.%nExplanation:%n%d is divisible by 7 and ends with 7.",  number);
        }

        if (!isDivisibleBy7 && !isEndsWith7) {
            return String.format("It is not a Buzz number.%nExplanation:%n%d is neither divisible by 7 nor does it end with 7.",  number);
        }

        if (isDivisibleBy7) {
            return String.format("It is a Buzz number.%nExplanation:%n%d is divisible by 7.",  number);
        }

        return String.format("It is a Buzz number.%nExplanation:%n%d is ends with 7.", number);
    }

    public static void print() {
        System.out.println("Enter a natural number:");

        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());

            if (isNatural(number)) {
                System.out.println(isEven(number) ? "This number is Even." : "This number is Odd.");
                System.out.println(checkBuzz(number));
            } else {
                System.out.println("This number is not natural!");
            }
        }
    }

    public static void main(String[] args) {
//        write your code here
        print();
    }
}
