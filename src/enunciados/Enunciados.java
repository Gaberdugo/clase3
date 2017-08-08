package enunciados;

import java.util.*;

/**
 * @author Gustavo Berdugo
 * @version 1
 * @since 08/08/17
 */
public class Enunciados {

    /**
     * @param args
     */

    public Enunciados() {

    }

    public static void main(String[] args) {
        Scanner FlujoEntrada = new Scanner(System.in);

        String nombre = null;
        int numeroHoras = 0;
        double valorHora = 0;
        double total = 0;

        System.out.println("Nombre");
        nombre = FlujoEntrada.next();

        System.out.println("Horas");
        numeroHoras = FlujoEntrada.nextInt();

        System.out.println("valor");
        valorHora = FlujoEntrada.nextDouble();
        
        total = salario(numeroHoras, valorHora);
        System.out.println("Nombre: "+ nombre + " Salario: "+ total);

    }

    public static double salario(int horas, double valor) {

        double total = 0;
        int sub = 0;

        if (horas > 40) {
            sub = horas - 40;
            if (sub <= 8) {
                total = (40 * valor) + (sub * (valor * 2));
            } else {
                total = (40 * valor) + (8 * (valor * 2)) + ((sub - 8) * (valor * 3));
            }
        } else {
            total = horas * valor;
        }
        return total;
    }

}
