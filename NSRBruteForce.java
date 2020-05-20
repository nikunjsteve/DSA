public class NSRBruteForce {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] result = NSR(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NSR(int arr[], int size) {
        int result[] = new int[size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    result[i] = arr[j];
                    break;
                }
                if (j == size - 1 && arr[j] > arr[i]) {
                    result[i] = -1;
                }
            }
        }
        result[size - 1] = -1;
        return result;
    }
}