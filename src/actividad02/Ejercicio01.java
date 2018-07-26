package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author franh
 */
public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        int opcion;

        do {
            System.out.println("     MENU   ");
            System.out.println("============");
            System.out.println("1- Calcula el mayor de 3 números");
            System.out.println("2- Calcula el día de la semana");
            System.out.println("3- Supera el 50");
            System.out.println("4- Salir \n");
            opcion = pideEntero("Elige una opción", 0);
            
            switch (opcion) {
                case 1: {
                    mayorQue(pideDouble("Introduce tres números: ", 0), pideDouble("", 0), pideDouble("", 0));
                    break;
                }
                case 2: {
                    diaSemana(0);
                    break;
                }
                case 3: {
                    supera50(0);
                    break;
                }
                case 4: {
                    System.out.println("FIN DE PROGRAMA.");
                    break;
                }
                default: {
                    System.out.println("¡Opcion incorrecta!");
                }
            }
        } while (opcion != 4);

    }

    // Función pideEntero
    public static int pideEntero(String question, int numero) throws IOException {
        int entero = 0;
        String lectura;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(question);
            try {
                lectura = br.readLine();
                entero = Integer.parseInt(lectura);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. No es un número entero");
            }
        }

        return entero;
    }

    // Función pideDouble
    public static double pideDouble(String question, double numero) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double valor = null;
        String texto;
        while (true) {
            System.out.println(question);
            try {
                texto = br.readLine();
                valor = Double.parseDouble(texto);
                break;
            } catch (java.lang.NumberFormatException ex) {
                System.out.println("Valor introducido incorrecto. Vuelve a intentarlo:");
            }
        }
        return valor;
    }

    public static void mayorQue(double x, double y, double z) throws IOException {

        if (x > y && x > z) {
            System.out.println(x + " es el mayor ");
        } else if (y > x && y > z) {
            System.out.println(y + " es el mayor ");
        } else if (x == y && x == z) {
            System.out.println("Los tres son iguales");
        } else {
            System.out.println(z + " es el mayor ");
        }
    }

    public static void diaSemana(int x) throws IOException {

        int opcion;
        System.out.println("Elige undía de la semana por nº del 1 al 7 ");

        do {
            opcion = pideEntero("", 0);

            switch (opcion) {
                case 1: {
                    System.out.println("El día es: Lunes");
                    break;
                }
                case 2: {
                    System.out.println("El día es: Martes");
                    break;
                }
                case 3: {
                    System.out.println("El día es: Miércoles");
                    break;
                }
                case 4: {
                    System.out.println("El día es: Jueves");
                    break;
                }
                case 5: {
                    System.out.println("El día es: Viernes");
                    break;
                }
                case 6: {
                    System.out.println("El día es: Sábado");
                    break;
                }
                case 7: {
                    System.out.println("El día es: Domingo");
                    break;
                }
                default: {
                    System.out.println("¡Opcion incorrecta!");
                    System.out.println("Escribe un número entre 1 y 7");
                }
            }
        } while (opcion <= 0 || opcion > 7);
    }

    public static void supera50(double x) throws IOException {

        int intentos = 0;
        for (x = 0; x <= 50; intentos++) {
            x = pideDouble("Numero mayor que 50:", 0);
        }
        
        if (x > 50) {
            System.out.println("Lo has conseguido en: " + intentos + " intentos.");
        }
    }    
}
