import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = scanner.nextInt();
        int resultado = numero + 10;
        System.out.println("el resultado es: " + resultado);
    }
}