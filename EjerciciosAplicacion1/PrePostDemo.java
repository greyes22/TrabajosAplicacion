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
    }

}