import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaRectangleBinaryMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0, } };
        int max = MARBM(matrix, 4, 4);
        System.out.println("Maximum area in binary matrix is : " + max);
    }

    public static int MARBM(int matrix[][], int n, int m) {
        int max = 0;
        int arr[] = new int[m];
        for (int j = 0; j < m; j++) {
            arr[j] = matrix[0][j];
        }
        max = MAH(arr, m);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    arr[j] = 0;
                }
                arr[j] += matrix[i][j];

            }
            int ans = MAH(arr, m);
            if (ans > max) {
                max = ans;
            }
        }
        return max;
    }

    public static int MAH(int arr[], int size) {
        int max = 0;
        int left[] = nslIndex(arr, size);
        int right[] = nsrIndex(arr, size);
        int width[] = new int[size];
        Integer area[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            width[i] = right[i] - left[i] - 1;
            area[i] = arr[i] * width[i];
        }
        max = Collections.max(Arrays.asList(area));
        return max;
    }

    public static int[] nslIndex(int arr[], int size) {
        int result[] = new int[size];
        Stack<Pair> s = new Stack<>();
        int psuedoIndex = -1;

        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                result[i] = psuedoIndex;
            } else if (s.size() > 0 && s.peek().first < arr[i]) {
                result[i] = s.peek().second;
            } else if (s.size() > 0 && s.peek().first >= arr[i]) {
                while (s.size() > 0 && s.peek().first >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    result[i] = psuedoIndex;
                } else {
                    result[i] = s.peek().second;
                }
            }
            s.push(new Pair(arr[i], i));
        }
        return result;
    }

    public static int[] nsrIndex(int arr[], int size) {
        int result[] = new int[size];
        Stack<Pair> s = new Stack<>();
        int psuedoIndex = size;
        for (int i = size - 1; i >= 0; i--) {
            if (s.size() == 0) {
                result[i] = psuedoIndex;
            } else if (s.size() > 0 && s.peek().first < arr[i]) {
                result[i] = s.peek().second;
            } else if (s.size() > 0 && s.peek().first >= arr[i]) {
                while (s.size() > 0 && s.peek().first >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    result[i] = psuedoIndex;
                } else {
                    result[i] = s.peek().second;
                }
            }
            s.push(new Pair(arr[i], i));
        }
        return result;
    }

}

class Pair {
    Integer first;
    Integer second;

    Pair(int element, int index) {
        first = element;
        second = index;
    }
}