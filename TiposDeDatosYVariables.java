package juanca.tiposdedatosyvariables;

import java.util.Scanner;

/*
Ejercicio 1
Calcular cuotas con un monto y cantidad definidos por el usuario.
*/

public class TiposDeDatosYVariables {
    public static void main(String[] args) {
        int quotes;
        float amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero: ");
        amount = input.nextFloat();
        System.out.print("Cantidad de cuotas: ");
        quotes = input.nextInt();
        System.out.println("El valor de la cuota en cada mes es: "+(amount/quotes));
    }
}