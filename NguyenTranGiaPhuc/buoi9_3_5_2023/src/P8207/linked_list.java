package P8207;

import java.util.Scanner;

public class linked_list {
	
	Scanner sc = new Scanner(System.in);
	Node head;
	public linked_list() {
			head = null;
	}
	void append(int x) {
		Node t = new Node(x);
		if(head == null)
			head = t;
		else {
			Node p = head; while(p.next!=null) p=p.next;
			p.next = t;
		}
		 
	}
	void add(int x) {
		head = new Node(x, head);
	}
	
	int dem() {
		int k=0;
		Node p= head;
		while(p!=null) {
			k++;
			p=p.next;
		}
		return k;
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
	
	void removefirst() {
		if(head == null) System.out.println("Khong xoa duoc.");
		else head = head.next;
	}
	
	void removelast() {
		
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
	void in() {
		System.out.print("\n Noi dung danh sach:\n===>");
		Node p= head; 
		while(p != null) {
			System.out.println(p);
			p=p.next;
		}
		System.out.print("null \n");
	}
	public static void main(String[] args) {
		linked_list p = new linked_list();

		p.nhapds();
		p.in();
//		System.out.println("dslk co: "+p.dem());
		System.out.println("Nhap gia tri muon them vao: x= ");
		p.append(10);
		p.in();
//		System.out.println("tong cua dslk: "+p.tong());
//		System.out.println("so le: "+p.demle());
	}
}
