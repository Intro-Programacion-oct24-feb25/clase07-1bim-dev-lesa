/*
 Generar una solución que permita ingresar y presentar por teclado las operaciones básicas de suma, resta, multiplicación.
El usuario ingresará por teclado el número de la tabla a generar, el límite de la tabla.

Ejemplo:

Si el usuario ingresa el número de tabla: 4
Si el usuario ingresa el límite de tabla: 5

El programa debe presentar:

Tabla de sumar

4 + 1 = 5
4 + 2 = 6
4 + 3 = 7
4 + 4 = 8
4 + 5 = 9

Tabla de restar

4 - 1 = 3
4 - 2 = 2
4 - 3 = 1
4 - 4 = 0
4 - 5 = -1

Tabla de multiplicar

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo102 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla;
        int contador = 1;
        int operacion;
        int tabla;
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limite_tabla = entrada.nextInt();
        
        String suma = ""; // cadena acumulador
        String resta = "";
        String multiplicacion = "";
        String cadena = "";
        suma = String.format("%sTabla de suma\n", suma);
        resta = String.format("%sTabla de resta\n", resta);
        multiplicacion = String.format("%sTabla de multiplicar\n", multiplicacion);
        while (contador <= limite_tabla){
            operacion = tabla + contador;
            
            suma = String.format("%s%d+%d=%d\n", 
                    suma, 
                    tabla, 
                    contador,
                    operacion);
            
            operacion = tabla - contador;
            resta = String.format("%s%d-%d=%d\n", 
                    resta, 
                    tabla, 
                    contador,
                    operacion);
            
            operacion = tabla * contador;
            multiplicacion = String.format("%s%d*%d=%d\n", 
                    multiplicacion, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
        cadena = String.format("%s%s\n%s\n%s\n",cadena,suma,resta,multiplicacion);
        System.out.printf("%s", cadena);
        
    }
}
