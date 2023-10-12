import static java.util.Collections.swap;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        if(end <= start) {
            return;
        }

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;

        for(int j = start; j < end; j++) {
            if(array[j] < pivot) {
                i++;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        i++;
        int tmp = array[i];
        array[i] = array[end];
        array[end] = tmp;

        return i;
    }
}
