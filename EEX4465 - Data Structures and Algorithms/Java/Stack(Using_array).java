class Stack {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    void peek() {
        if (top >= 0)
            System.out.println("Top Element: " + stack[top]);
        else
            System.out.println("Stack Empty");
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.peek();
        s.pop();
        s.display();
    }
}
