import java.util.Collections;

public class HeapSort {
    /**
     * HeapSort = Using a max heap
     */
    private static MinHeap heap = new MinHeap();

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void buildMinHeap(int[] array) {
        for(int i = 0; i < array.length; i++) {
            heap.push(array[i]);
        }
    }

    public static void heapSort(int[] array) {
        buildMinHeap(array);
        for(int i = array.length - 1; i >= 0; i--) {
            heap.pop();
        }
    }
}
