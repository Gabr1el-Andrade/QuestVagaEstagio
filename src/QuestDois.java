import java.util.Scanner;

public class QuestDois {


    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int n) {

        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está na sequência de Fibonacci.");
        }
    }
}



