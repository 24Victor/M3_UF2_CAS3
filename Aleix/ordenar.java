import java.util.Arrays;

public class ordenar {
    public static void main(String[] args) {

        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};
        ordenarArreglo(myArray);
    }
    
    public static void ordenarArreglo(String[] myArray) {
        Arrays.sort(myArray);
        for (String s : myArray) {
            System.out.println(s);
        }
    }
}
