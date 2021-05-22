class Del_
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
		int length = 0;
		public void insert(int d)
		{
			length++;
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
		
		public void del_to_back(int p)
		{
			Node t = head;
			int n = length - p;
			if(head==null)
			{
				System.out.println("Underflow");
			}
			
			else if(head.next==null)
			{
				head = null;
			}
			
			else
			{
				for(int i=1;i<n;i++)
				{
					t = t.next;
				}
				t.next = t.next.next;
			}
			
		}
		
		public void show()
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
		ll.insert(6);
		ll.insert(7);
		ll.insert(8);
		ll.insert(9);
		ll.insert(10);
		ll.show();
		ll.del_to_back(4);
		ll.show();
	}
	
	
	
}