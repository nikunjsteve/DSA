import java.util.Stack;

public class MinStackLinear {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(18);
        s.push(19);
        System.out.println(s.getMin());
        s.push(29);
        s.push(15);
        s.push(16);
        System.out.println(s.getMin());
    }
}

class MinStack {
    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> ss = new Stack<>();

    public void push(int a) {
        s.push(a);
        if (ss.size() == 0 || ss.peek() >= a)
            ss.push(a);
    }

    public int getMin() {
        if (ss.size() == 0)
            return -1;
        return ss.peek();
    }

    public int pop() {
        if (s.size() == 0)
            return -1;
        int ans = s.peek();
        s.pop();
        if (ss.peek() == ans)
            ss.pop();
        return ans;
    }
}