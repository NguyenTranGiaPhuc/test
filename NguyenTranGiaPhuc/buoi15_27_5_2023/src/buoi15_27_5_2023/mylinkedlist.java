package buoi15_27_5_2023;

//Nhap, in, sap xep, dao, xoa k, chen k
// xoa vi tri thu 5, cheo gia tri 99 vao vi tri thu 5
// Nguyen Tran Gia Phuc

import java.util.Scanner;


public class mylinkedlist {
	
	Scanner sc = new Scanner(System.in);
	Node head;
	
	void nhap_dslk() {
		int x;
		Node cuoi = null;
		while(true) {
			System.out.println("Nhap x=");
			x= sc.nextInt();
			if(x==0)
				break;
			Node t= new Node(x);
			if(head == null)
				head = cuoi = t;
			else {
				cuoi.next = t;
				cuoi = t;
			}
		}
	}
	
	void in_dslk() {
		System.out.println("Noi dung danh sach la: ");
		Node p = head;
		while(p != null) {
			System.out.println(p);
			p = p.next;
		}
		System.out.println("null");
	}
	
	void remove(int k) {
		if(head == null) System.out.println("Danh sach rong");
		else if(k==1) head = head.next;
		else {
			int vt=1; Node p=head;
			while(p!=null && vt<k-1) {vt++; p=p.next;}
			if(p==null || p.next==null)
				System.out.println("vi tri xoa khong hop le!");
			else p.next = p.next.next;
		}
	}
	
	void insert(int x, int k) {
		if(k<1) System.out.println("Error!");
		else {
			if(k==1) head = new Node(x,head);
			else {
				int vt=1;
				Node p = head;
				while(p!=null && vt<k-1) {vt++; p=p.next;}
				if(p.next == null) System.out.println("Error!");
				else {
					Node t = new Node(x,p.next); p.next=t; 
				}
				
			}
		}
	}
	
	void sort_dslk() {
		for(Node i = head; i.next != null; i = i.next) {
			for(Node j = i.next; j.next !=null; j= j.next) {
				if(i.data > j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
		
	}
	
	void dao_dslk() {
		Node t = null;
		Node p = head;
		while(p!= null) {
			Node q = p.next;
			p.next = t;
			t =p;
			p=q;
		}
		head = t;
	}
	
	public static void main(String[] args) {
		mylinkedlist p = new mylinkedlist();
		p.nhap_dslk();
		p.in_dslk();
//		p.sort_dslk();
//		p.in_dslk();
//		p.dao_dslk();
//		p.in_dslk();
		System.out.println("Chen: ");
		p.insert(99,5);
		p.in_dslk();
	}
}
