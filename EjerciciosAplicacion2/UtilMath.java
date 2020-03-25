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
*/

public class UtilMath {

    public static void main(String[] args) {
        factorial(3); // esta linea es solo para testear el metodo.
        System.out.println(sumaHastaPrimo(7)); // Debe ser 12 ya que es primo.
        System.out.println(sumaHastaPrimo(6)); // Debe ser 9 ya que no es primo.
    }

    /*
     * Ejercicio #1 – subequipo “A” Implementar un método que calcule el factorial
     * de un número entero cualquiera, siendo este un parámetro del método. Utilizar
     * únicamente bucles for. Si N=3 entonces factorial(N) = 3.2.1 = 6
     */
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /*
     * Ejercicio #2 – subequipo “B” Hacer un programa en Java que indique si un
     * número dado es primo. Si lo es, el programa deberá calcular la suma de los
     * números pares desde 0 hasta el número dado, y en caso contrario deberá
     * calcular la suma de los números impares desde 0 hasta el número dado.
     * Utilizar solamente sentencias while o do-while.
     */
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if ((n % 2 != 0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static long sumaHastaPrimo(long n) {
        long suma = 0;
        int contador = 0;
        if (isPrime(n)) {

            while (contador <= n) {
                if (contador % 2 == 0) {
                    suma += contador;
                }
                contador++;
            }
        } else {
            while (contador <= n) {
                if (contador % 2 != 0) {
                    suma += contador;
                }
                contador++;
            }
        }
        return suma;
    }
}
