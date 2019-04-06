/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_empleado;

import java.util.Scanner;

/**
 *
 * @author leo_w
 */
public class empleado {

    //definimos los atributos protegidos para la clase persona 
    protected double salario_anual;
    protected String nombre;
    protected int edad;

    //creacion de constructor para crear un objeto de la clase empleado
    public empleado() {

    }

    //declaramos un objeto estatic de tipo Scanner para leer los datos
    static Scanner sc = new Scanner(System.in);

    //definimos un metodo para recibir los datos de cada variable 
    public void recibir_datos() {
        /*declaramos 2 variables de tipo String y una de tipo boolean que despues 
        nos serviran para validar datos*/

        String age;
        String salario;
        boolean cond;

        //solicitamos nombre y asignamos a *String nombre*
        System.out.print("\nIngresa el nombre del empleado: ");
        nombre = sc.nextLine();
        //creamos objeto para llamar metodos de validacion 
        empleado obj = new empleado();
        //se van a repetir lineas de codigo hasta que la condicion sea falsa
        //esto para solicitar la edad y salario hasta que sean correctos
        do {
            cond = false;
            //solicitamos edad y asignamos a *String age*
            System.out.print("\nIngresa la edad del empleado: ");
            age = sc.nextLine();
            cond = obj.validar(age);
            if (cond == true) {
                System.out.print("\n\tError en datos!!");
            }
        } while (cond == true);
        //convertimos la edad de string a int
        edad = Integer.parseInt(age);

        do {
            cond = false;
            //solicitamos salario_anual y asignamos a *String salario*
            System.out.print("\nIngresa el salario anual del empleado: ");
            salario = sc.nextLine();
            cond = obj.validar(salario);
            if (cond == true) {
                System.out.print("\n\tError en datos!!");
            }
        } while (cond == true);
        salario_anual = Double.parseDouble(salario);
    }

    public boolean validar(String x) {
        //declaramos nuestra variable boleana que nos servira como bandera de errores
        boolean c = false;
        //convertimos nuestro String a arreglo de caracteres 
        char y[] = x.toCharArray();
        /*recorremos el arreglo para verificar que no haya ningun simbolo ajeno 
        al numero, de ser asi encendemos la bandera de error*/
        for (int i = 0; i < y.length; i++) {
            switch (y[i]) {
                case '0':
                    break;
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                default:
                    c = true;
            }
        }
        return c;
    }

}
