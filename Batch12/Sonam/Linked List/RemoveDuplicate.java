package linkedlist;

import java.util.HashSet;

public class RemoveDuplicate {
	
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
	public static  ListNode removeDuplicate(ListNode head){
		HashSet<Integer> hs = new HashSet<>();
		
		ListNode current = head;
		ListNode prev = null;
		
		while(current != null) {
			int curval = current.data;
			if (hs.contains(curval)) {
	            prev.next = current.next;
	        }
	        else {
	            hs.add(curval);
	            prev = current;
	        }
			current = current.next;
		}
		return head ;
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = null;
		
		System.out.println("*****Before****");
		RemoveDuplicate.printList(head);
		
		ListNode reverselist = RemoveDuplicate.removeDuplicate(head);
		System.out.println("*****After*****");
		RemoveDuplicate.printList(reverselist);

	}
}
