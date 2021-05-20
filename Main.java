 class Main
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
		Node tmp, Pos;
		int length = 0;
		public void insert(int data)
		{
			length++;
			Node temp = new Node(data);
			if(head==null)head=temp;
			
			else
			{
				Node n = head;
				while(n.next!=null)
				{
					n = n.next;
				}
				n.next = temp;
			}
		}	
		
		public void insertbegin(int b)
		{
			length++;
			Node first = new Node(b);
			first.next = head;
			head = first;
		}
		
		public void insertmid(int m, int p)
		{
			length++;
			Node n = new Node(m);
			Pos = head;
			for(int i=1;i<p;i++)
			{
				Pos=Pos.next;
			}
			n.next=Pos.next;
			Pos.next=n;
			
		}
	
		public void show()
		{
			tmp = head;
			while(tmp!=null)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
		}
		
		public void length()
		{
			System.out.println("Length is: " + length);
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
		ll.insertbegin(0);
		ll.insertmid(1,2);
		ll.show();
		ll.length();
		
	}
 }