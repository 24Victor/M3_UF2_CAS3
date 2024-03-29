import java.util.Scanner;

import javax.lang.model.element.Element;

import java.util.Arrays;

/**
 * Classe que defineix el menú i les seves funcions
 * Aquest menú conté les següents opcions:
 * Inserir, Localitzar, Recuperar, Suprimir, SuprimirDada, Anul·lar, PrimerDarrer, Imprimir, Ordenar, localitzarEnOrdenada i Sortir
 * Aquesta classe fa servir Scanner i Arrays
 * @author grup3
 * @version final
 */
public class menu {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Funció principal que executa el menú
     * @param args Arguments de la línia de comandes
     */
    public static void main(String[] args) {
        int numElem = 10;
        String myArray[] = demanarCognoms("Introdueix 10 cognoms: ");
        int opcio;

        do {
            mostrarMenu();
            opcio = llegirOpcio();
            executarOpcio(opcio, myArray, numElem);
        } while (opcio != 11);

        System.out.println("Sortint del programa...");
    }

    /**
     * Demana a l'usuari que introdueixi 10 cognoms
     * @param msg Missatge que es mostra per a demanar els cognoms
     * @return Un array de 10 strings amb els cognoms introduïts per l'usuari
     */
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

    /**
     * Mostra el menú per pantalla
     */
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

   /** Llegeix una opció del teclat
    * @return La opció llegida
    */
    private static int llegirOpcio() {
        int opcio = sc.nextInt();
        sc.nextLine(); 
        return opcio;
    }
    /**
     * Executa una opció en funció del seu valor
     * @param opcio Opció a executar
     * @param myArray Array de Strings
     * @param numElem Número d'elements en l'array
     */

    private static void executarOpcio(int opcio, String[] myArray, int numElem) {
        String x;
        int p;
        int opcion;
        switch (opcio) {
            case 1:
            // Demanem al usuari un element
            System.out.println("Introdueix un element per a afegir al array");
            x = sc.nextLine();
            //Demanem al usuari una posició per a afegir el element
            System.out.println("Introdueix la posició que vols inserir");
            p = sc.nextInt();
                inserir(myArray, numElem, p, x);
                break;
            case 2:
            // Demanar al usuari que introueixi el element
            System.out.println("Introdueix un element per a localitzar al array");
            x = sc.nextLine();
                localitzar(myArray, numElem, x);
                break;
            case 3:
            System.out.println("Introdueix la posició que vols consultar");
            p = sc.nextInt();
                recuperar(myArray, p);
                break;
            case 4:
            // Demanem a l'usuari quina posició vol eliminar */
            System.out.println("Ingresa la posició de l'element que vols eliminar: ");   
            p = sc.nextInt();     
                suprimir(myArray, numElem, p);
                break;
            case 5:
            // Demanar al usuari que introdueix el element que vol eliminar
            System.out.println("Introdueix l'element que vols eliminar:");
            x = sc.nextLine();
                suprimirDada(myArray, numElem, x);
                break;
            case 6:
                anul_lar(myArray, numElem);
                break;
            case 7:
            // Demanar al usuari que ingrese 1 per a imprimir el primer element o 2 per a imprimir el últim
            System.out.println("Ingresa 1 per a imprimir el primer elemento o 2 para imprimir el últim:");
            opcion = sc.nextInt();
                primerDarrer(myArray, numElem, opcio);
                break;
            case 8:
                imprimir(myArray, numElem);
                break;
            case 9:
                ordenar(myArray);
                break;
            case 10:
                localitzarEnOrdenada(myArray, numElem);
                break;
            case 11:
                // No fa res, el bucle se trenca i se surt del programa
                break;
            default:
                System.out.println("Opció inválida");
        }
    }

