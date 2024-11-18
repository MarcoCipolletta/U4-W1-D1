import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Es1
        Es1 esercizio1 = new Es1();
        String[] arrayIniziale = {"a","b","c","d","e"};
        String stringaDaAggiungere = "Nuova";
        String[] nuovoArr = esercizio1.inserisciInArray(arrayIniziale,stringaDaAggiungere);

        for (int i = 0; i < nuovoArr.length; i++) {

        System.out.println(nuovoArr[i]);
        }

    }

}