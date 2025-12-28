// import java.util.Scanner;
public class List {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class LinkedList{
    //    private static final Scanner scan = new Scanner(System.in);
       
        Node head;
        
        public void add(int data){
            Node node = new Node(data);
            if(head==null){
                head = node; 
            }
            else{
                Node current = head;
                while(current.next!=null){
                    current = current.next;
                }
                current.next = node;
            }
        }

        public boolean addAfterValue(int target, int data){
            // System.out.print("Enter the target value : ");
            // int target = scan.nextInt();
            // System.out.print("Enter the value : ");
            // int data = scan.nextInt();
            Node current = head;
            while(current!= null && current.data!=target){
                current = current.next;
                
            }
            if(current==null){
                System.out.println("Target Value not found");
                return false;
            }

            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            return true;
            
        }   

        public void printList(){
            Node current = head;
            while(current!=null){
                System.out.print(current.data +"->");
                current = current.next;
            }
            System.out.print("\"Null\"");
            System.out.println();
        }    
        
        public boolean addAfterIndex(int index,int data){
            if(index ==0){
                Node node = new Node(data);
                node.next = head;
                head = node;
            }

            Node current = head;
            for(int i=0;i<index-1 && current!=null;i++){
                current = current.next;
            }

            if(current ==null){
                System.out.println("Index, out of bounds");
                return false;
            }
            Node node = new Node(data);
            node.next = current.next;
            current.next = node;
            return true;
        }
    
        public boolean addAfterNode(Node prev, int data){
            if(prev==null){
                return false;
            }
            Node node = new Node(data);
            node.next = prev.next;
            prev.next = node;
            return true;
        }
        
        public void reverseList(){
            Node prev = null;
            Node current = head;

            while(current!=null){
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        
           
            
        }
        
        public boolean deleteHead(){
            if(head ==null){
                return false;
            }
            head = head.next;
            return true;
        }
        
        public boolean deleteTail(){
            Node current = head;
            if(head == null){
                return false;
            }
            if(head.next ==null){
                head = null;
                return true;
            }

            while(current.next.next!=null){
                current = current.next; 
            }
            current.next = null;
            return true;
        }
    
        public boolean deleteByValue(int value){
            if(head == null){
                return false;
            }
            if(head.data == value){
                head = head.next;
                return true;
            }
            Node current = head;
            while(current.next!=null && current.next.data!=value){
                current = current.next;
            }
            if(current.next ==null){
                return false;
            }
            current.next = current.next.next;
            return true;
        }
        
        public boolean deleteByIndex(int index){
            if(head==null){
                return false;
            }
             
            Node current = head;
            for(int i=0;i<index-1 && current.next!=null;i++){
                current = current.next;
            }
            current.next = current.next.next;
            return true;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        
        for(int i=0;i<10;i+=2){
            list.add(i);
        }
        list.printList();
        // list.reverseList();
        // list.printList();
        // list.deleteHead();
        // list.printList();
        // list.deleteTail();
        // list.printList();
        // list.deleteByValue(2);
        list.deleteByIndex(2);
        list.printList();


        // if(list.addAfterValue(8,4)){
        //     list.printList();
        // };


        // if(list.addAfterIndex(2, 0)){
        //     list.printList();
        // }

        // if(list.addAfterNode(6, 7)){
        //     list.printList();
        // }
        
    }
}