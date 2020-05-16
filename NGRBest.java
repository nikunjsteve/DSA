import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NGRBest {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 1, 2, 4 };
        Vector<Integer> result = NGR(arr, arr.length);
        System.out.println("result  :- " + result);
    }

    public static Vector<Integer> NGR(int arr[], int size) {
        Vector<Integer> v = new Vector<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for (int i = size - 1; i >= 0; i--) {
            if (s.size() == 0) {
                v.add(-1);
            } else if (s.size() > 0 && s.peek() > arr[i]) {
                v.add(s.peek());
            } else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    v.add(-1);
                } else {
                    v.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
}