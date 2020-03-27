package TA3;

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
/*
Ejercicio #1 – Contador de palabras
Es necesario implementar un programa que sea capaz de contar la cantidad de palabras de una frase
(las palabras son separadas por un espacio). Para ello es necesario crear una clase Java (llamada “ContadorPalabras”)
capaz de realizar esta funcionalidad y otra clase Java (llamada “Principal”) para realizar las pruebas
(a través del método “main”).
NOTAS IMPORTANTES:
•	No se puede utilizar la función “split” para resolver este problema
•	Una palabra debe contener al menos un carácter alfabético
•	Se puede usar métodos como “isLetter”, “isDigit”, etc….
*/

/*
    Ejercicio 1: Lenguaje natural
    Se recibe una cadena de texto, se comienza a recorrer la cadena caracter a caracter verificando si es una letra.
    Si se encuentra un caracter que no es una letra, que no es el final de linea y anteriormente ya se habia encontrado una letra, se asume que es un especio,
    por lo tanto finaliza una palabra y se incrementa el contador de palabras en 1.
*/
public class ContadorPalabras {
    int consonantes = 0;
    int vocales = 0;

    public int cuentaPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        char[] caracteres = texto.toCharArray();
        int contador = 0;
        boolean esPalabra = false;
        int finalLinea = texto.length() - 1;
        for (int i = 0; i < caracteres.length; i++) {
            // Encontre una letra, sigo hasta entontrar espacio
            if (Character.isLetter(caracteres[i]) && i != finalLinea) {
                esPalabra = true;
                // Si encuentro espacio y esPalabra es true, sumo uno al contador. vuelvo
                // esPalabra a false.
            } else if (!Character.isLetter(caracteres[i]) && esPalabra) {
                contador++;

                esPalabra = false;
                // Cuento la ultima palabra
            } else if (Character.isLetter(caracteres[i]) && i == finalLinea) {
                contador++;
            }
        }
        return contador;
    }

    /*
     * Ej 2. SUBEQUIPO A lenguaje natural. Este metodo recorre un texto recibido por
     * parametro, verificamos si cada uno de los caracteres es vocal y lo pasamos a
     * minúscula con la función toLowerCase(), en caso de ser vocal incrementamos el
     * contador "vocales", en caso contrario comparamos si es letra incrementamos el
     * contador "consonante" luego asignamos el valor de los contadores a las
     * variables de instancia para luego consutarlas mediante los getters.
     */

    public void CantVocalesYConsonantes(String frase) {
        int vocales = 0;
        int consonantes = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales += 1;
            } else if (Character.isLetter(c)) {
                consonantes += 1;
            }
        }
        this.vocales = vocales;
        this.consonantes = consonantes;
    }

    public int getVocales() {
        return this.vocales;
    }

    public int getConsonantes() {
        return this.consonantes;
    }

    /*
     * Ej 2. Sub-equipo B. Lenguaje natural. Este metodo recorre un texto recibido
     * por parametro y verifica cuantas palabras poseen una cantidad mayor de
     * caracteres especificadas por parametro. Este devuelve como resultado la
     * cantidad de palabras que tienen una mayor cantidad de caracteres a los
     * especificados.
     */

    public int CantPalabras(String texto, int caracterMayor) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        char[] caracteres = texto.toCharArray();
        int contador = 0;
        int contadorCaracteres = 0;
        boolean esPalabra = false;
        int finalLinea = texto.length() - 1;
        for (int i = 0; i < caracteres.length; i++) {
            // Encontre una letra, sigo hasta entontrar espacio
            if (Character.isLetter(caracteres[i]) && i != finalLinea) {
                esPalabra = true;
                contadorCaracteres++;
                // Si encuentro espacio y esPalabra es true, sumo uno al contador. vuelvo
                // esPalabra a false.
            } else if (!Character.isLetter(caracteres[i]) && esPalabra) {
                if (contadorCaracteres > caracterMayor) {
                    contador++;
                }
                contadorCaracteres = 0;
                esPalabra = false;
                // Cuento la ultima palabra
            } else if (Character.isLetter(caracteres[i]) && i == finalLinea) {
                if (contadorCaracteres > caracterMayor) {
                    contador++;
                }

            }
        }
        return contador;
    }

    // ejercicio 3
    /*
     * Referencias: tutoriales y material “Manejo básico de lectura / escritura de
     * archivos” publicados. Se solicita extender las funcionalidades del Contador
     * de Palabras desarrollado en la Unidad anterior. Las nuevas funcionalidades
     * son: ● Retornar un vector de Strings con las líneas de texto contenidas en un
     * archivo dado, e indicar la cantidad de líneas leídas. ● Dado un vector de
     * Strings que contiene las líneas de texto, retornar la cantidad de palabras
     * contenidas. Firmas que deben tener los métodos solicitados class
     * ContadorPalabras { … public String[] obtenerLineas (String archivo); public
     * int cantPalabras (String[] lineasArchivo); } A realizar : 1. Describir en
     * lenguaje natural las nuevas funcionalidades. Escribir qué métodos de manejo
     * de archivo estándar de JAVA se van a utilizar. 2. Implementar las
     * funcionalidades solicitadas, modificando la clase “ContadorPalabras”
     * anteriormente desarrollada. ¡Revisar la documentación de la API de JAVA para
     * las clases y métodos utilizados! 3. Desarrollar una clase “Principal” capaz
     * de probar las nuevas funcionalidades a través del método “main”. En este
     * método, se ha de instanciar un ContadorPalabras y emitir por consola la
     * cantidad de palabras de un archivo cuyo nombre se pasa por parámetro de línea
     * de comando (revisar la documentación del método main). Se proveerá un archivo
     * de texto de ejemplo en la webasignatura.
     */

    // Este metodo recibe un archivo y devuelve un array capaz de almacenar todas las lineas del mismo.
    public String[] ObtenerLineas(String txt) {
        int contadorLineas = 0;

        try {
            File archivo = new File(txt);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String lineaActual = br.readLine();
            while (lineaActual != null) {
                contadorLineas += 1;
                lineaActual = br.readLine();
            }
            br.close();

            FileReader fr2 = new FileReader(archivo);
            BufferedReader br2 = new BufferedReader(fr2);
            String[] lineasArchivo = new String[contadorLineas];

            String lineasiguiente = br2.readLine();
            for (int i = 0; i < lineasArchivo.length; i++) {
                lineasArchivo[i] = lineasiguiente;
                lineasiguiente = br2.readLine();
            }
            br2.close();
            return lineasArchivo;

        } catch (Exception e) {
            e.printStackTrace();
            String [] array = new String[0];
            return array;
        }
    }

    /*
    * metodo que cuenta la cantidad de palabras que hay en un array
    */
    public int CantidadPalabras(String[] lineasArchivo) {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        int contador = 0;
        for (int i = 0; i < lineasArchivo.length; i++) {
            contador += contadorPalabras.cuentaPalabras(lineasArchivo[i]);
        }
        return contador;

    }

    public static void main(String[] args) {
        ContadorPalabras prueba = new ContadorPalabras();
        System.out.println(("Cantidad de palabras con largo mayor al indicado: " + prueba.CantPalabras("hola hola hola hol", 3)));

        prueba.CantVocalesYConsonantes("hola hola hOla hol123");
        System.out.println("Cantidad De Consonantes: " + prueba.getConsonantes());
        System.out.println("Cantidad De Vocales: " + prueba.getVocales());


        //Ejercicio 3
       // System.out.println("Lineas del archivo: "+prueba.ObtenerLineas("C:/Users/FIT/Desktop/UCU/Algoritmos I/RepoEjerciciosAplicacion/TrabajosAplicacion"));

        System.out.println("Cantidad de palabras: "+ prueba.CantidadPalabras(prueba.ObtenerLineas("C:/Users/FIT/Desktop/UCU/Algoritmos I/RepoEjerciciosAplicacion/TrabajosAplicacion/TA3/archivoPrueba.txt")));

    }
}