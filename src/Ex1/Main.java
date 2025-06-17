package Ex1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean stringaPariDispari (String parola){
        return parola.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci una parola: ");
        String lunghezzaParola = scanner.nextLine();

        if(stringaPariDispari(lunghezzaParola)){
            System.out.println(lunghezzaParola + " è pari");
        }else {
            System.out.println(lunghezzaParola + " è dispari");
        }
        System.out.println("inserisci un anno:");
        int anno = scanner.nextInt();

        if(annoBisestile(anno)){
            System.out.println(anno + " è bisestile");
        }else {
            System.out.println(anno + " non è bisestile");
        }
        scanner.close();
        }
    }
