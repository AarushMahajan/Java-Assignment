package javaAssignment;

public class RevLLinGroup {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static void insert(Node li,int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	
	public static void rev(Node x,Node y) {
	
		Node N=y;
		while(true) {
			Node current = x;
			while(current.next!=N) {
				int temp=current.data;
				current.data=current.next.data;
				current.next.data=temp;
				
				current=current.next;
			}
			N=current;
			if(N==x) {
				break;
			}
		}
		while(x!=y) {
			System.out.print(x.data+" ");
			x=x.next;
		}
		
	}
	
	public static void reverse(Node head,int n) {
		if(head==null) {
//			return;
		}
		else {
			Node a=head;
			int q=0;
			while(q!=n) {
				a=a.next;
				q++;
			}
			int count=0;
			Node c = head;
			while(c!=null) {
				
				if(count%n==0 || count==0) {
					rev(c, a);
				}
				a=a.next;
				c=c.next;
				count++;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert(head,10);
		insert(head,20);
		insert(head,30);
		insert(head,40);
		insert(head,50);
		insert(head,60);
		insert(head,70);
		insert(head,80);
		
		reverse(head, 4);
	}

}
