package resolucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        strings.forEach(string -> {
            StringBuilder stringBuilder = new StringBuilder();

            String primeiraMetade = string.substring(0, string.length()/2);
            stringBuilder.append(new StringBuilder(primeiraMetade).reverse());

            String segundaMetade = string.substring((string.length()/2));
            stringBuilder.append(new StringBuilder(segundaMetade).reverse());

            System.out.println(stringBuilder);
        });
    }
}
