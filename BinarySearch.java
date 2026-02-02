public class BinarySearchIterative {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // safe midpoint

            if (arr[mid] == target) {
                return mid;                      // found
            }
            if (arr[mid] < target) {
                left = mid + 1;                  // go right
            } else {
                right = mid - 1;                 // go left
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // sorted array
        int target = 23;

        int result = binarySearch(arr, target);
        System.out.println("Index: " + result);
    }
}
