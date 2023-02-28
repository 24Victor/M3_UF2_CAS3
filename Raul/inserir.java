public class inserir {

    public static void inserirElement (int [] myArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUEIX LA POSICIO ON VOLS INTRODUIR L'ELEMENT");
        int p = sc.nextInt(); 
        int c = 0;
        for(int i = p; i>c ; i--){
            myArray [i] = myArray [i-1];
        }
        c++;
        System.out.println("INTRODUEIX EL NOU ELEMENT");
        myArray[p] = sc.nextInt();
    }
}