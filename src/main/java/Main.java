public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        QuickSort.quickSort(array, 0, array.length-1);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
