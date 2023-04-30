import java.util.Arrays;

public class Stack<T> {
    private T[] stack;
    private int top;

    public Stack(int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }
        stack[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
