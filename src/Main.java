import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir el numero para realizar los calculos");
        int num = sc.nextInt();

        System.out.println("La suma es: "+Metodo.Suma1aN(num));
        System.out.println("La multiplicacion es: "+Metodo.Producto1aN(num));
        System.out.println("La media es: "+Metodo.Media1aN(num));
    }
}