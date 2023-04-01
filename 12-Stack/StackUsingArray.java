public class StackUsingArray {
    private int data[];
    private int topIdx;

    StackUsingArray() {
        data = new int[10];
        topIdx = -1;
    }

    // Size
    public int getSize() {
        return topIdx + 1;
    }

    // isempty
    public boolean isEmpty() {
        if (topIdx >= 0) {
            return false;
        } else {
            return true;
        }

    }

    // push
    public void push(int val) {
        topIdx++;
        data[topIdx] = val;
    }

    // top
    public int top() {
        return data[topIdx];
    }

    // pop
    public int pop() {
        int val = data[topIdx];
        topIdx--;
        return val;

    }
}
