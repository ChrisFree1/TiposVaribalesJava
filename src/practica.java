public class practica {
    public static void main(String[] args) {

        // Tabla de multiplicar -- Para practicar


        for(int contador = 0; contador <= 10; contador ++ ){

            for(int multiplica = 0; multiplica <= 10; multiplica ++){

                if (contador <= multiplica){
                    break;
                }

                System.out.print("+");
            }

            System.out.println();

        }

    }
}
