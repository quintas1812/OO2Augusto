//Escriba una clase Main para poder llamar al metodo AprendiendoLambdas#unMetodo(C c) de la siguiente forma:
public class Main {
    public static void main(String[] args) {
    AprendiendoLambdas lambdas = new AprendiendoLambdas();
    //a. Utilizando un lambda dado que imprima true si el largo del String es par, false en caso contrario.
    lambdas.unMetodo((c)->{return (c.length()%2 ==0)? true:false;});
    //b. Utilizando un lambda dado que imprima true si el String empieza con “a” minúscula, false en caso contrario.
    lambdas.unMetodo((c)->{return c.startsWith("a");});
}
}
