// Implementation of stack using linked list    

public class StackLL {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    private Node top;
    private int size;

    public StackLL(){
        top = null;
        size = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size ++;
    }

    public int pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        return data;
    }
    public void show(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        Node current = top;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0){
            System.out.println("Stack is empty");
            return true;
        }
        System.out.println("Stack is not empty");
        return false;
    }


    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.show();
        stack.pop();
        stack.show();
       System.out.println(stack.peek()); 
       stack.isEmpty();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.show();       
    }
}