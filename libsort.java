import java.util.Arrays;

public class LibrarySort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};

        Arrays.sort(arr);   // Java built‑in sort (Dual-Pivot QuickSort / TimSort)

        System.out.println(Arrays.toString(arr));
    }
}

