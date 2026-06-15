package LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;
    
    public DLL(){
        this.size=0;
    }

    public Node insertFirst(int value){
        Node node=new Node(value); 
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
       
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
        return head;
    }
    

    public Node insertLast(int value){
        Node node=new Node(value);
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
            last.next=node;
            node.prev=last;
            last=node;
        return head;
    }
     public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
        }

    public void insert(int value,int index){
        Node p=find(index);
        if(p==null){
            System.out.println("Doesnt exist in LL");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(p.next!=null){
            node.next.prev=node;
        }
        
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayRev(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.prev;
        }
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.displayRev();
        list.insertLast(9);
        list.display();
        list.insert(99, 2);
        list.display();
    }
}
