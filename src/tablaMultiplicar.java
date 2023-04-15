public class tablaMultiplicar {

    public static void main(String[] args) {

        // Creacion de tablas de multiplicar

        for (int contador = 1; contador <= 10; contador ++){

            for (int multiplicacion = 1; multiplicacion<=10;multiplicacion++ ){


                System.out.print(contador*multiplicacion);
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
