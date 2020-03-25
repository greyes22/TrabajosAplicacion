public class PruebaAtributos {
    /*
     * 1. Cree un pequeño programa (clase “PruebaAtributos”) que defina algunos
     * atributos (variables de instancia). Intente crear algunos nombres de
     * atributos incorrectos y vea qué tipo de error produce el compilador. Utilice
     * como guía las reglas y convenciones de nomenclatura (vea el apartado “Naming”
     * en el link anterior)
     */

    /*
     * Respuesta: Si se crean atributos llevando una nomenclatura que no es la
     * convencional, en cuanto al desempeño de la clase no causa problemas. La
     * convención indica que los nombres de los atributos deben comenzar con una
     * letra en minuscula.
     */
   

    private int numero = 1;
    private String Nombre1 = "Nombre";
    private String $nombre = "$nombre";
    private String _nombre;
    private int altura;
    private boolean estado;

    /*
     * 2. Extienda el programa para que imprima los valores de los atributos. Deje
     * los atributos sin inicializar y observe qué sucede al ejecutar.
     * 
     * Respuesta: Al imprimir los atributos sin inicializar, se muestra que por
     * defecto, los atributos son apuntados a null.
     */

    /*
     * 3. Intente lo mismo con variables locales y vea qué errores de compilador
     * puede producir (Familiarizarse con los errores comunes de compilación va a
     * hacer que le sea más fácil reconocer bugs en su código.)
     * 
     * Respuesta: Sin inicializar las variables locales, se le asigna a String: null, int: 0, boolean: false.
     * 
     */

    // Variables locales Parte 3.
    int ancho = 1;
    int largo;
    String apellido;
    boolean estado1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();
        System.out.println(prueba.Nombre1);
        System.out.println(prueba.$nombre);
        System.out.println(prueba.numero);
        System.out.println(prueba._nombre + " - Atributo de tipo String sin inicializar");
        System.out.println(prueba.altura + " - Atributo de tipo int sin inicializar");
        System.out.println(prueba.estado + " - Atributo de tipo boolean sin inicializar");

        //Parte 3.
        System.out.println(prueba.ancho + " - Variable local inicializada");
        prueba.ancho = 2;
        System.out.println (prueba.ancho + " - Cambio valor de variable local");

        System.out.println(prueba.largo + " - Variable local de tipo int sin inicializar");
        System.out.println(prueba.estado1 + " - Variable local de tipo boolean sin inicializar");
        System.out.println(prueba.apellido + " - Variable local de tipo String sin inicializar");

    }

}