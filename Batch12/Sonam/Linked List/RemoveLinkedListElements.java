package linkedlist;

public class RemoveLinkedListElements {
	
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
	public static  ListNode removeElement(ListNode head , int data){    //[1,2,6,3,4,5,6]
		ListNode current = head;
		ListNode prev = head;

		while(current!=null) {
			if(head.data==data) {
				head = head.next;
			}
			else {
				if(current.data == data ) {
				    if(current.next!=null)
				    	prev.next = current.next;
				    else
				    	prev.next = null;
				}else {
					prev = current ;
				}
			}
			current =  current.next;
		}	
		return head ;
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(7); 
		head.next =  new ListNode(7);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(7);
		head.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next = null;
		
		System.out.println("*****Before****");
		RemoveLinkedListElements.printList(head);
		
		ListNode reverselist = RemoveLinkedListElements.removeElement(head , 7);
		System.out.println("*****After*****");
		RemoveLinkedListElements.printList(reverselist);

	}
}
