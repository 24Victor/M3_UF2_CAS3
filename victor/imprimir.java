import java.util.Scanner;

public class imprimir {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};
        imprimir(myArray);
    }

    private static void imprimir(String[] myArray) {
    /*imprimir: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
    Entrada: llista
    Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla.*/
    //bucle for per a la posició del element    
    for(int z = 0; z < myArray.length; z++){
        //printejar el element i la posició del array
        System.out.println("Element: " + myArray[z] + " és la posició " + (z+1));
    }
    }
}