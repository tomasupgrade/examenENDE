public class Principal {
    public static void main (String[] args ) {
        System.out.println(Vectores.imprimir("hola"));

        int num = 2;

        if (Numeros.parImpar(num)) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}