
/* Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
 * que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
 * y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
 *      o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de
 *      agua”.
 *      o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
 *      gasolina”.
 *      o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
 *      hormigón”.
 *      o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de
 *      pasta alimenticia”.
 *      o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
 *      válido para tipo de bomba” 
 */

 import java.util.Scanner;

public class ejercicio7Teorico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int tipoMotor;

        System.out.println("Ingrese el tipo de motor que quiere (1/2/3/4)");

        tipoMotor = entrada.nextInt();

        switch (tipoMotor) {

            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bombas");
                break;

        }

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }
    
}
