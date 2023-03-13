import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el elemento a buscar: ");
        int elementoBuscado = scanner.nextInt();

        int posicion = -1; // Inicializamos en -1 para indicar que no se ha encontrado el elemento

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elementoBuscado) {
                posicion = i; // Actualizamos la posición del elemento buscado
                break; // Salimos del bucle
            }
        }

        if (posicion != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el array");
        }
    }
}

