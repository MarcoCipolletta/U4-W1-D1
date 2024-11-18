import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Es1
        Es1 esercizio1 = new Es1();
        String[] arrayIniziale = {"a", "b", "c", "d", "e"};
        String stringaDaAggiungere = "Nuova";
        String[] nuovoArr = esercizio1.inserisciInArray(arrayIniziale, stringaDaAggiungere);

        for (int i = 0; i < nuovoArr.length; i++) {

            System.out.println(nuovoArr[i]);
        }

        //Es2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa");
        String a = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String b = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String c = scanner.nextLine();

        System.out.println("in ordine: " + a + " " + b + " " + c);
        System.out.println("al contrario: " + c + " " + b + " " + a);

        //Es3
        System.out.println("Inserisci la lunghezza del primo lato");
        double latoA = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato");
        double latoB = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato");
        double latoC = scanner.nextDouble();

        Es3 esercizio3 = new Es3();
        double areaTriangolo = esercizio3.perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("L' area del triangolo è: " + areaTriangolo);


    }

}