import java.util.*;
class Solution
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
        Node temp;
        void insert()
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            for(int i=0;i<n;i++)
            {
                int da = s.nextInt();
                Node New = new Node(da);
                if(head==null)
                {
                    head = New;
                    temp = head;
                }
                
                else
                {
                    temp.next = New;
                    temp = temp.next;
                }
                
            }
        }
        
        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.println("Number is " + temp.data);
                temp = temp.next;
            }
        }
        
        void deleteduplicate()
        {
            Node temp=head;
            Node ptr,dtr;
            while(temp!=null)
            {
                ptr = temp;
                dtr = temp.next;
                
                while(dtr!=null)
                {
                    if(temp.data==dtr.data)
                    {
                        ptr.next = dtr.next;
                        dtr = dtr.next;
                    }
                    
                    else
                    {
                        ptr = dtr;
                        dtr = dtr.next;
                    }
                }
                temp = temp.next;
            }
        }
        
    }
    
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.insert();
        
        l.deleteduplicate();
        l.display();
    }
}
