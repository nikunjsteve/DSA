import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        int max = MAH(arr, arr.length);
        System.out.println("Maximum area is : " + max);
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
        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                result[i] = -1;
            } else if (s.size() > 0 && s.peek().first < arr[i]) {
                result[i] = s.peek().second;
            } else if (s.size() > 0 && s.peek().first >= arr[i]) {
                while (s.size() > 0 && s.peek().first >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    result[i] = -1;
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
        for (int i = size - 1; i >= 0; i--) {
            if (s.size() == 0) {
                result[i] = -1;
            } else if (s.size() > 0 && s.peek().first < arr[i]) {
                result[i] = s.peek().second;
            } else if (s.size() > 0 && s.peek().first >= arr[i]) {
                while (s.size() > 0 && s.peek().first >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    result[i] = -1;
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