import java.util.Arrays;

public class ordenar {
    public static void main(String[] args) {

        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};
        ordenarArreglo(myArray);
        imprimirArreglo(myArray);
    }
    
    public static void ordenarArreglo(String[] arreglo) {
        Arrays.sort(arreglo);
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (String s : arreglo) {
            System.out.println(s);
        }
    }
}
