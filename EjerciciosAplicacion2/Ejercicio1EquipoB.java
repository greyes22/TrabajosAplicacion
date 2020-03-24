/*
Ejercicio #2 – subequipo “B”
Hacer un programa en Java que indique si un número dado es primo. Si lo es, el programa deberá
calcular la suma de los números pares desde 0 hasta el número dado, y en caso contrario deberá
calcular la suma de los números impares desde 0 hasta el número dado. Utilizar solamente
sentencias while o do-while.
*/

public class Ejercicio1EquipoA{

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

    public static void main(String[] args) {

    }
}
