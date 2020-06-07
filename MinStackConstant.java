import java.util.Stack;

public class MinStackConstant {
    public static void main(String[] args) {

    }
}

class MinStack {
    private Stack<Integer> s = new Stack<>();
    private Integer minEle = 0;

    public int getMin() {
        if (s.size() == 0)
            return -1;
        return minEle;
    }

    public void push(int a) {
        if (s.size() == 0) {
            s.push(a);
            minEle = a;
        } else if (a < minEle) {
            s.push(2 * s.peek() - minEle);
            minEle = a;
        } else {
            s.push(a);
        }
    }

}