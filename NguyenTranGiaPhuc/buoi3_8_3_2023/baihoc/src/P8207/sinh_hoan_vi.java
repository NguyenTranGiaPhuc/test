package P8207;

import java.util.Random;

public class sinh_hoan_vi {
	int a[];
	int n;
	void hoan_vi(int n) {
		a = new int[n];
		Random rd = new Random();
		System.out.println("\n Dan sinh hoan vi....");
		for (int i = 0; i < a.length; ) {
			int x = rd.nextInt(n)+1, dd=0;
			for (int j = 0; j < i; j++) {
				if(a[j]==x) {
					dd=1;
					break;
				}
			}
			if(dd==0) {
				a[i++] = x;
//				System.out.println(" * ");
			}
		}
	}
	
	void hoan_vi_2(int n) {
		a = new int[n];
		int []dd = new int[n+1]; 
		for (int i=1; i<=n; i++)
			dd[i]= 0;
		Random rd = new Random();
		System.out.println("\n Dan sinh hoan vi.....");
		for (int i = 0; i < a.length;) {
			int x= rd.nextInt(n) + 1;
			if(dd[x] == 0) {
				a[i++] = x;
				dd[x] = 1;
//				System.out.println(" * ");
			}
		}
	}
	
	public static void main(String[] args) {
		sinh_hoan_vi p = new sinh_hoan_vi();
		int n =1000;
		long t1 = System.currentTimeMillis();
		p.hoan_vi(n);
		long t2 = System.currentTimeMillis();
		System.out.println("Thoi gian chay la:"+(t2-t1));
		long t3 = System.currentTimeMillis();
		p.hoan_vi_2(n);
		long t4 = System.currentTimeMillis();
		System.out.println("Thoi gian chay la:"+(t4-t3));
	}
}
