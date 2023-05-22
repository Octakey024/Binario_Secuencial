package Ordenamiento;

public class QuickSort {

    public static void sort(int B[]) {
        quicksort(B, 0, B.length - 1);
        System.out.println("El arreglo ordenado por quick sort es:");
        for (int orden : B) {
            System.out.print("[" + orden + "], ");
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }
        }
        System.out.println("");
    }

    public static void quicksort(int B[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = part(B, izquierda, derecha);
            quicksort(B, izquierda, pivote - 1);
            quicksort(B, pivote + 1, derecha);

        }
    }

    public static int part(int B[], int izquierda, int derecha) {
        int pivote = B[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (B[j] < pivote) {
                i++;
                int t = B[i];
                B[i] = B[j];
                B[j] = t;
            }
        }
        int t = B[i + 1];
        B[i + 1] = B[derecha];
        B[derecha] = t;
        return i + 1;

    }
}
