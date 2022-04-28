package linkedlist;

public class FindMiddleNodeOfLinkedList {
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
	public static ListNode findMiddle(ListNode head) {
		ListNode slow = head ;
		ListNode fast = head ;
		
		while(fast!=null && fast.next!=null) {
			slow =  slow.next;
			fast = fast.next.next;
		}
		return slow;   
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = null;
		
		System.out.println(FindMiddleNodeOfLinkedList.findMiddle(head).data);
	}
}
