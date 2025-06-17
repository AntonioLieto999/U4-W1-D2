package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi un numero da 0 a 3:");
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("il numero non compreso tra 0 e 3");
        }

        scanner.close();
        }
    }
