package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il conto alla rovescia:");
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
