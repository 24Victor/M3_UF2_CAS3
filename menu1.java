import java.util.Scanner;

public class menu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        int numElem = 10;
        int p = 0;

        String surnames[] = new String[10];

        //Demanem al usuari que introdueixi un nom
        System.out.println("Introdueix 10 cognoms:");
        for(int i = 0; i < 10; i++){
             surnames[i] = sc.nextLine();   
            System.out.println("Seguent: ");
    }
        do{ 
            System.out.println("Introdueix un número (1 Inserir, 2. Localitzar, 3. Recuperar, 4. Suprimir, 5. SuprimirDada, 6. Anul_lar, 7.PrimerDarrer, 8 Imprimir i 9 Surtir)");
            entrada = sc.nextInt();
                       
            switch (entrada) {
                
                case 1:
                /*
                 * inserir : insereix un element, x, en una posició, p, de la llista, 
                 * passant els elements de la posició p i següents a la posició immediatament posterior. 
                 * Entrada: element x, posició p, llista 
                 * Sortida: llista
                 */

               /* Restem un element a l'array per a poder afegir l'element després */  
               numElem = numElem-1;

               /* Condicional (si el número d'elements es == a la llargada de l'array s'imprimeix un missatge) */
                if (numElem == surnames.length) {
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
                        surnames[i + 1] = surnames[i];
                    }
                    
                    /* Inserta el nou element a la posició especificada */
                    surnames[m] = x;
                    numElem++;

                    /* Imprimim l'array per a fer la comprovació de que tot funciona correctament */
                    System.out.println("Elements restants de la llista: ");
                    for (int i = 0; i < numElem; i++) {
                        System.out.println(surnames[i]);
                    }
                }   
                    
                break;

                        
                case 2:
                System.out.println("Localitzar");

                /* localitza la (primera) posició p en la que es troba un element donat x.
                    Entrada: element x, llista
                    Sortida: posició p
                */

               /* Funció localitzar */
    //Demanem quin cognom volem buscar
        System.out.println("Introdueix un cognom a buscar ");

        //Li posem buscat al cognom que anem a buscar
        String buscat = "";
        buscat = sc.next();

        //Fem un bucle que fagi tot el recorregut de l'array
        for (int i = 0; i < numElem; i++){
            //Si el cognom buscat coincideix amb algun cognom de l'array 
            if(buscat.equals(surnames[i])){
                //Imprimim el cognom i la posició en la que es troba
                System.out.println("El cognom " + surnames[i] + " està en la posició " + i);
            }
          
        }
                break;
                        
                case 3:
                System.out.println("Recuperar");
                /*recuperar: troba l'element x que està a la posició p
                Entrada: posició p, llista
                Sortida: element x*/
                    System.out.println("Introdueix un numero del 1 al 10");
                    p = sc.nextInt();

                //demana al usuari que introduixque un numero del 1 al 10
                while( p < 0  || p > numElem ){
                    System.out.println("Error, Tornar a introduir un numero del 1 al 10");
                    p = sc.nextInt();
        
                 } 
                //Printeja el array el qual ens demana el usuari
                System.out.println(surnames[p-1]);
                break;   
                
                case 4:

                /*  
                    suprimir: elimina de la llista l'element de la posició p
                    Entrada: posició p, llista
                    Sortida: llista
                */
                
                /*  
                *    suprimir: elimina de la llista l'element de la posició p
                *    Entrada: posició p, llista
                *    Sortida: llista
                */
                
                /* Suprimir dada */
                
                /* Titol del programa */
                System.out.println("Suprimir");
                                
                /* Demanem a l'usuari quina posició vol eliminar */
                System.out.println("Ingresa la posició de l'element que vols eliminar: ");
                int position = sc.nextInt();

                /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
                for (int i = position; i < numElem - 1; i++) {
                    surnames[i] = surnames[i + 1];
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
                    System.out.println(surnames[i]);
                }

                break;

                
                case 5:
                System.out.println("SuprimirDada");
                 /*elimina de la llista qualsevol ocurrència de l'element x */
                 /*Entrada: element x, llista
                 Sortida: llista
                 */
                /*Introduir cognom que vol eliminar */

                    System.out.println("Introdueix el cognom que vols eliminar");
                    String x = "";
                    x=sc.next();


                /*Bucle per a desplaçar una posició cap a l'esquerra quan trobi una coincidencia amb x*/
                    for (int i =0; i < numElem; i++){
                        /*Si x equival a algun element de dins de l'array: */
                        if(x.equals(surnames[i])){
                            /*Mourem els elements que queden detras d'aquesta posicio cap a l'esquerra, fins cercar un altra coincidencia si n'hi ha */
                            for (int j = i; j<numElem; j++){
                                surnames[i]=surnames[i+1];
                                numElem--;
                                i--;
                            }
                        }
                    }
        
                /*Imprimir la llista actualitzada */
                    for(int i=0; i< numElem; i++){
                        System.out.println(surnames[i]);
                    }
                        

                break;  
                
                case 6:
               /* Funció anul_lar */
    // Fem un bucle per a canvie el valor de les posicións a NULL
    for (int i = 0; i < numElem; i++){
        surnames[i] = null;
    }
    // Canviem a 0 el valor de numElem
    numElem = 0;

    // Comprovem que l'array està buit imprimint-lo en pantalla
    System.out.println("L'array està buit ");
    System.out.println("Podem veure que el contingut de l'array es tot NULL: ");
    // Fem el bucle per a imprimir el contigut de l'array
    for (int i = 0; i < 10; i++){
        System.out.println(surnames[i]);
    }
                break;   

                case 7:
                System.out.println("PrimerDarrer");
                /*proporciona el primer o el darrer element de la llista
                Entrada: llista, opció (primer o darrer)
                Sortida: element x
                */
                while(true){
                    System.out.println("Introdueix 1 si vols veure el primer o 2 si vols veure el darrer");
                    int i= sc.nextInt();
                /*Si es igual a 1 ens imprimira el primer element introduit a l'array */
                    if(i==1){
                        System.out.println(surnames[0]);
                break;
                }
                /*Si es igual a 2 ens imprimira el darrer element introduit a l'array */
                else if(i==2){
                    System.out.println(surnames[numElem - 1]);
                break;
                 }
                /*Finalment si el numero introduit no es ni 1 ni 2 direm que no e vàlid i li demanarem un altre vegada el numero*/
                else{
                    System.out.println("El numero introduit no esta a la llista torna a introduir un numero");
                    break; 
                }
                  
                }
            
                case 8:
                System.out.println("Imprimir");
                    /*imprimir: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
                     Entrada: llista
                    Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla.*/
                    //bucle for per a la posició del element    
                      for(int z = 0; z < numElem;z++){
                        //printejar el element i la posició del array
                        System.out.println( "Element: " + surnames[z]+" és la posició "+ (z+1) );
                      }
                break;   

               case 9:
               System.out.println("Surtir");  
             }
        }while(entrada != 9);{  
    }
    } 
}  