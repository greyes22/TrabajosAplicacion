/*
Ejercicios #1 y #2
Para realizar estos ejercicios, cada Equipo se dividirá en dos subequipos, “A” y “B”. El subequipo
A realizará el Ejercicio 1 y el subequipo B el Ejercicio 2.
Pasos a desarrollar:

1. Crear un paquete, dentro de UT1, “TA2” Y verificar que se refleja en todas las
computadoras del Equipo. Dentro de este paquete crear la clase “UtilMath” donde se
implementarán ambos ejercicios.
2. Subequipo A desarrolla el Ejercicio #1 y lo prueba; Subequipo B desarrolla el Ejercicio
#2 y lo prueba.
3. El subequipo B analiza y prueba el código generado para el Ejercicio #1, con los
comentarios del subequipo A. Propone eventuales cambios.
4. Se responden las preguntas planteadas en pantalla.
5. El subequipo A analiza y prueba el código generado para el Ejercicio #2, con los
comentarios del subequipo B. Propone eventuales cambios.

Ejercicio #1 – subequipo “A”
Implementar un método que calcule el factorial de un número entero cualquiera, siendo este
un parámetro del método. Utilizar únicamente bucles for.
Si N=3 entonces factorial(N) = 3.2.1 = 6
*/

public class Ejercicio1EquipoA {

    public static void main(String[] args) {
        // factorial(3); esta linea es solo para testear el metodo.
    }

    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