    /**
     * Imprimeix els elements de l'array
     * @param myArray Array de Strings
     * @param numElem Número d'elements en l'array
    */
    public static void imprimirArray(String[] myArray, int numElem) {
        System.out.println("ELEMENTS ANTICS DE LA LLISTA:");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

    /**
     * Imprimeix els elements actuals de l'array
     * @param myArray Array de Strings
     * @param numElem Número d'elements en l'array
     */
    public static void imprimirArrayActual(String[] myArray, int numElem) {
        System.out.println("ELEMENTS ACTUALS DE LA LLISTA:  ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

    /**
     * Insereix un element, x, en una posició, p, de la llista, passant els elements de la posició p i següents a la posició immediatament posterior
     * @param myArray Array de Strings
     * @param numElem Número d'elements en l'array
     * @param p Posició on s'insereix l'element
     * @param x Element a inserir
     */
    private static void inserir(String[] myArray, int numElem, int p, String x) {
        /* inserir : insereix un element, x, en una posició, p, de la llista, 
        passant els elements de la posició p i següents a la posició immediatament posterior. 
        Entrada: element x, posició p, llista 
        Sortida: llista*/

        imprimirArray(myArray, numElem);  
        inserirElement(p, x, myArray, numElem); 
        imprimirArrayActual(myArray, numElem); 
    }

    /**
     * Insereix un element a la posició especificada
     * @param p Posició on s'insereix l'element
     * @param x Element a inserir
     * @param array Array de Strings
     * @param numElem Número d'elements en l'array
     */
    public static void inserirElement(int p, String x, String[] array, int numElem) { //declara un mètode anomenat "inserirElement()", que s'utilitza per inserir l'element a la posició especificada
        desplacarDreta(p, array, numElem);  //crida al mètode "desplacarDreta()" per desplaçar els elements de l'array a la dreta, per fer espai per al nou element
        inserirElementEnPosicio(p, x, array); //crida al mètode "inserirElementEnPosicio()" per inserir el nou element a la posició especificada
    }

    /**
     * Desplaça els elements de l'array a la dreta, per fer espai per al nou element
     * @param p Posició on s'insereix l'element
     * @param array Array de Strings
     * @param numElem Número d'elements en l'array
     */
    public static void desplacarDreta(int p, String[] array, int numElem) { //declara un mètode anomenat "desplacarDreta()", que s'utilitza per desplaçar els elements de l'array a la dreta, per fer espai per al nou element
        for (int i = numElem - 2; i >= p; i--) { //utilitza un bucle for per desplaçar els elements de l'array a la
            array[i + 1] = array[i]; //dreta, començant des del final de l'array i movent-se cap a la posició especificada. A cada iteració del bucle, l'element actual es mou a la dreta una posició
        }
    }

    /**
     * Insereix el nou element a la posició especificada
     * @param p Posició on s'insereix l'element
     * @param x Element a inserir
     * @param array Array de Strings
     */
    public static void inserirElementEnPosicio(int p, String x, String[] array) {  //  declara un mètode anomenat "inserirElementEnPosicio()", que s'utilitza per inserir el nou element a la posició especificada
        array[p] = x; //estableix el valor del element en la posicio especificada al nou element
    }

    /**
     * localitzar: localitza la (primera) posició p en la que es troba un element donat x.
     * Entrada: element x, llista
     * Sortida: posició p
     * @param myArray l'array on es busca
     * @param numElem el nombre d'elements a l'array
     * @param x l'element que es vol trobar
     */
    private static void localitzar(String[] myArray, int numElem, String x) {
        // Buscar el cognom i mostrar la posició si és troba
        int posicio = localitzarElem(myArray, x, numElem);
        
        //Si p és igual a -1 el cognom no es trobara, sino imprimira el cognom amb el element i la posició
       if (posicio == -1) {
       System.out.println("El cognom " + x + " no ha estat trobat.");
       } else {
       System.out.println("El cognom " + x + " està en la posició " + posicio);
       }
    }
    
    /**
     * localitzarElem: cerca un element donat en un array i retorna la seva posició.
     * @param myArray l'array on es cerca l'element
     * @param cognom l'element que es vol trobar
     * @param numElem el nombre d'elements a l'array
     * @return la posició de l'element; si no es troba, retorna -1
     */
    public static int localitzarElem(String[] myArray, String cognom, int numElem) {
        int posicio = -1;
        for (int i = 0; i < numElem; i++) {
            if (cognom.equals(myArray[i])) {
                posicio = i;
                break;
            }
        }
        return posicio;
    }

    /**
     * recuperar: troba l'element x que està a la posició p
     * Entrada: posició p, llista
     * Sortida: element x
     * @param myArray l'array on es cerca l'element
     * @param p la posició de l'element que es vol trobar
     */
    private static void recuperar(String[] myArray, int p) {
        // Bucle for per a trobar la posicio.
        for (int i = 0; i <= p; i++) { 
            if(i == p){
            System.out.println("El element de la posicio és: " + myArray[i]);                                                                                                        
            }
        }
    }
    
    /**
     * suprimir: elimina de la llista l'element de la posició p
     * Entrada: posició p, llista
     * Sortida: llista
     * @param myArray l'array on es vol eliminar l'element
     * @param numElem el nombre d'elements a l'array
     * @param p la posició de l'element que es vol eliminar
     */
    private static void suprimir(String[] myArray, int numElem, int p) {
        for (int i = p - 1; i < numElem - 1; i++) {      
            myArray[i] = myArray[i + 1];        
        }
        /* Restem una posició a l'array */
        numElem--;
        //imprimim el array actual per a oberservar els elements restants de la llista
        imprimirArrayActual(myArray, numElem);
    }

    /**
     * SuprimirDada: elimina de la llista qualsevol ocurrència de l'element x
     * Entrada: element x, llista
     * Sortida: llista
     * @param myArray l'array on es vol eliminar l'element
     * @param numElem el nombre d'elements a l'array
     * @param x el valor de l'element que es vol eliminar
     */
    private static void suprimirDada(String[] myArray, int numElem, String x) {
        /*elimina de la llista qualsevol ocurrència de l'element x 
        Entrada: element x, llista
        Sortida: llista*/

         // Imprimir el array actual
         System.out.println("Array actual:");
         imprimi(myArray);
 
         // Buscar la posició del element
         int posicio = -1;
         for (int i = 0; i < numElem; i++) {
             if (myArray[i].equals(x)) {
                 posicio = i;
                 break;
             }
         }
 
         // Si el element se troba en el array eliminarlo
         if (posicio != -1) {
             for (int i = posicio; i < numElem - 1; i++) {
                 myArray[i] = myArray[i + 1];
             }
             myArray[myArray.length - 1] = "";
             myArray = ajustarArray(myArray);
             System.out.println("Element eliminat.");
         } else {
             System.out.println("L'element no es troba en el array.");
         }
 
         // Imprimir el array actualizat
         System.out.println("Array actualitzat:");
         imprimi(myArray);
     }
 
    /**
     * Imprimi: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
     * Entrada: llista
     * Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla
     * @param myArray l'array que es vol imprimir
     * @param numElem el nombre d'elements a l'array
     */
      private static void imprimi(String[] myArray) {
        for (String element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Ajusta l'array passat per paràmetre eliminant tots els elements nuls
     * @param myArray L'array a ajustar
     * @return L'array ajustat
     */
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

    /**
     * Fa que els primers "numElem" elements de l'array passat per paràmetre siguin nulls i actualitza "numElem"ç
     * @param myArray L'array a anul·lar
     * @param numElem El nombre d'elements que es vol anul·lar
     */

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
        //Imprimim el array actual que està buit
        System.out.println("L'array està buit ");
        for (int i = 0; i < 10; i++);{
        }

    }
    
    /**
     * Proporciona el primer o el darrer element de l'array passat per paràmetre segons l'opció seleccionada
     * @param myArray L'array de què es vol obtenir l'element
     * @param numElem El nombre d'elements de l'array
     * @param opcio L'opció seleccionada (1 per obtenir el primer element i 2 per obtenir el darrer)
     */
    private static void primerDarrer(String[] myArray, int numElem, int opcio) {
        /*proporciona el primer o el darrer element de la llista
        Entrada: llista, opció (primer o darrer)
        Sortida: element x*/

        // Imprimir el array ACTUAL
        System.out.println("Array Actual:");
        imprimirArray(myArray, numElem);
      
        // Imprimir el primer o últim element segon la opció ingresada per el usuari
        if (opcio == 1) {
            System.out.println("Primer element: " + myArray[0]);
            } else if (opcio == 2) {
                System.out.println("Últim element: " + myArray[numElem - 1]);
                } else {
                  System.out.println("Opció inválida.");
              }
        }
        
    /**
     * Imprimeix tots els elements de l'array del primer a l'últim amb la seva posició
     * @param myArray L'array de què es vol imprimir els elements
     * @param numElem El nombre d'elements de l'array
     */
        private static void imprimir(String[] myArray, int numElem) {
            /*imprimir: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
            Entrada: llista
            Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla.*/
            //bucle for per a la posició del element    
            for(int i = 0; i < numElem; i++){
                
                //printejar el element i la posició del array
                if(myArray[i] != "")
                {
                    System.out.println("Element: " + myArray[i] + " és la posició " + (i+1));
                }
                System.out.println("");
            }
        }

    /**
     * Ordena lexicogràficament els elements de l'array
     * @param myArray L'array de què es vol ordenar els elements
     */
        private static void ordenar(String[] myArray) {
            Arrays.sort(myArray);
            for (String s : myArray) {
                System.out.println(s);
            }
        }    

    /**
     * Localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
     * @param myArray L'array ordenat on es buscarà l'element
     * @param numElem El nombre d'elements en l'array
     * @return La posició p on es troba l'element
     */
        private static int localitzarEnOrdenada(String[] myArray, int numElem){

                /*localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
                Entrada: llista ordenada
                Sortida: posició p*/

                //Declarem 3 variables, el baux(minim del array), alt(el array complet -1) i mitg
                int baix = 0;
                int alt = numElem -1;
                int mitg;

                //Demanem al usuari que introdueix un element per a buscar.
                System.out.print("Introdueix el element a buscar: ");
                String element = sc.next();

                ordenar(myArray);
                //mentre baix sigui menor o igual que alt és calcula la posició mitg com la meitat entre baix i alt.
                while (baix <= alt) {
                    mitg = (baix + alt) / 2;
            
                    /*Si l'element a la posició mitg és igual a l'element buscat, s'executa un segon bucle 
                    while per trobar la primera aparició de l'element a la llista.*/
                    if (myArray[mitg].equals(element)) {
                        /* Disminueix mitg en 1 fins que mitg sigui 0 o fins que l'element a la posició mitg-1 
                        sigui diferent de l'element buscat.*/
                        while (mitg > 0 && myArray[mitg - 1].equals(element)) {
                            mitg--;
                        }
                        /*Si l'element a la posició mitg és menor que l'element buscat, significa que l'element buscat és a la 
                        meitat dreta de la llista, per la qual cosa s'actualitza baix com a mitg + 1. */
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