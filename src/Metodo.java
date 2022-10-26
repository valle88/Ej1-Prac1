public class Metodo {
    public static  int Suma1aN(int numero){
        int resultado = 0;
        for (int i = 0; i <= numero; i++) {
            resultado += i;

        }
        return resultado;
    }

    public static int Producto1aN(int numero){
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int Media1aN(int numero){
        int resultado = 0;
        for (int i = 0; i <= numero; i++) {
            resultado += i;
        }
        return resultado/numero;
    }
}
