package P8207;

import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;

public class RadixSort {
	int []a;
	void sinh(int n) {
		a = new int[n];
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]= rd.nextInt(1000);
		}
		System.out.println("Da them xong");
	}
	
	void in() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(" "+a[i]);
		}
	}
	
	void Radix_Sort() {
		Queue Q = new LinkedList();
		Queue []QQ; QQ= new LinkedList[10];
		for (int i = 0; i <= 9; i++) {
			QQ[i] = new LinkedList();
		}
		int x, vt, d=1, max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) max=a[i]; Q.add(a[i]);
		}
		int k =(""+max).length();
		for (int i = 0; i <= k; i++) {
			while(!Q.isEmpty()) {
				x=(int)Q.remove();
				vt= (x/d)%10;
				QQ[vt].add(x);
			}
			for (int j = 0; j <=9 ; j++) {
				while(!QQ[j].isEmpty()) {
					x=(int)QQ[j].remove(); Q.add(x);
				}
			}
			d=d*10;
		}
	}
	
	public static void main(String[] args) {
		RadixSort p = new RadixSort();
		p.sinh(100);
		p.in();
		p.Radix_Sort();
		p.in();
	}
}
