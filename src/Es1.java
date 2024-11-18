public class Es1 {
     int moltiplica(int a, int b){
        return a * b;
    }
    String concatena(String stringa, int numero){
         return stringa + numero;
    }
    String[] inserisciInArray(String[] arr , String stringa){
         if(arr.length != 5){
             System.out.println("L'array deve avere esattamente 5 elementi.");
            String[] errore = {"Errore"};
             return errore;
         }
         String[] nuovoArr = new String[6];
       nuovoArr[0] = arr[0];
       nuovoArr[1] = arr[1];
       nuovoArr[2] = stringa;
       nuovoArr[3] = arr[2];
       nuovoArr[4] = arr[3];
       nuovoArr[5] = arr[4];

       return nuovoArr;
    }
}
