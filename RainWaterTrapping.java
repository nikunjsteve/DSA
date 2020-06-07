import java.lang.Math;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = RWT(arr, arr.length);
        System.out.println("Rain water quantitiy : " + result);
    }

    public static int RWT(int arr[], int size) {
        int mxl[] = new int[size];
        int mxr[] = new int[size];

        mxl[0] = arr[0];
        for (int i = 1; i < size; i++) {
            mxl[i] = Math.max(mxl[i - 1], arr[i]);
        }

        mxr[size - 1] = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            mxr[i] = Math.max(mxr[i + 1], arr[i]);
        }

        int water[] = new int[size];
        for (int i = 0; i < size; i++) {
            water[i] = Math.min(mxl[i], mxr[i]) - arr[i];
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += water[i];
        }
        return sum;
    }
}