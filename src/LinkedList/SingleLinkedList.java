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
		
	}
}
