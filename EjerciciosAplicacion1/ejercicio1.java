/*
1. Cree un pequeño programa (clase “PruebaAtributos”) que defina algunos atributos
(variables de instancia). Intente crear algunos nombres de atributos incorrectos y vea
qué tipo de error produce el compilador. Utilice como guía las reglas y convenciones de
nomenclatura (vea el apartado “Naming” en el link anterior)
2. Extienda el programa para que imprima los valores de los atributos. Deje los atributos
sin inicializar y observe qué sucede al ejecutar.
3. Intente lo mismo con variables locales y vea qué errores de compilador puede producir
(Familiarizarse con los errores comunes de compilación va a hacer que le sea más fácil
reconocer bugs en su código.)
*/
public class ejercicio1
{
    private int numero = 1;
    private String nombre; // tipo String mal escrito
    private int altura;

    public static void main(String[] args)
    {
        ejercicio1 prueba = new ejercicio1();
        System.out.println(prueba.numero);
        System.out.println(prueba.numero);
        System.out.println(prueba.nombre);
    }

}
