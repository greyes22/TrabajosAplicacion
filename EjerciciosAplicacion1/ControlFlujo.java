/*
 * Ejercicio 4. 1. Considere el siguiente código:
 *
 * a) ¿Qué salida cree que producirá el código si aNumber es 3? R: second string
 * third string
 *
 * b) Cree un programa de prueba que contenga el código anterior; haga que
 * aNumber valga 3. ¿Cuál es la salida del programa? ¿Es la que usted predijo?
 * Explique por qué la salida es la que es, o, en otras palabras, ¿cuál es el
 * flujo de control del código provisto? Si, es la misma salida. Debido a la
 * declaracion de toma de decisiones IF, se modifica el flujo de control
 * "normal" de ir ejecutando desde arriba hacia abajo. Al cumplir con el IF se
 * ejecuta lo que esté contenido dentro de el, se vuelve a ramificar al aparecer
 * otro IF, al no cumplir con la condicion del mismo, entra en ELSE y se imprime
 * en pantalla "second string". Finalmente, al salir de este segundo IF, el
 * programa continua ejecutandoce linea a linea ejecutando la ultima sentencia,
 * la cual imprime "third string".
 *
 * c) Utilizando sólo espacios y saltos de línea, reformateamos el código para
 * hacer que el flujo de control sea más fácil de entender. d) Utilizamos llaves, {
 * y } para aclarar aún más el código.
 */

class ControlFlujo {
    public static void main(String[] args) {
        int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else
                System.out.println("second string");
        System.out.println("third string");

        // c)
        int aNumberC = 3;
        if (aNumberC >= 0)
            if (aNumberC == 0)
                System.out.println("first string");
            else
                System.out.println("second string");
        System.out.println("third string");

        // d)
        int aNumberD = 3;
        if (aNumberD >= 0) {

            if (aNumberD == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");
    }

}