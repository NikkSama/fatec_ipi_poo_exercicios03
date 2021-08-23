package exercicio;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja fatorar: ");
        n = scan.nextInt();

        System.out.println(
                String.format("O fatorial de %d é %d ", n, (n = n * (n - 1))));
    }
}
