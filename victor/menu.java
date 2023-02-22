import java.util.Scanner;
public class menu {
    public static void main(String[]args){
        String[] prova = {"dilluns(L)", "dimarts(M)", "dimecres(X)"};
        char resultat;

        resultat = menu(prova);
        System.out.println("debug, veure que val el resultat " + resultat);
    }

    public static char menu (String[] opcions){

        /*Imprimir un menu */
        imprimirArray(opcions);

        /*Guardar opció que escull usuari */
        char op = llegirUnChar();

        /*Torna un resultat l'eleccio de l'usuari */
        return op;
    }

    /**
     * @param a: array a imprimir
     */

    public static void imprimirArray(String[] a){
        for(int i = 0; i < a.length; i++){
        System.out.println(a[i]);
        }
    }

    public static char llegirUnChar() {
        Scanner teclat = new Scanner(System.in);
        String llegida = teclat.nextLine();

        System.out.println("Debug, paraula llegida " + llegida);
        char caracter = llegida.charAt(0);

        return caracter;
    }
}
