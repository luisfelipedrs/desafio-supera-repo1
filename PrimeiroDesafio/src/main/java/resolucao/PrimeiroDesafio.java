package resolucao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> entradas = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            entradas.add(sc.nextInt());
        }

        entradas.forEach(numero -> {
            if (numero % 2 == 0) numerosPares.add(numero);
            if (numero % 2 != 0) numerosImpares.add(numero);
        });

        resultado.addAll(numerosPares.stream().sorted().toList());
        resultado.addAll(numerosImpares.stream().sorted(Comparator.reverseOrder()).toList());

        resultado.forEach(System.out::println);

        sc.close();
    }
}
