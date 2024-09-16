package Stack;

public class MyStack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int length;

    public MyStack() {
        top = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    // pop(): remove top element and return data of removed element
    public int pop() {
        if (isEmpty()) {
            return -1; // or throw an exception
        }
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

}
