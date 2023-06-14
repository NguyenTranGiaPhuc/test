package P8207;
import java.util.*;
public class arraylist {
	int a[];
	int n;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	void sinhmang() {
		System.out.println("Nhap size cua mang: "); 
		this.n = sc.nextInt();
		a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = rd.nextInt()%10;
		}
	}
	
	void in() {
		System.out.print("Mang a: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" "+a[i]);
		}
	}
	
	void cap1() {
		int max1 = a[0];
		int max2 = a[1];
		int min1 = a[2];
		int min2 = a[3];
		for (int i = 0; i < n; i++) {
			if(a[i]>max1)
				max1 = a[i];
			if(a[i]>max2 && a[i]<max1)
				max2 = a[i];
			if(a[i]<min1)
				min1 = a[i];
			if(a[i]<min2 && a[i]>min1)
				min2 = a[i];
		}
		int tich1 = max1*max2;
		int tich2 = min1*min2;
		if(tich1>tich2)
			System.out.println("tich cua "+max1+" va "+max2+" la max" );
		else
			System.out.println("tich cua "+min1+" va "+min2+" la max" );
	}
	
	void xoay(int x) {
		int n = a.length;
		for(int i=1; i<=x;i++) {
			int t=a[0];
			for(int j=0; j<n-1;j++)
				a[j]=a[j+1];
			a[n-1]=t;
		}
	}
	
	void rev(int ll, int rr) {
		int i=ll, j=rr;
		while(i<j) {
			int t=a[i];
			a[i] = a[j];
			a[j] = t;
			i++; j--;
		}
	}
	
	void xoay1(int k) {
		rev(0,k-1);
		rev(k, a.length-1);
		rev(0,a.length-1);
	}
	
	public static void main(String[] args) {
		arraylist p = new arraylist();
		p.sinhmang();
		p.in();
//		p.cap1();
//		p.xoay(5);
		p.rev(3, 4);
		System.out.println();
		p.in();
	}
}
