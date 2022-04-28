package linkedlist;

public class ReverseLinkedList {
	
	static class ListNode{
		int data ;
		ListNode next ;
		
		ListNode(){}
		
		ListNode(int data){
			this.data = data ;
		}
		
		ListNode(int data , ListNode next){
			this.data=data;
			this.next =  next ;
		}
	}
	public static void printList(ListNode head) {
		ListNode temp =head ;
		while(temp != null){
			System.out.println(temp.data);
			temp =  temp.next;
		}
	}
	public static  ListNode reverse(ListNode head){
		ListNode current  =  head ;
		ListNode prev  =  null ;
		ListNode next  =  null ;
		
		while(current != null) {
			next = current.next ;
			current.next = prev ;
			prev = current ;
			current = next ;
		}
		head = prev;
		return head;
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = null;
		
		System.out.println("*****Before****");
		ReverseLinkedList.printList(head);
		
		ListNode reverselist = ReverseLinkedList.reverse(head);
		System.out.println("*****After*****");
		ReverseLinkedList.printList(reverselist);

	}
}
