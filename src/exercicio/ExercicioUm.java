package exercicio;

public class ExercicioUm {
    public static void main(String[] args) {
        for (int n=1; n<=100; n++){
            System.out.print(n + " ");
        }
        System.out.println();

        int n=1;
        while (n<=100){
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        n=1;
        do{
            System.out.print(n + " ");
            n++;
        } while (n <= 100);

    }
}
