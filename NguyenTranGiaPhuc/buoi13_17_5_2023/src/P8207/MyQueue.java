package P8207;

import java.util.Scanner;

public class MyQueue {
	
	Scanner sc = new Scanner(System.in);
	Node head;
	
	public MyQueue() {
		head = null;
	}
	
//	void append(int x) {
//		Node t = new Node(x);
//		if(head == null)
//			head = t;
//		else {
//			Node p = head; while(p.next!=null) p=p.next;
//			p.next = t;
//		}
//		 
//	}
	
//	void add(int x) {
//		head = new Node(x, head);
//	}
//	
	int dem() {
		int k=0;
		Node p= head;
		while(p!=null) {
			k++;
			p=p.next;
		}
		return k;
	}
	
	int dem_1(Node L) {
		if(L==null) return 0;
		else return 1+dem_1(L.next);
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
	
	Node chenk(Node L, int x, int k) {
		if(k==1) 
			head = new Node(x, head);
		else if(L == null  && k>1)
			System.out.println("Error");
		else {
			L.next = chenk(L.next, x, k-1);
		}
		return L;
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
	
	Node xoak(Node L, int k) {
		if(L == null)
			System.out.println("Error.");
		else if(k==1)
			L.next = null;
		else 
			L.next = xoak(L.next, k-1);
		return L;
	}
	
	void nhapds() {
		int x;
		Node cuoi = null;
		while(true) {
			System.out.println("Nhap x=");
			x = sc.nextInt(); 
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
	
	int tong() {
		int k=0;
		Node p=head;
		while(p!=null) {
			k=k+p.data;
			p=p.next;
		}
		return k;
	}
	
	int tong_1(Node L) {
		if(L == null) return 0;
		else return L.data + tong_1(L.next);
	}
	
	int tongds_dq() {
		return tong_1(head);
	}
	
	int demle() {
		int n=0;
		Node p=head;
		while(p!=null) {
			if(p.data % 2 !=0)
				n++;
			p=p.next;
		}
		return n;
	}
	
	int demle_dq(Node L) {
		if(L == null) return 0;
		else {
			if(L.data%2!=0)
				return 1+ demle_dq(L.next);
			else
				return demle_dq(L.next);
		}
	}
	
	int demle_dsdq() {
		return demle_dq(head);
	}
	
	void in() {
		System.out.print("\n Noi dung danh sach:\n===>");
		Node p= head; 
		while(p != null) {
			System.out.println(p);
			p=p.next;
		}
		System.out.print("null \n");
	}
	
	void inNodeCuoi(Node L) {
		if(L == null) System.out.println("Rong");
		else {
			if(L.next == null)
				System.out.println(L.data);
			else
				inNodeCuoi(L.next);
		}
	}
	
	void incuoi() {
		inNodeCuoi(head);
	}
	
	void ik(Node L, int k) {
		if(L==null) System.out.println("vi tri in khong hop le");
		else if(k==1) System.out.println("gia tri can in la: "+L.data);
		else ik(L.next, k-1);
	}
	
	void ik_dq(int k) {
		ik(head, k);
	}
	
	public static void main(String[] args) {
		MyQueue p = new MyQueue();

		p.nhapds();
		p.in();
//		System.out.println("dslk co: "+p.dem());
//		System.out.println("Nhap gia tri muon them vao: x= ");
//		p.append(10);
		p.in();
		System.out.println("tong cua dslk: "+p.tong());
		System.out.println("tong cua dslk de quy: "+p.tongds_dq());
		System.out.println("so le: "+p.demle());
		System.out.println("so le dq: "+p.demle_dsdq());
		System.out.println("In not cuoi: "); p.incuoi();
	}
}
