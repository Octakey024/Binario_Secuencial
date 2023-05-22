package Main_Busquedas;

import Ordenamiento.QuickSort;
import Metodo_Busqueda.metodos_de_busquedas;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busquedas {

    public static void main(String[] args) {
        int op = 1;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su longitud de su arreglo");
        int elemento = leer.nextInt();

        int B[] = new int[elemento];

        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100); // genera numeros de 0 a 1 se pasa a int
        }
        System.out.println("");
        System.out.println("El arreglo desordenado es:");
        System.out.println(Arrays.toString(B));
        
        switch (op) {
            case 1:
                QuickSort.sort(B);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                metodos_de_busquedas.metodos2(B);
                break;

        }
    }
}
