/* Ejercicio 2
 * 3. Analice el siguiente programa y observe su ejecución.
 */


class PrePostDemo {
    /*
     * Respuesta:
     * Lo que cambia es la precedencia del operador, es decir, si primero se asigna
     * y luego se incrementa (i++), también conocido como operador de postincremento
     *  o en caso contrario si primero se incrementa y
     * luego se asigna (++i), operador de preincremento.
     */
    public static void main(String[] args) {

        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6"
        System.out.println(i++); // "6"
        System.out.println(i); // "7"

        /*
         * Ejercicio 3. Identifique los tipos de las siguientes sentencias:
         * 
         * 1. b) Asignación aValue = 8933.234;
         * 
         * 2. a) Incremento aValue++;
         * 
         * 3. d) Invocación de método System.out.println("Hello World!");
         * 
         * 4. c) Creación de objeto Bicycle myBike = new Bicycle();
         */

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
         * en pantalla "second string". Finalmente, al salir de este segundo IF, al
         * seguir "dentro" del primero, se imprime en pantalla "third string".
         * 
         * c) Utilizando sólo espacios y saltos de línea, reformatee el código para
         * hacer que el flujo de control sea más fácil de entender. d) Utilice llaves, {
         * y } para aclarar aún más el código.
         */

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
            } 
            else {
                System.out.println("second string");
            }

            System.out.println("third string");
        }
            
    }

}