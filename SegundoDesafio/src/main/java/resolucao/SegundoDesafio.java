package resolucao;

import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            System.out.printf("%s nota(s) de R$ %s.00%n", (int) valor / nota, nota);
            valor = valor % nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            System.out.printf("%s moeda(s) de R$ %.2f%n", (int) (valor / moeda), moeda);
            valor = valor % moeda;
        }
    }
}
