// Sortable.java
public abstract class Sortable {
    public abstract int compare(Sortable other);

    public static void shell_sort(Sortable[] array) {
        int n = array.length;
        // Implementasi Shell Sort
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = array[i];
                int j;
                for (j = i; j >= gap && temp.compare(array[j - gap]) < 0; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
