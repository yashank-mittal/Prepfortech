package linkedlist;

public class LinkedListtoInteger {
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
	public static int getDecimalValue(ListNode head) {
		int ans = 0;
		while(head!=null) {
			ans = ans*2 + head.data;
			head=head.next;
		}
		return ans;   
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(0);
		head.next.next = new ListNode(1);
		head.next.next.next = null;
		
		System.out.println(LinkedListtoInteger.getDecimalValue(head));
	}
}
