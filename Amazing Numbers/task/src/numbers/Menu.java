package numbers;

import java.util.Scanner;

public class Menu {
    static String welcomeMessage = "Welcome to Amazing Numbers!\n",
            supportedRequestsMessage = """
            Supported requests:
            - enter a natural number to know its properties;
            - enter 0 to exit.
            """,
            enterRequestMessage = "Enter a request: ",
            errorMessage = "The first parameter should be a natural number or zero.\n",
            goodbyeMessage = "Goodbye!";

    public static void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(welcomeMessage);
            System.out.println(supportedRequestsMessage);

            while (true) {
                System.out.print(enterRequestMessage);
                long request = Long.parseLong(scanner.nextLine());
                System.out.println();

                if (request == 0) {
                    break;
                } else if (request < 0) {
                    System.out.println(errorMessage);
                } else {
                    NumberProperties numberProperties = new NumberProperties(request);
                    System.out.println(numberProperties);
                }
            }

            System.out.println(goodbyeMessage);
        }
    }
}
