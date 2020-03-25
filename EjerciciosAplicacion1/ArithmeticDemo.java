/*
Ejercicio 2.
1. Analice el siguiente programa para identificar oportunidades de utilizar asignaciones
compuestas (operadores).

*/

public class ArithmeticDemo {
    public static void main(String[] args) {

        int result = 1 + 2; // result is now 3
        System.out.println(result);
        result = result - 1; // result is now 2
        System.out.println(result);
        result = result * 2; // result is now 4
        System.out.println(result);
        result = result / 2; // result is now 2
        System.out.println(result);
        result = result + 8; // result is now 10
        result = result % 7; // result is now 3
        System.out.println(result);

        System.out.println("Utilizando operadores compuestos:");
        int result2 = 1 + 2; // result2 is now 3
        System.out.println(result2);
        result2--; // result2 is now 2
        System.out.println(result2);
        result2 *= 2; // result2 is now 4
        System.out.println(result2);
        result2 /= 2; // result2 is now 2
        System.out.println(result2);
        result2 += 8; // result2 is now 10
        result2 %= 7; // result2 is now 3
        System.out.println(result2);


    /*
    2. Qué pasa al usar construcciones del tipo
    */

    int a = 5;
    int i = 3;
    a+=++i;
    System.out.println("el resultado de la parte 2 es: " + a);

    /* Funciona correctamente siguiendo la lógica de asignaciones:
         (a += X) = (a = a + X) y (++ i) = (i = i + 1)
         En conclusión
         (a+=++i) = (a = a + (i + 1))
        */
    }
}
