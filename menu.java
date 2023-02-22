char menu (String[] opcions){

    /*Imprimir un menu */
    imprimirArray(opcions);

    /*Guardar opció que escull usuari */
    char op = llegirUnChar();

    /*Torna un resultat l'eleccio de l'usuari */
    return op;
}