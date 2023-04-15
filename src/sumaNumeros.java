public class sumaNumeros {
    public static void main(String[] args) {
        // Suma de numeros del 1 al 10
        System.out.println("Suma de numeros del 1 al 10");
        int contador = 0;
        int total = 0;

        while (contador <=10){
            total = total + contador;
            contador ++;
        }
        System.out.println(total);
    }
}

