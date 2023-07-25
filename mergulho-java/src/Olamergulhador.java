
import java.util.Scanner;

public class Olamergulhador {
    public static void main(String[] args) {
        // Fundamentos da Linguagem da Java
        // Quinta_feira, 20/07/2023 as 12:05:00 h+|-
        // Duração : 26:28:00  h+|-
        // Explica passo a passo sobre a ferramentas;
        // Comentários:
        //  -> // -> comentario de linhas;
        // /* Bloco  */
        // Cuidado com muitos comentários;
        // Códigos deve ser lidos como uma redação;

        Scanner entrada = new Scanner(System.in);
        System.out.println("  .....Ola Mergulhador...");
        String nomeCompleto = "André Luis Kunert";
        System.out.println("O meu nome completo é " + nomeCompleto );
        System.out.println("Explica a aulas...");
        int minhaIdade = 41;
        int suaIdade = 29;
         /*
         Sexta-feira,21/07/2023
         das 12:05:00 as h+|-
         duração:
         */
        int totalIdade = minhaIdade + suaIdade ;
        double peso = 89.9;
        float taxa = 1_294.93f;
        boolean comprasAprovadas = true ;// false
         boolean comDesconto = false;
         boolean maiorIdade = minhaIdade == 41;
        System.out.println("Sou maior de Idade? " + maiorIdade +";");
        System.out.println("Deve desconto na compras" + comDesconto + ", infelizmente não podemos...");
        System.out.println("Sua compra da bike Nero Absolute foi "+ comprasAprovadas + " muito obrigado pela compra;");
        System.out.println("Meu peso é " + peso);
        /* Sexta-feira,21/07/2023
         das 12:05:00 as h+|-
         duração:
         */


        System.out.println("Nossas idades juntas são:" + totalIdade + ";");

        System.out.println("tenho " + minhaIdade +",faço A.D.S...estudo Java...;");
        System.out.println("The End");

        entrada.close();
    }
}
