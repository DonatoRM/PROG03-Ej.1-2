import java.util.Scanner;
/**
 * Ejercicio N.º 2 de la Unidad 3 de Programación
 * @author Donato Ramos Martínez
 */
public class ProgramaPrincipal {

    /**
     * Método principal de ejecución
     * @param args No tiene argumentos necesarios para la ejecución del programa
     */
    public static void main(String[] args) {
        
        // Declaración de variables e instanciación de objetos
        String entrada;
        boolean correcto;
        Scanner leer=new Scanner(System.in);
        
        // Programa
        
        /* Declaramos, instanciamos e inicilizamos el objeto ordenador mediante 
        uno de sus constructores */
        Portatil ordenador=new Portatil("ASUS","Intel I7",16,1024,true);
        /* Visualizamos todos los atributos del objeto ordenador mediante el 
        método visualiza() */
        ordenador.visualiza();
        // Mediante el Setter modificamos el valor del atributo usbC
        ordenador.setUsbC(false);
        // Observamos que el atributo ha cambiado
        ordenador.visualiza();
        /* Declaramos, instanciamos e inicilializamos el nuevo objeto ordenador2
        con los valores por defecto: Los valores por referencia a null, los
        valores numéricos a cero y los booleanos a false
        */
        Portatil ordenador2=new Portatil();
        //Pedimos por pantalla un nuevo String para el atributo marca
        System.out.print("Introduzca la Marca del portatil: ");
        // Lo cambiamos dentro del objeto ordenador2 mediante el Setter
        ordenador2.setMarca(leer.nextLine());
        // Pedimos por pantalla un nuevo String para el atributo cpu
        System.out.print("Introduzca la CPU del portatil: ");
        // Lo cambiamos dentro del objeto ordenador2 mediante el Setter
        ordenador2.setCpu(leer.nextLine());
        /* Ahora vamos a pedir dos valores numéricos. Como por teclado podemos 
        introducir cualquier cosa, utilizaremos dos bucles en cuyo interior 
        controlaremos dicho valor mediante un try catch
        */
        do {            
            try {
                System.out.print("Introduzca la cantidad de Memoria RAM del "
                        + "portatil: ");
                ordenador2.setRam(leer.nextInt());
                correcto=true;
            } catch (Exception e) {
                System.out.println("El valor introducido no es correcto");
                leer.nextLine();
                correcto=false;
            }
        } while (correcto==false);
        do {            
            try {
                System.out.print("Introduzca la cantidad de Disco HDD del "
                        + "portatil: ");
                ordenador2.setHdd(leer.nextInt());
                correcto=true;
            } catch (Exception e) {
                System.out.println("El valor introducido no es correcto");
                leer.nextLine();
                correcto=false;
            }
        } while (correcto==false);
        leer.nextLine(); // Ojo
        /* Por último vamos a controlar la entrada por teclado de un caracter
        's' o 'n'. Lo introducido por teclado lo paso primero a minúsculas y
        luego compruebo el valor. Según sea éste, aplico al Setter un valor 
        verdadero o falso.
        */
        do {            
            System.out.print("¿Tiene el portail USB? (S/N): ");
            entrada=leer.nextLine().toLowerCase();
            if(entrada.equals("s")) ordenador2.setUsbC(true);
            if(entrada.equals("n")) ordenador2.setUsbC(false);
        } while (!(entrada.equals("s") || entrada.equals("n")));
        // Visualizamos el resultado por pantalla.
        ordenador2.visualiza();
    }
}
