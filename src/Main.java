public class Main {
    public static void main(String[] args) {

        // Variable para convertir
        
        double variable1 = 201.45;
        int variable2 = (int) variable1; // Aplicando el metodo Cast

        System.out.println("variable2 = " + variable2); // No la redondea, no toma en cuenta el deciaml


        // Desafio de Java
        System.out.println("Utilizando metodos para Enteros: ");
        System.out.println(" ");
        short pequeno = -12345; // Solo soporta maximo 5 números
        System.out.println("Utilizando el metodo short : " + pequeno );
        System.out.println(" ");
        long numeroLargo = 1234567891112131415l; // Maximo soporta 19 numeros -- Numeros grandes
        System.out.println("Utilizando me metodo long : " + numeroLargo);
        byte numeroMasPequeño = 123; //Maximo soporta 3 numeros
        System.out.println(" ");
        System.out.println("Utilizando el metodo byte : " + numeroMasPequeño);


        // FLoat es parecido al double pero es para decimales pequeños

        float numeroDecimalPequeño = 1234567891011121314151617181920.1234567891011121314151617F;


        // Repaso
        System.out.println("Respaso para practicar ");
        System.out.println("Numeros Enteros: ");
        int numeroEntero = 1234567890; // int soporta 10 digitos
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println(" ");
        System.out.println("Numeros double: ");
        double numeroDecimal = 123456789.123456789;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(" ");
        System.out.println("Numero short: ");
        short numeroPequeño = 12345; // Soporta 5 digitos
        System.out.println("numeroPequeño = " + numeroPequeño);
        System.out.println(" ");
        System.out.println("Numeros Largos: ");
        long numeroLargos = 1234567891011121314L; // Soporta 19 digitos de numeros
        System.out.println("numeroLargo = " + numeroLargos);
        System.out.println(" ");
        System.out.println("NUmeros Mas pequeños Enteros: ");
        byte numeroMuyPequeño = 123; // Solo soporta 3 digitos
        System.out.println("numeroMuyPequeño = " + numeroMuyPequeño);
        float numerosFlotantesPequeños = 123.132F;
        System.out.println("numerosFlotantesPequeños = " + numerosFlotantesPequeños);
    }
}