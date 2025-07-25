import java.util.*;

class Node{
    int val;
    Node next;
    Node(int v){
        this.val=v;
        next=null;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int count;
    Linkedlist(){
        head=tail=null;
    }
    
    void addLast(int a){
        Node n1=new Node(a);
        if(head==null){
            head=tail=n1;
        }
        else{
            tail.next=n1;
            tail=n1;
        }
    }
    
    void removeLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    
    void removeFirst(){
        if(head!=null){
        head=head.next;}
    }
    
    void rprintll(Node temp){
        if(temp==null){return;}
        rprintll(temp.next);
        if(temp!=head){
        System.out.print(temp.val+"->");}
        else{System.out.println(temp.val);}
    }
    
    void nodesize(){
        count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
    }
    
    void removek(int k){
        Node temp=head;
        nodesize();
        if(k==count){removeFirst();
        return;
        for(int i=0;i<count-k-1;i++){
            temp=temp.next;
        }
    }
        temp.next=temp.next.next;
    }
}

class Singlyll
{
	public static void main (String[] args)
	{
		Linkedlist list = new Linkedlist();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(70);
        list.rprintll(list.head);
        list.removek(4);
        list.rprintll(list.head);
        // I didn't cover all the edge cases. Please use addLast and removeFirst, removeLast for edge cases.
	}
}
