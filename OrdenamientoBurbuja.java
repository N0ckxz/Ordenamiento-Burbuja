import java.util.Arrays;

public class OrdenamientoBurbuja {

    private OrdenamientoBurbuja() {
       
    }

    public static void sort(int[] arr) {

        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - 1 - i; j++) { // Compara elementos
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
        }
    }
}
