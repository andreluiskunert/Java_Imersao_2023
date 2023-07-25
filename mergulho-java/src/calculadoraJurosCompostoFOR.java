import java.util.Scanner;

public class calculadoraJurosCompostoFOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" calculadora Juros Composto FOR :");
        double valorAcumulado = 10_000;
        double taxaJurosMensal = 0.8;
        int periodoemmeses = 12;
        System.out.println("* Explica sobre a  FOR...");
        for (int mes = 1;mes <=  periodoemmeses ; mes++ ){
          //  valorAcumulado = valorAcumulado + (valorAcumulado * taxaJurosMensal / 100);
            valorAcumulado += valorAcumulado * taxaJurosMensal / 100; // Ingrementar
            System.out.println("Mês é "+ mes + " = " + valorAcumulado + ";");
        }

        System.out.println("The End.");
        entrada.close();
    }
}
