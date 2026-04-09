import java.util.Arrays; //Comentario para el commit

public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 22, 11, -4, 7, 3};

        System.out.println(Arrays.toString(arr));

        OrdenamientoBurbuja.sort(arr); 
        // Mostrar nuevamente el arreglo ordenado
        System.out.println(Arrays.toString(arr));
    }
}
