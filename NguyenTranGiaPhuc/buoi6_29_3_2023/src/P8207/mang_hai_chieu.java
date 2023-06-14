package P8207;
import java.util.*;
public class mang_hai_chieu {
	int [][]a; int m,n; // m la so hang/dong, n la so cot
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	void nhap() {
		System.out.println("Nhap gia tri hang m=");
		this.m = sc.nextInt();
		System.out.println("Nhap gia tri cot n=");
		this.n = sc.nextInt();
		System.out.println("Nhap gia tri cho mang A: ");
		
		a = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
//				System.out.println("a["+i+"]"+"["+j+"]=");
				a[i][j] = rd.nextInt(10);
			}
		}
	}
	
	void in() {
		System.out.println("Mang A: ");
		for (int i = 0; i < m; i++) {
			System.out.println("\n");
			for (int j = 0; j < n; j++) {
				System.out.print("	"+a[i][j]);
			}
		}
	}
	
	void tim_max_dong() {
		
		for (int i = 0; i < m; i++) {
			int max = a[i][0];
			for (int j = 1; j < n; j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
			System.out.println("max dong "+i+"="+max);
		}
	}
	
	void tb_le() {
		int count =0;
		int s = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 1; i < m; i++) {
				if(a[i][j]%2!=0)
					s+= a[i][j];
					count++;
			}
			if(count ==0) {
				System.out.println("0");
			}else
				System.out.println("so le trong cot "+j+"="+(s/count));
		}
	}
	
	void xoay_ngang() {
		for (int i = 0; i < m; i++) {
			int left = 0; int right = n-1;
			while (left < right) {
				int temp = a[i][left];
				a[i][left] = a[i][right];
				a[i][right] = temp;
				left++;
				right--;
				}
		}
	}
	void xoay() {
		int[][] b = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j]=a[m-1-j][i];
			}
		}
		a=b;
		int t=m;m=n;n=t;
	}
	
	mang_hai_chieu Nhan(mang_hai_chieu B) {
		if(this.n!=B.m) {
			System.out.println("Ko nhan duoc hai MT nay!");
			return new mang_hai_chieu(); 
		}else {
			
		}
	}
	
	public static void main(String[] args) {
		mang_hai_chieu m = new mang_hai_chieu();
		m.nhap(); m.in();
//		m.tim_max_dong();
//		m.tb_le();
//		System.out.println("SAU KHI XOAY.");
//		m.xoay_ngang();
//		m.in();
		m.xoay();
		m.in();
	}
}
