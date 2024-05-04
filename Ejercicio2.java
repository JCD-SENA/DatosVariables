package juanca.tiposdedatosyvariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio2
Separar la parte entera del decimal en dos valores distintos
*/

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double full, decimalPart;
        int integerPart;
        System.out.print("Ingrese el numero completo: ");
        full = Double.parseDouble(input.readLine()); // Se pasa el tipo de texto a long
        integerPart = (int)full; // Se pasa el valor de long a entero, perdiendo los decimales
        decimalPart = full-integerPart;
        System.out.println(full+"\nDecimal: "+decimalPart+"\nEntera: "+integerPart);
    }
}
