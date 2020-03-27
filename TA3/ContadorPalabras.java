package TA3;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

/*
    Ejercicio 1: Lenguaje natural
    Se recibe una cadena de texto, se comienza a recorrer la cadena caracter a caracter verificando si es una letra.
    Si se encuentra un caracter que no es una letra, que no es el final de linea y anteriormente ya se habia encontrado una letra, se asume que es un especio,
    por lo tanto finaliza una palabra y se incrementa el contador de palabras en 1.
*/
public class ContadorPalabras {
    private int consonantes = 0;
    private int vocales = 0;

    public int getVocales() {
        return this.vocales;
    }

    public int getConsonantes() {
        return this.consonantes;
    }

    // cuenta las palabras de una string recibida por parametros
    public int cuentaPalabrasString(String texto) {
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
     *
     * COMENTARIOS DEL SUBEQUIPO B
     * hemos renombrado el nombre del metodo ya que debe comenzar con minuscula y ademas es recomendable que los nombres
     * sean verbos
     */
    public void contarVocalesYConsonantes(String frase) {
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

    /*
     * Ej 2. Sub-equipo B. Lenguaje natural. Este metodo recorre un texto recibido
     * por parametro y verifica cuantas palabras poseen una cantidad mayor de
     * caracteres especificadas por parametro. Este devuelve como resultado la
     * cantidad de palabras que tienen una mayor cantidad de caracteres a los
     * especificados.
     *
     * COMENTARIOS DEL SUBEQUIPO A
     * hemos renombrado el nombre del metodo ya que debe comenzar con minuscula y ademas es recomendable que los nombres
     * sean verbos
     */
    public int contarPalabrasMayores(String texto, int caracterMayor) {
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
    // Este metodo recibe un archivo y devuelve un array capaz de almacenar todas
    // las lineas del mismo.
    public String[] ObtenerLineasDeArchivo(String txt) {
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
            String[] array = new String[0];
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
            contador += contadorPalabras.cuentaPalabrasString(lineasArchivo[i]);
        }
        return contador;

    }
}

// clase que contiene el metodo main en el cual estaremos testeando nuestro programa con cada uno de sus metodos.
class Principal {
    public static void main(String[] args) {
        ContadorPalabras prueba = new ContadorPalabras();
        System.out.println(("Cantidad de palabras con largo mayor al indicado: "
                + prueba.contarPalabrasMayores("hola hola hola hol", 3)));

        prueba.contarVocalesYConsonantes("hola hola hOla hol123");
        System.out.println("Cantidad De Consonantes: " + prueba.getConsonantes());
        System.out.println("Cantidad De Vocales: " + prueba.getVocales());

        System.out.println("Cantidad de palabras: " + prueba.CantidadPalabras(prueba.ObtenerLineasDeArchivo(
                "C:/Users/FIT/Desktop/UCU/Algoritmos I/RepoEjerciciosAplicacion/TrabajosAplicacion/TA3/archivoPrueba.txt")));

    }
}