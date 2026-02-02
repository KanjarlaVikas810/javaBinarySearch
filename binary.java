public class BinarySearchExample {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target);
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target);
        }
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int iterativeResult = binarySearchIterative(arr, target);
        int recursiveResult = binarySearchRecursive(arr, 0, arr.length - 1, target);

        System.out.println("Iterative Search Result: " + iterativeResult);
        System.out.println("Recursive Search Result: " + recursiveResult);
    }
}
