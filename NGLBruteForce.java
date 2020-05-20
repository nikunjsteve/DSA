public class NGLBruteForce {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 1, 2, 4 };
        int[] result = NGL(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NGL(int arr[], int size) {
        int result[] = new int[size];
        result[0] = -1;
        for (int i = 1; i < size; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
                if (j == 0 && arr[j] < arr[i]) {
                    result[i] = -1;
                }
            }
        }
        return result;
    }
}