package resolucao;

import java.util.*;

public class TerceiroDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> numeros = new HashSet<>();

        for (int i = 0; i < n; i++) {
            numeros.add(sc.nextInt());
        }

        int counter = 0;
        for (int numero : numeros) {
            int target = k + numero;
            if (numeros.contains(target)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
