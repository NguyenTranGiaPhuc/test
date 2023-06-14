package buoi8_12_4_2023;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
	Node(int x ,Node t){
		data = x;
		next = t;
	}
	public String toString() {
		return data+" => ";
	}
}

public class DanhSachLienKet{
	Scanner sc = new Scanner(System.in);
	
	Node head;
	public DanhSachLienKet() {
			head = null;
	}
	void append(int x) {
		
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
		
	}
	void remove(int k) {
		
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
		DanhSachLienKet p = new DanhSachLienKet();

		p.nhapds();
		p.in();
		System.out.println("dslk co: "+p.dem());
		System.out.println("tong cua dslk: "+p.tong());
		System.out.println("so le: "+p.demle());
	}
}

