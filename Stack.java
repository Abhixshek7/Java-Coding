//implementation of stack using array of fixed size.

public class Stack{
   
    int[] stack = new int[10];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top ++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek(){
        if(top==0){
            System.out.println("Stack is empty");
        }

        return stack[top-1];
    }

    public void show(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty(){
        if(top==0){
            System.out.println("Stack is empty");
            return true;
        }
       
            System.out.println("Stack is not empty");
        
        return false;
    }

    public int size(){
        return top;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    
        stack.show();
        System.out.println(stack.size());
        stack.pop();

        System.out.println();
        stack.show();
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.isEmpty();
    }
}