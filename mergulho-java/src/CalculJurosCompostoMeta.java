import java.util.Scanner;

public class CalculJurosCompostoMeta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Calcul Juros Composto Meta  ");
           double valorAcumulado = 10_000;
           double taxaJurosMensal =0.8;
           double valorMeta = 20_000;
           int mes = 0;

             while ( valorAcumulado < valorMeta) {
                 mes++;
                 valorAcumulado += valorAcumulado * taxaJurosMensal /100;
                 System.out.println("Mês " + mes + " = " + valorAcumulado +";");
             }
        System.out.println("The End");
        entrada.close();
    }
}
