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
   

    private int number = 1;
    private String Name = "Nombre";
    private String $name = "$nombre";
    private String _name;
    private int height;
    private boolean state;

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
    int width = 1;
    int large;
    String lastName;
    boolean state1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();
        System.out.println(prueba.Name);
        System.out.println(prueba.$name);
        System.out.println(prueba.number);
        System.out.println(prueba._name + " - Atributo de tipo String sin inicializar");
        System.out.println(prueba.height + " - Atributo de tipo int sin inicializar");
        System.out.println(prueba.state + " - Atributo de tipo boolean sin inicializar");

        //Parte 3.
        System.out.println(prueba.width + " - Variable local inicializada");
        prueba.width = 2;
        System.out.println (prueba.width + " - Cambio valor de variable local");

        System.out.println(prueba.large + " - Variable local de tipo int sin inicializar");
        System.out.println(prueba.state1 + " - Variable local de tipo boolean sin inicializar");
        System.out.println(prueba.lastName + " - Variable local de tipo String sin inicializar");

    }

}