public class Linked{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    Linked(){
        head=null;
    }

    public void insertbegin(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public void insertatmiddle(int value,int pos){
        Node temp=head;
        Node prev=null;
        Node newnode=new Node(value);
        for(int i=1;i<=pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        assert prev != null;
        prev.next=newnode;
        newnode.next=temp;
    }
    void insertatend(int value){
        Node temp=head;
        Node prev = null;
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
        }
        while(temp!=null){
            prev=temp;
            temp=temp.next;

        }
        assert prev != null;
        prev.next=newnode;
    }

    void deleteatbegining(){
        Node temp=head;
        head=head.next;

    }
    void deleteatmiddle(int pos){
        Node temp=head;
        Node prev=null;
        for(int i=0;i<=pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        assert prev != null;
        prev.next=temp.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print (temp.data+" -> ");
            temp=temp.next;
        }

    }
    void search(int value){
        Node temp=head;
        Node prev=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        for(int i=1;i<=count;i++){
            prev=prev.next;
            if(value== prev.data){
                System.out.println("value found at "+i);
            }
        }
    }
}
