package buoi7_5_4_2023;
import java.util.ArrayList;
import java.util.Random;
public class array_list_test {
	
	ArrayList<Integer> a;
	
	void sinh(int n) {
		a= new <Integer> ArrayList();
	       for(int i=0; i<n; i++)
	       {
	           Integer x= new Integer((int) (Math.random()*100));
	           a.add(x);
	       }
	}
	
	void in() {
		System.out.println("\n Noi dung danh sach:");
	       for(int i=0; i<a.size(); i++)
	           System.out.print (a.get(i).toString()+ " ");
	}
	
	int demle() {
		int k=0;
		for (int i = 0; i <a.size() ; i++) {
			if(a.get(i)%2 != 0)
				k++;
		}
		return k;
	}
	
	void xoale() {
		int i=0;
		while(i<a.size()) {
			if(a.get(i) %2 ==0) 
				i++;
			else
				a.remove(i);
		}
	}
	
	public static void main(String[] args) {
		array_list_test p = new array_list_test();
		p.sinh(20);
		p.in();
		System.out.println("\nSo phan tu le trong day la: "+ p.demle());
		p.xoale();
		System.out.println("\n Day sau khi xoa cac so le: ");
		p.in();
	}
}
