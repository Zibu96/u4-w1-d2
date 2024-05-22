package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero da cui far partire il countdown");
        int num1 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num1; i--) {
            if (i == -1) break;
            System.out.println(i);

        }
        System.out.println("Adesso scoppia la bomba");
        scanner.close();
    }
}
