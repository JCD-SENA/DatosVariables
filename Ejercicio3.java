package juanca.tiposdedatosyvariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Pregunta al usuario sus nombres y apellidos, altura en centimetros, año de nacimiento y año actual
(No se me ocurrió un buen ejercicio simple que quedara dentro del marco sin entrar ya en otros temas)
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String names, lastNames;
        float cm;
        int bYear, cYear;
        System.out.print("Ingrese los nombres: ");
        names = input.readLine();
        System.out.print("Ingrese los apellidos: ");
        lastNames = input.readLine();
        System.out.print("Ingrese la altura en centrimetros: ");
        cm = Float.parseFloat(input.readLine());
        System.out.print("El año de nacimiento: ");
        bYear = Integer.parseInt(input.readLine());
        System.out.print("El año actual: ");
        cYear = Integer.parseInt(input.readLine());
        System.out.println("\nNombre: "+(names+" "+lastNames)+"\nAltura (metros): "+(cm / 100)+"\nEdad: "+(cYear-bYear));
    }
}
