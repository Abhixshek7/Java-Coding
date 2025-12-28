

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class ListNode{
    Node head;

    public void add(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
    }
    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("\"null\"");
    }

    public void copyNode(){
        Node current = head;
        while(current!=null){
            Node newNode = new Node(current.data);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next; 
        }
    }
}

public class copyList {

    public static void main(String[] args) {
        ListNode LL = new ListNode();
        for(int i=1;i<=5;i++){
            LL.add(i);
        }
        LL.print();

        LL.copyNode();
        System.out.println();
        LL.print();

    }
}