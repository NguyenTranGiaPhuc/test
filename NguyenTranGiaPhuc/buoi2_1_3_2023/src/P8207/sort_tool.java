package P8207;
import java.util.Scanner;
import java.util.Random;
public class sort_tool {
	Scanner sc = new Scanner(System.in);
	int []A;
	void nhapmang() {
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap so thu "+i+" : ");
			A[i] = sc.nextInt();
		}
	}
	
	void sinhmang(int n) {
		Random rd = new Random(1);
		A= new int[n];
		for (int i = 0; i < n; i++) {
			A[i]=rd.nextInt(10000);
		}
	}
	
	void inmang() {
		System.out.println("Noi dung cua mang: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	
	void giai1(int x) {
		for(int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(A[i]<A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		
		giai2(x);
	}
	
	void giai2(int x) {
		int vt=1;
		for (int i = 0; i < A.length; i++) {
			if(A[i]<x) vt++;
		}
		System.out.println("Vi tri cua x neu nhu o trong day sap xep la: "+vt);
	}
	
	public static void main(String[] args) {
		sort_tool p = new sort_tool();
		//p.nhapmang();
		p.sinhmang(1500);
		p.inmang();
		p.giai1(1000);
		p.inmang();
	}
}
