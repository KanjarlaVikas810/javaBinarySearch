public class ON3Example {
    public static void main(String[] args) {
        int n = 5;

        int count = 0;

        for (int i = 0; i < n; i++) {           // O(n)
            for (int j = 0; j < n; j++) {       // O(n)
                for (int k = 0; k < n; k++) {   // O(n)
                    count++;
                }
            }
        }

        System.out.println("Total operations: " + count);
    }
}
