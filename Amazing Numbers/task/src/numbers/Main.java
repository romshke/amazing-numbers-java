package numbers;

import java.util.Scanner;

public class Main {
    public void showNumberProperties() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a natural number:");
            int number = Integer.parseInt(scanner.nextLine());
            NumberProperties numberProperties = new NumberProperties(number);
            System.out.println(numberProperties);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showNumberProperties();
    }
}
