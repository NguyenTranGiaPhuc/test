package buoi11_5_10_2023;

import java.util.Scanner;

public class QMyQueue {
	Node head,tail;
	QMyQueue()
	{
		head=tail=null;
	}
	boolean EmptyQ()
	{
		return head==null;
	}
	void AddQ(int x)
	{
		Node t=new Node(x);
		if(head==null)head=tail=t;
		else {
			tail.next=t;
			tail=t;
		}
	}
	int RemoveQ()
	{
		int x=0;
		if(head==null)System.out.println("Hang doi rong");
		else {
			x=head.data;
			if(head.next==null)head=tail=null;
			else head=head.next;
		}
		return x;
	}
	void nhap() {
		int x;
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.println("nhap 1 so <>0 de them vao NX:");
			x= kb.nextInt();
			if(x==0) break;
			AddQ(x);
		}
		System.out.println("Da them xong");
	}
	void in()
	{
		QMyQueue q1=new QMyQueue();
		System.out.println("Noi dung hang cho");
		while(!EmptyQ())
		{
			int x = RemoveQ();
			System.out.println(x+" ");
			q1.AddQ(x);
		}
		while(!q1.EmptyQ()) { int x=q1.RemoveQ(); AddQ(x);}
	}
	int sum()
	{
			int sum=0;
			QMyQueue q1=new QMyQueue();
			int x=0;
			while(!EmptyQ())
			{
				x=RemoveQ();
				sum+=x;
				q1.AddQ(x);
				
			}
			while(!q1.EmptyQ()) {
				x=q1.RemoveQ();
				AddQ(x);
			}
			return sum;
	}
}
