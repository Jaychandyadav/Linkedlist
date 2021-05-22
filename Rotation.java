// ROTATION OF ELEMENT FROM ENDING

import java.util.*;
class Rotation
{
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	static class LinkedList
	{
		Node head; 
		public void insert(int d)        // inserting element
		{
			Node temp = new Node(d);
			if(head==null)
			{
				head = temp;
			}
			
			else
			{
				Node tmp = head;
				while(tmp.next!=null)
				{
					tmp = tmp.next;
				}
				tmp.next = temp;
			}
		}
		
		public void rotation()                 // for Rotatioin of elelment from end
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Rotation number: ");
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				Node temp=head;
				Node prev=head;
				while(temp.next!=null)
				{
					prev=temp;
					temp=temp.next;
				}
				temp.next = head;
				prev.next = null;
				head = temp;
			}
		}
		
		public void show()                   // for printing elelment
		{
			Node t = head;
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
	    ll.insert(1);
	    ll.insert(2);
	    ll.insert(3);
		ll.insert(4);
	    ll.insert(5);
	   
	    ll.show();
	    ll.rotation();
	    System.out.println("Rotaion");
	    ll.show();
	}
}