import java.util.Scanner;

public class CalculadoraCordissol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Explica o que significa cordisol;
        Controla o Street;
        ø Parei aos 39 minutos+|_
         */
        System.out.println("Calculadora Cordisol");
        double cortisol = 3;
     boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
     boolean resultadoAnormal = !resultadoNormal;
     //   System.out.println("Seu nivél de Street é de "+ resultadoNormal +";");
       // System.out.println("Seu nivél de Street é de "+ resultadoAnormal +";");
    /*
     Segunda-feira 24 /07/2023
     das 12:07:00 a 12:37:00 h+|-
     */
        if (cortisol >= 6.0 && cortisol <= 18.4)
        {
            System.out.println("Seu está normal continue se cuidado....");
        } else if (cortisol > 18.04) {
            System.out.println("Bora pedalar...é fazer exercicios...feche a boca da gula..");
        } else {
            System.out.println("Está a baixo do peso...");
        }

        System.out.println("The End.");
        entrada.close();
    }
}
