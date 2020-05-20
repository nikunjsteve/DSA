import java.util.Stack;

public class NSLBest {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] result = NSL(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NSL(int arr[], int size) {
        int result[] = new int[size];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                result[i] = -1;
            } else if (s.size() > 0 && s.peek() < arr[i]) {
                result[i] = s.peek();
            } else if (s.size() > 0 && s.peek() >= arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
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