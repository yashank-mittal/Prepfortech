package linkedlist;

public class DeleteNodeFromLinkedList {
	static class ListNode{
		int data ;
		ListNode next ;
		
		ListNode(){}
		ListNode(int data){ this.data = data ;}
		ListNode(int data , ListNode next){ this.data=data; this.next =  next ;}
	}
	
	public static void printList(ListNode head) {
		while(head != null){
			System.out.println(head.data);
			head =  head.next;
		}
	}
	
	public static void deleteNode(ListNode head , int deletedata) {//1,2,3,4
		ListNode temp =  head ;
		ListNode temp2 =  head ;

		if(head==null) { // If linked list is empty
			return ;
		}
		else if(head.data == deletedata) {//if first node to be deleted
			head = head.next ;
		}
		else{
			while(temp!= null && temp.data != deletedata) {
				    temp2 = temp;//find previous node of the node to be deleted
					temp = temp.next ;
			}
			temp2.next = temp.next;
		} 
    }
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1); 
		head.next =  new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = null;
		
		System.out.println("*****Before****");
	    DeleteNodeFromLinkedList.printList(head);
		
		System.out.println("*****After*****");
		DeleteNodeFromLinkedList.deleteNode(head,4);
	    DeleteNodeFromLinkedList.printList(head);

	}
}
