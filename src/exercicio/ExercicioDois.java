package exercicio;

public class ExercicioDois {
    public static void main(String[] args) {
        for (int n=100; n>=1; n--){
            System.out.print(n + " ");
        }
        System.out.println();

        int n=100;
        while (n>=1){
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        n=100;
        do{
            System.out.print(n + " ");
            n--;
        } while (n >= 1);
    }
}

