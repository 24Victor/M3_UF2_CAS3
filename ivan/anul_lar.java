import java.util.Scanner;

public class anul_lar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myArray[] = new String[10];
        int numElem = 10;
        
        //Demanem al usuari que introdueixi un nom
        System.out.println("Introdueix 10 noms:");
        for(int i = 0; i < 10; i++){
             myArray[i] = sc.nextLine();
             if(i<9){
                System.out.println("Seguent: ");
             }
            
        }

/* Funció anul_lar */
    for (int i = 0; i < numElem; i++){
        myArray[i] = null;
    }
    numElem = 0;

    // Comprovar
    System.out.println("L'array està buit ");
    for (int i = 0; i < 10; i++);{
        //System.out.println(surnames[i]);
    }
    }

}