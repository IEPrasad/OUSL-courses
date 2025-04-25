class MyStack {
  int top = -1;
  int[] arr = new int[5];

  void push(int val) {
    if (top < arr.length - 1)
      arr[++top] = val;
  }

  int pop() {
    if (top >= 0)
      return arr[top--];
    return -1;
  }
}
