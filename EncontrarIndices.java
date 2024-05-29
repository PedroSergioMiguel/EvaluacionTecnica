import java.util.Arrays;

public class EncontrarIndices {

    public static int[] encontrarIndices(int[] array, int objetivo) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == objetivo) {
                    result = new int[]{i, j};
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int objetivo = 6;
        int[] indices = encontrarIndices(array, objetivo);
        if (indices.length == 0) {
            System.out.println("No se encontraron pares que sumen el valor objetivo.");
        } else {
            System.out.println(Arrays.toString(indices));
        }
    }
}