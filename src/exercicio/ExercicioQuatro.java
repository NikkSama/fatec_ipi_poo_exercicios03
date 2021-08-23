package exercicio;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Primo ou não? Digite um número: ");
        n = scan.nextInt();

        int i = 2;
        if(n == 1){
            System.out.println("É primo");
        }
        while (i <= n){
            if(i == n){
                System.out.println("É primo ");
                break;
            }
            if(n % i == 0){
                System.out.println("Não é primo ");
                break;
            }
            i++;
        }
    }
}
