/*
 * 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 输入：{1,2,3}
 * 返回：{3,2,1}
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while(input.hasNext()) {
			int num = input.nextInt();
			if (num != 0) {
				list.add(num);				
			}
			else {
				break;
			}
		}
		System.out.print(ReverseList(CreateList(list)).val);
	}

	public static ListNode CreateList(ArrayList list) {
		
		ListNode curNode = new ListNode((int)list.get(list.size() - 1));
		curNode.next = null;
		for (int i = list.size() - 1; i >= 0; i--) {
			ListNode preNode = new ListNode((int)list.get(i));
			preNode.next = curNode;
			curNode = preNode;
		}
		return curNode;
	}
	
	public static ListNode ReverseList(ListNode head) {
		ListNode cur = head;
		ListNode nex = null;
		while (cur != null) {
			nex = cur.next;
			cur.next = head;
			head = cur;
			cur = nex;
		}
		
		return head;
	}
}

class ListNode {
	int val;
	ListNode next = null;
	
	ListNode(int val) {
		this.val = val;
	}
}