import java.util.Scanner;

public class ProvaMenu {
    public static void main(String[] args) {
        /*test prova menu */

    String[] prova = {"dilluns (L)", "dimarts (M)", "dimecres (X)"};
    imprimirArray(prova);
    }

    public static void imprimirArray(String[] a) {
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);

        }
    }

}

    /*resultat = menu(prova);*/

    //System.out.println("debug, veure que val el resultat" + resultat);

/*public static char menu (String[] opcions) {
    imprimir un menu 
    imprimirArray(opcions);

    guardar opcio que escull usuari 
    char op = llegirUnChar();

    tornar opció escollida 
    return 'c';
    
}*/

/*Llegeix una paraula del teclat i retorna
 * el primer caracter de la paraula
public static char llegirUnChar(){
    Scanner teclat = new Scanner(System.in);
    String llegida = teclat new Scanner(System.in);
    System.out.println("Debug, paraula llegida" + llegida);
    char caracter = llegida.charAt(0);*/
