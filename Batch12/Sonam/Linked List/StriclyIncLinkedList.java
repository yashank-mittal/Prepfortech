package linkedlist;

/* A Strictly Increasing Linked List */
public class StriclyIncLinkedList {
	
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
	
	public static boolean checkList(ListNode head){
		boolean ans = true;
		while(head!=null && head.next!=null) {
			if(head.data > head.next.data) {
					ans = false ;
			}
			head=head.next;
		}
		return ans;   
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = null;
		
		System.out.println(StriclyIncLinkedList.checkList(head));
	}
}
