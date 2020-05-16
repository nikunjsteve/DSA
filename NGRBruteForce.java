
public class NGRBruteForce {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 1, 2, 4 };
        int[] result = NGR(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NGR(int arr[], int size) {
        int result[] = new int[size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        result[size - 1] = -1;
        return result;
    }
}