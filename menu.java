import java.util.Scanner;
import java.util.Arrays;

public class menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numElem = 10;
        String myArray[] = demanarCognoms("Introdueix 10 cognoms: ");
        int p = 0;
        int opcio;

        do {
            mostrarMenu();
            opcio = llegirOpcio();
            executarOpcio(opcio, myArray, numElem, p);
        } while (opcio != 11);

        System.out.println("Sortint del programa...");
    }

    public static String[] demanarCognoms(String msg){
        String[] myArray = new String[10];
        System.out.println(msg);
        for(int i = 0; i < 10; i++){
            myArray[i] = sc.nextLine();
            if(i<9){
                System.out.println("Seguent: ");
            }
        }
        return myArray;
    }
    
    
    private static void mostrarMenu() {
        System.out.println("Benvingut al menu");
        System.out.println("----------------------");
        System.out.println("1. Inserir");
        System.out.println("2. Localitzar");
        System.out.println("3. Recuperar");
        System.out.println("4. Suprimir");
        System.out.println("5. SuprimirDada");
        System.out.println("6. Anul·lar");
        System.out.println("7. PrimerDarrer");
        System.out.println("8. Imprimir");
        System.out.println("9. Ordenar");
        System.out.println("10. localitzarEnOrdenada");
        System.out.println("11. Sortir");
        System.out.print("Eligiu una opció: ");
    }

    private static int llegirOpcio() {
        int opcio = sc.nextInt();
        sc.nextLine(); 
        return opcio;
    }

    private static void executarOpcio(int opcio, String[] myArray, int numElem, int p) {
        switch (opcio) {
            case 1:
                inserir(myArray, numElem, p);
                break;
            case 2:
                localitzar(myArray, numElem);
                break;
            case 3:
                recuperar(myArray, numElem, p);
                break;
            case 4:
                suprimir(myArray, numElem, p);
                break;
            case 5:
                suprimirDada(myArray, numElem);
                break;
            case 6:
                anul_lar(myArray, numElem);
                break;
            case 7:
                primerDarrer(myArray, numElem);
                break;
            case 8:
                imprimir(myArray, numElem);
                break;
            case 9:
                ordenar(myArray);
                break;
            case 10:
                localitzarEnOrdenada(myArray);
                break;
            case 11:
                // No fa res, el bucle se trenca i se surt del programa
                break;
            default:
                System.out.println("Opció inválida");
        }
    }

    private static void inserir(String[] myArray, int numElem, int p) {
        /* inserir : insereix un element, x, en una posició, p, de la llista, 
        passant els elements de la posició p i següents a la posició immediatament posterior. 
        Entrada: element x, posició p, llista 
        Sortida: llista*/

        int posicio = llegirPosicio();
        String element = llegirElement();
        inserirElement(posicio, element, myArray);
        imprimirArray(myArray);
    }

    public static int llegirPosicio() {
        System.out.println("INGRESA LA POSICIO ON VOLS INSERIR L'ELEMENT:");
        return sc.nextInt();
    }

    public static String llegirElement() {
        System.out.println("INGRESA L'ELEMENT QUE VOLS AFEGIR:");
        return sc.next();
    }

    public static void inserirElement(int posicio, String element, String[] array) {
        desplacarDreta(posicio, array);
        inserirElementEnPosicio(posicio, element, array);
    }

    public static void desplacarDreta(int posicio, String[] array) {
        for (int i = array.length - 2; i >= posicio; i--) {
            array[i + 1] = array[i];
        }
    }

    public static void inserirElementEnPosicio(int posicio, String element, String[] array) {
        array[posicio] = element;
    }

    public static void imprimirArray(String[] array) {
        System.out.println("ELEMENTS RESTANTS DE LA LLISTA:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void localitzar(String[] myArray, int numElem) {
       // Demanar al usuari que introueixi el cognom
       String cognomBuscat = llegirCognom("Introdueix el cognom que vols consultar");

       // Buscar el cognom i mostrar la posició si és troba
       int posicio = localitzarCognom(myArray, cognomBuscat, numElem);

       if (posicio == -1) {
       System.out.println("El cognom " + cognomBuscat + " no ha estat trobat.");
       } else {
       System.out.println("El cognom " + cognomBuscat + " està en la posició " + posicio);
       }

    }
    
    public static String llegirCognom(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.println(missatge); 
        String cognom = sc.nextLine();
        sc.close();
        return cognom;
    }
    
    public static int localitzarCognom(String[] myArray, String cognom, int numElem) {
        int posicio = -1;
        for (int i = 0; i < numElem; i++) {
            if (cognom.equals(myArray[i])) {
                posicio = i;
                break;
            }
        }
        return posicio;
    }

    private static void recuperar(String[] myArray, int numElem, int p) {
        /*recuperar: troba l'element x que està a la posició p
        Entrada: posició p, llista
        Sortida: element x*/
        int posicio;
        posicio = llegirEnter ("Introdueix la posició que vols consultar");

        String prova;
        prova = recuperar(posicio, myArray );
        System.out.println(prova);
    }

    public static String recuperar ( int p, String[] llista) {
        return llista[p];
    }

    /*Demanar enter al usuari i el torna */
    public static int llegirEnter (String msg){
        System.out.println(msg);
        int enter = sc.nextInt();
        return enter;

    }

    private static void suprimir(String[] myArray, int numElem, int p) {
        /* suprimir: elimina de la llista l'element de la posició p
            Entrada: posició p, llista
            Sortida: llista*/
                                
        /* Demanem a l'usuari quina posició vol eliminar */
        System.out.println("Ingresa la posició de l'element que vols eliminar: ");      //  Demanem a l'usuari quina posició vol eliminar
        int position = sc.nextInt();        // Llegeix l'entrada del usuari i l'asigna a la variable "position"

        /* Verifiquem que la posició ingresada sigui valida */
        while (position < 1 || position > numElem) {        // Bucle que s'executa mentres la posicio ingresada no sigue valida (es a dir, menor que 1 o major que numElem)
            System.out.println("Error, torna a introduir un numero del 1 al 10.");
            position = sc.nextInt();        // Llegeix l'entrada del usuari novament i l'asigna a la variable "position"
        }
        
        suprimi(myArray, position, numElem);        // Crida al metodo "suprimir" i pasa l'Array i la posicio del element a eliminar com arguments
    }

    public static void suprimi(String[] myArray, int position, int numElem) {       // Metode para eliminar l'element en la posición especificada
        
        /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
        for (int i = position - 1; i < numElem - 1; i++) {      // Bucle para recorrer cada element detras de la posiciO especificada I desplazarlo a l'esquerra
            myArray[i] = myArray[i + 1];        // Asigna el seguent element al element actual
        }

        /* Restem una posició a l'array */
        numElem--;

        /* Imprimim l'array ja actualitzada, mostran tots els elements restants a l'Array amb el nou ordre */
        System.out.println("Elements restants de la llista: ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

    private static void suprimirDada(String[] myArray, int numElem) {
        /*elimina de la llista qualsevol ocurrència de l'element x 
        Entrada: element x, llista
        Sortida: llista*/

        // Imprimir el array actual
        System.out.println("Array actual:");
        imprimiS(myArray);

        // Demanar al usuari que introdueix el element que vol eliminar
        System.out.println("Introdueix l'element que vols eliminar:");
        String element = sc.nextLine();

        // Buscar la posició del element
        int posicio = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(element)) {
                posicio = i;
                break;
            }
        }

        // Si el element se troba en el array eliminarlo
        if (posicio != -1) {
            for (int i = posicio; i < myArray.length - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            myArray[myArray.length - 1] = null;
            myArray = ajustarArray(myArray);
            System.out.println("Element eliminat.");
        } else {
            System.out.println("L'element no es troba en el array.");
        }
    }

    private static void imprimiS(String[] myArray) {
        for (String element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static String[] ajustarArray(String[] myArray) {
        int cognoms = 0;
        for (String element : myArray) {
            if (element == null) {
                cognoms++;
            }
        }
        String[] newArray = new String[myArray.length - cognoms];
        int index = 0;
        for (String element : myArray) {
            if (element != null) {
                newArray[index] = element;
                index++;
            }
        }
        return newArray;
    }

    private static void anul_lar(String[] myArray, int numElem) {
        /* Funció anul_lar */
        // Fem un bucle per a canvie el valor de les posicións a NULL
        for (int i = 0; i < numElem; i++){
            myArray[i] = null;
        }
        // Canviem a 0 el valor de numElem
        numElem = 0;

        // Comprovem que l'array està buit imprimint-lo en pantalla
        System.out.println("L'array està buit ");
        System.out.println("Podem veure que el contingut de l'array es tot NULL: ");
        imprimirAnul(myArray);

    }
    private static void imprimirAnul(String[] myArray) {
        // Fem el bucle per a imprimir el contigut de l'array
        for (int i = 0; i < 10; i++){
            System.out.println(myArray[i]);
        }
    }

    private static void primerDarrer(String[] myArray, int numElem) {
        /*proporciona el primer o el darrer element de la llista
        Entrada: llista, opció (primer o darrer)
        Sortida: element x*/

        // Imprimir el array actual
        System.out.println("Array actual:");
        imprimi(myArray);
      
        // Demanar al usuari que ingrese 1 per a imprimir el primer element o 2 per a imprimir el últim
        System.out.println("Ingresa 1 per a imprimir el primer element o 2 per a imprimir el últim:");
        int opcio = sc.nextInt();
      
        // Imprimir el primer o últim element segon la opció ingresada per el usuari
        if (opcio == 1) {
            System.out.println("Primer element: " + myArray[0]);
            } else if (opcio == 2) {
                System.out.println("Últim element: " + myArray[myArray.length - 1]);
                } else {
                  System.out.println("Opció inválida.");
              }
          }
      
        private static void imprimi(String[] myArray) {
              for (String element : myArray) {
                  System.out.print(element + " ");
              }
              System.out.println();
            }
    
    private static void imprimir(String[] myArray, int numElem) {
        print(myArray);
    }

    private static void print(String[] myArray) {
        /*imprimir: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
        Entrada: llista
        Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla.*/
        //bucle for per a la posició del element    
        for(int z = 0; z < myArray.length; z++){
            //printejar el element i la posició del array
            System.out.println("Element: " + myArray[z] + " és la posició " + (z+1));
        }
        }
    
    private static void ordenar(String[] myArray) {

        Arrays.sort(myArray);
        for (String s : myArray) {
            System.out.println(s);
        }
    }    

    private static int localitzarEnOrdenada(String[] myArray){

            /*localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
            Entrada: llista ordenada
            Sortida: posició p*/

            //Declarem 3 variables, el baux(minim del array), alt(el array complet -1) i mitg
            int baix = 0;
            int alt = myArray.length -1;
            int mitg;

            System.out.print("Introdueix el element a buscar: ");
            String element = sc.next();

            ordenar(myArray);
            while (baix <= alt) {
                mitg = (baix + alt) / 2;
        
                if (myArray[mitg].equals(element)) {
                    // Trobeu l'element, ara trobeu la primera aparició d'aquest
                    while (mitg > 0 && myArray[mitg - 1].equals(element)) {
                        mitg--;
                    }
                } else if (myArray[mitg].compareTo(element) < 0) {
                    // element és més gran que mig, cerca a la meitat dreta
                    baix = mitg + 1;
                } else {
                    // L'element és més petit que el mitjà, cerqueu a la meitat esquerra
                    alt = mitg - 1;
                }
                System.out.println("Posició de l'element " + element + " és " + mitg);
                break;
            }
            return -1;
        }      
}
