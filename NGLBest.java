import java.util.*;

public class NGLBest {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 1, 2, 4 };
        int[] result = NGL(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NGL(int arr[], int size) {
        int result[] = new int[size];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                result[i] = -1;
            }
            if (s.size() > 0 && s.peek() > arr[i]) {
                result[i] = s.peek();
            }
            if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    result[i] = -1;
                } else {
                    result[i] = s.peek();
                }
            }
            s.push(arr[i]);
        }
        return result;
    }
}