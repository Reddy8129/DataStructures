package LinkedList;

public class SingleLinkedList {

	public ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	void display()
	{
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data + "-->");
			current= current.next;
		}
		System.out.println("null");
		
	}
	int len(){
		int count = 0;
		ListNode current = head;
		while(current!=null){
			count++;
			current= current.next;
		}
		return count;
	}
	
	void insertNodeAtBeginning(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	void insertNodeAtEnd(int value)
	{
		ListNode newNode = new ListNode(value);
		if(head==null)
		{
			head=newNode;
			return;
		}
		ListNode current = head;
		while(null!=current.next)
		{
			current= current.next;
		}
		current.next= newNode;		
	}
	
	void insertAt(int pos, int value)
	{
		ListNode newNode = new ListNode(value);

		if(pos==1){
			newNode.next=head;
			head=newNode;
		}
		else
		{
			ListNode previous = head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			newNode.next=previous.next;
			previous.next=newNode;

		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList ssl = new SingleLinkedList();
		ssl.head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		//Now we will connect them together to form a chain
		ssl.head.next=second;//10-->20
		second.next=third;//10-->20-->30
		third.next=fourth;//10-->20-->30-->40-->null	
		
		ssl.display();
		
		System.out.println(ssl.len());
		
		//add new node at beginning
		ssl.insertNodeAtBeginning(0);
		ssl.display();
		
		//add new node at end
		ssl.insertNodeAtEnd(50);
		ssl.display();
		
		//add at position
		ssl.insertAt(3, 15);
		ssl.display();
	}
}
