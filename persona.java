package persona_empleado;

/**
 *
 * @author leo_w
 */

//herencia simple de la clase empleado a la clase persona 
public class persona extends empleado {

    //creamos un constructor para despues crear objetos
    public persona() {

    }

    //creamos el metodo de impresion de datos
    public void imprimir_datos() {
        System.out.println("==========================================");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Anual: $" + salario_anual);
    }
}
