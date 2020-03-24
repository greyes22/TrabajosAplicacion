/*
Ejercicio #2 Operadores
1. Analice el siguiente programa para identificar oportunidades de utilizar asignaciones
compuestas (operadores).
*/

public class ejercicio2 {
    public static void main (String[] args){

    int result = 1 + 2;
    System.out.println(result);
    result = result - 1;
    System.out.println(result);
    result = result * 2;
    System.out.println(result);
    result = result / 2;
    System.out.println(result);
    result = result + 8;
    result = result % 7;
    System.out.println(result);
    }
}

/*------------------------------------------------------------
2. Qué pasa al usar construcciones del tipo
int a = 5;
int i = 3;
a+=++i;   en este caso lo que se hace es sumar a + 4 y guardarlo en la variable a,
es decir, a = a + 4. ya que se incrementa i antes de sumarlo
--------------------------------------------------------------
*/

// 3. Analice el siguiente programa y observe su ejecución.
class PrePostDemo {
    public static void main(String[] args){
    int i = 3;
    i++;
    System.out.println(i);
    ++i;
    System.out.println(i);
    System.out.println(++i);
    System.out.println(i++);
    System.out.println(i);
    }
}