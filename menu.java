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
                ordenar();
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

        /* Restem un element a l'array per a poder afegir l'element després */  
        numElem = numElem-1;

        /* Condicional (si el número d'elements es == a la llargada de l'array s'imprimeix un missatge) */
        if (numElem == myArray.length) {
            System.out.println("L'array està plena. No es pot inserir més elements.");
        }
        /* Afegir dada i moure a la dreta */
        else{

        /* Titol del programa */
        System.out.println("Inserir");

        /* Demanem a l'usuari que introdueixi un número */
        System.out.println("Ingresa la posición donde quieres insertar el elemento: ");
        int m = sc.nextInt();

        /* Condicional (Si el núumero es menor a 0 o major a 10 demanarem un altre cop el número) */
        while(m < 0 || m > numElem){
            System.out.println("Error, tornar a introduir un numero del 0 al " + numElem);
            m = sc.nextInt();
        }
        /* Demanem a l'usuari que ingresi un element a l'array */
        System.out.println("Ingresa l'element que vols afegir: ");
        String x = sc.next();
            
        /* Desplaça els elements cap a la dreta per a fer espai per a el nou element */
        for (int i = numElem - 1; i >= p; i--) {
            myArray[i + 1] = myArray[i];
        }
        /* Inserta el nou element a la posició especificada */
        myArray[m] = x;
        numElem++;

        /* Imprimim l'array per a fer la comprovació de que tot funciona correctament */
        System.out.println("Elements restants de la llista: ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
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
                
        /* Suprimir dada */
                
        /* Titol del programa */
        System.out.println("Suprimir");
                                
        /* Demanem a l'usuari quina posició vol eliminar */
        System.out.println("Ingresa la posició de l'element que vols eliminar: ");
        int position = sc.nextInt();

        /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
        for (int i = position; i < numElem - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        /* Verifiquem que la posició ingresada sigui valida */
        while(p > position || position > numElem){
            System.out.println("Error, tornar a introduir un numero del 1 al 10.");
            position = sc.nextInt();
        }

        /* Restem una posició a l'array */
        numElem--;

        /* Imprimim l'array ja actualitzada */
        System.out.println("Elements restants de la llista: ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

    private static void suprimirDada(String[] myArray, int numElem) {
        /*elimina de la llista qualsevol ocurrència de l'element x 
        Entrada: element x, llista
        Sortida: llista*/

        /*Introduir cognom que vol eliminar */
        System.out.println("Introdueix el cognom que vols eliminar");
        String x = sc.next();

        /*Bucle per a desplaçar una posició cap a l'esquerra quan trobi una coincidencia amb x*/
        for (int i =0; i < numElem; i++){
            /*Si x equival a algun element de dins de l'array: */
            if(x.equals(myArray[i])){
                /*Mourem els elements que queden detras d'aquesta posicio cap a l'esquerra, fins cercar un altra coincidencia si n'hi ha */
                for (int j = i; j<numElem; j++){
                    myArray[i]=myArray[i+1];
                    numElem--;
                    i--;
                }
            }
        }
        /*Imprimir la llista actualitzada */
        for(int i=0; i< numElem; i++){
            System.out.println(myArray[i]);
        }
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

        while(true){
            System.out.println("Introdueix 1 si vols veure el primer o 2 si vols veure el darrer");
            int i= sc.nextInt();
            /*Si es igual a 1 ens imprimira el primer element introduit a l'array */
            if(i==1){
                System.out.println(myArray[0]);
                break;
            }
            /*Si es igual a 2 ens imprimira el darrer element introduit a l'array */
                else if(i==2){
                    System.out.println(myArray[numElem - 1]);
                break;
                }
                /*Finalment si el numero introduit no es ni 1 ni 2 direm que no e vàlid i li demanarem un altre vegada el numero*/
                else{
                    System.out.println("El numero introduit no esta a la llista torna a introduir un numero");
                    break; 
                }     
        }
    }
    
    private static void imprimir(String[] myArray, int numElem) {
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
    
    private static void ordenar(String[] myArray) {

        Arrays.sort(myArray);
        for (String s : myArray) {
            System.out.println(s);
        }
    }    

    private static void localitzarEnOrdenada(String[] myArray) {

        System.out.print("Introdueix el element a buscar: ");
        String element = sc.next();

        ordenar(myArray);
        int i = myArray.length/2;               
        int resultat;
        while (myArray[i] != element) {
            resultat = element.compareTo(myArray[i]);
            if (resultat > 0){
                i = (i + myArray.length)/2;
            }
        }

        System.out.println("El element se troba en la posició" + " " + p);
      /*localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
        Entrada: llista ordenada
        Sortida: posició p*/

    
        
    }
}
