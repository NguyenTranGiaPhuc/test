import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyBST {
	
	TNode root;
	
	TNode insertBST(int x, TNode T) {
		if(T == null) T = new TNode(x);
		else if(x == T.data) System.out.println("Da co "+x+" trong cay");
			else if(x < T.data) T.left= insertBST(x, T.left);
			else T.right= insertBST(x, T.right);
		return T;
	}
	
	void insertBST(int x) {
		root = insertBST(x, root);
	}
	
	void taocayBST() {
		root = null;
		Scanner kb = new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("Nhap x khac 0 de them vao cay: ");
			x =kb.nextInt();
			if(x==0) break;
			else root= insertBST(x, root);
		}
	}
	
	void duyettrungtu() {
		System.out.println("Duyet trung tu.");
		duyet2(root);
	}
	
	void duyet1(TNode T) {
		if(T != null) {
			System.out.println(" "+T.data);
			duyet1(T.left);
			duyet1(T.right);
		}
	}
	
	void duyettientu() {
		System.out.println("Duyet tien tu");
		duyet1(root);
	}
	
	void duyet3(TNode T) {
		if(T != null) {
			duyet3(T.left);
			duyet3(T.right);
			System.out.println(" "+T.data);
			
		}
	}
	
	void duyethautu() {
		System.out.println("Duyet hau tu");
		duyet3(root);
	}
	
	void duyet2(TNode T) {
		if(T != null) {
			duyet2(T.left);
			System.out.println(" "+T.data);
			duyet2(T.right);
		}
	}
	
	void chieurong() {
		System.out.println("Duyet cay theo chieu rong: ");
		Queue <TNode> Q = new LinkedList<TNode>();
		if(root != null) Q.add(root); 
		else System.out.println("Cay rong!");
		
		while(! Q.isEmpty()) {
			TNode x = Q.remove();
			System.out.println(x.data + " ");
			if(x.left != null) Q.add(x.left);
			if(x.right != null) Q.add(x.right);
		}
	}
	
	TNode tim_xoa(int x, TNode T) {
		if(T == null) System.out.println(" cay rong, khong xoa duoc!");
		else if(x<T.data) T.left = tim_xoa(x, T.left);
			else if(x > T.data)  T.right = tim_xoa(x, T.right);
			else {
				if(T.left == null && T.right == null) T= null;
				else if(T.left == null) T=T.right;
					else if(T.right == null) T= T.left;
					else {
						TNode p = T.left;
						while(p.right != null) p=p.right;
						T.data = p.data; T.left = tim_xoa(p.data, T.left);
					}
			}
		return T;
	}
	
	public static void main(String[] args) {
		MyBST p = new MyBST();
		p.taocayBST();
//		p.duyettrungtu();
		p.duyettientu();
		System.out.println("Duyet theo chieu rong");
		p.chieurong();
	}
	
}
