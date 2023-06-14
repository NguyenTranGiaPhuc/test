package buoi7_5_4_2023;

import java.util.ArrayList;

public class array_list_2 {
	boolean nguyento(int x) {
		if(x<2) {
			return false;
		}else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if(x%i==0)
					return false;
			}
		}
		return true;
	}

	void lietke_nguyento(int n) {
		for (int i = 2; i <= n; i++) {
			if(nguyento(i)) 
				System.out.println(" "+i);
		}
	}
	
	void Eratosthene(int n) {
		ArrayList<Boolean> a=new ArrayList();
		for (int i = 0; i <= n; i++) 
			a.add(Boolean.TRUE);
		for (int p = 2; p <= Math.sqrt(n); p++) {
			if(a.get(p)==true) {
				int j=p+p;
				while(j<=n) {
					a.set(j, Boolean.FALSE);
					j=j+p; //cho cac so la boi so xuong san
				}
			}
		}
		System.out.println("\n Danh sach cac so nguyen to <="+n+":\n");
		for (int i = 2; i <= n; i++) {
			if(a.get(i))
				System.out.println(" "+i);
		}
	}

	public static void main(String[] args) {
		array_list_2 p = new array_list_2();
		int n = 1000000;
//		p.lietke_nguyento(n);
		
		p.Eratosthene(300);
	}
}
