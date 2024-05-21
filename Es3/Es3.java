package Es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Inserisci una stringa:");
            input = sc.nextLine();

            if (!input.equals(":q")) {
                String[] characters = input.split("");
                System.out.println(String.join(",", characters));

            }
        } while (!input.equals(":q"));

        sc.close();

    }
}
