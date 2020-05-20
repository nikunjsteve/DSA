import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int result[] = SP(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] SP(int arr[], int size) {
        int result[] = new int[size];
        int nglIndex[] = NGLIndex(arr, size);
        for (int i = 0; i < size; i++) {
            result[i] = i - nglIndex[i];
        }
        return result;
    }

    public static int[] NGLIndex(int arr[], int size) {
        int result[] = new int[size];
        Stack<Pair> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                result[i] = -1;
            } else if (s.size() > 0 && s.peek().first > arr[i]) {
                result[i] = s.peek().second;
            } else if (s.size() > 0 && s.peek().first <= arr[i]) {
                while (s.size() > 0 && s.peek().first <= arr[i]) {
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
        System.out.println("Ngl Index");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");
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