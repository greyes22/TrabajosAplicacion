// Ejercicio #4 Control de flujo
// Lectura: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
// 1. Considere el siguiente código:

public class ejercicio4 {

    public static void main(String[] args) {
        prueba(3);
    }

    static void prueba(int aNumber){
        if (aNumber >= 0){
            if (aNumber == 0){
                System.out.println("first string");
            }
            else System.out.println("second string");
        }
        System.out.println("third string");
    }
}

/*-------------------------------------------------------------------------------------
a) ¿Qué salida cree que producirá el código si aNumber es 3?
b) Cree un programa de prueba que contenga el código anterior; haga que aNumber
valga 3. ¿Cuál es la salida del programa? ¿Es la que usted predijo? Explique por qué la
salida es la que es, o, en otras palabras, ¿cuál es el flujo de control del código
provisto?
c) Utilizando sólo espacios y saltos de línea, reformatee el código para hacer que el flujo
de control sea más fácil de entender.
d) Utilice llaves, { y } para aclarar aún más el código.
-----------------------------------------------------------------------------------------
a) el codigo imprimira el mensaje "second string" y luego el mensaje "third string"
b) definitivamente la salida es la que se predijo, analicemos:
al ejecutarse el programa la variable aNumber = 3 por lo tanto en la primera linea entra en el if ya que 3 >= 0
en la segunda linea, no entra en el if ya que 3 != 0 por lo tanto no se ejecuta el bloque dentro del if y pasa directamente al else.
ejecuta lo que hay dentro del else imprimiendo "second string", luego se sigue ejecutando linea a linea hacia abajo y
termina imprimiendo "third string"
c) codigo formateado.
d) llaves agregadas.
------------------------------------------------------------------------------------------
*/