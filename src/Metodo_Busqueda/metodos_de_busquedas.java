package Metodo_Busqueda;

import Busquedas.Binaria;
import Busquedas.busqueda;
import java.util.Scanner;

public class metodos_de_busquedas {

    public static void metodos2(int B[]) {

        Scanner leer = new Scanner(System.in);
        int op;

        do {
            System.out.println("\t¿Cuál es su método de busqueda?");
            System.out.println("1.-  \t Busqueda secuencial:");
            System.out.println("2.- \t Busqueda binaria:");
            System.out.println("3.-\t Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    busqueda.secuencial(B);
                    break;
                case 2:
                    Binaria.binaria(B);
                    break;
                default:
                    System.out.println("Adios Cuchurrumin");
                    break;
            }
        } while (op <= 2);

    }
}
