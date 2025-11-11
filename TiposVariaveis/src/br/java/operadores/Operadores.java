package br.java.operadores;

public class Operadores {
    public static void main(String[] args) {
        double numera1 = 9.5;
        double numera2 = 9.5;
        double somar = (numera2 + numera2);
        System.out.println(somar);
        int numero = 5;

        System.out.println(numero);

        numero = - numero  ;

        System.out.println(numero);
    //x repetição
        int nu1 = 5;
        nu1++;
        System.out.println(nu1);
        System.out.println(nu1 --);
        System.out.println(nu1);


        boolean variavel = true;
        variavel = !variavel;
        System.out.println(!variavel);
        System.out.println(variavel);

    //x ternaria
        int a, b;
        a = 4;
        b = 4;
        String resutadoSoma = a == b ? " Certo" : "errado" ;

       /* if (a == b)
            resutadoSoma = "verdadeiro";

        else
            resutadoSoma = "falso";

        */
        System.out.println(resutadoSoma);

    String nome1 = "Railan";
    String nome3 = "Railan";
    String nome2 = new String("Railan");


        System.out.println(nome1.equals(nome3));
        System.out.println(nome1 == nome2);
        //x
        boolean codicao1 = true;
        boolean codicao2 = true;
        if (codicao1 || codicao2){
            System.out.println("As duas são verdadeira");
        }
        System.out.println("fim");
    }
}
