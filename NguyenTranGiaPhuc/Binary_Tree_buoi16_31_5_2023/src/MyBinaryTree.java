import java.util.Scanner;

public class MyBinaryTree {
	TNode root;
	
	void taocayT() {
		TNode A = new TNode(1, null, null);
		TNode B = new TNode(9, new TNode(7),null);
		TNode C = new TNode(3, A, B);
		TNode D = new TNode(2, new TNode(4), new TNode(5));
		TNode E = new TNode(6, null, D);
		root = new TNode(8,C,E);
	}
	
	void duyet1(TNode T) {
		if(T != null) {
			System.out.println(" "+T.data);
			duyet1(T.left);
			duyet1(T.right);
		}
	}
	
	void duyet2(TNode T) {
		if(T!=null) {
			duyet2(T.left);
			System.out.println(" "+ T.data);
			duyet2(T.right);
		}
	}
	
	void duyet3(TNode T) {
		if(T!=null) {
			duyet2(T.left);
			
			duyet2(T.right);
			System.out.println(" "+ T.data);
		}
	}
	
	void duyettientu() {
		System.out.println("Duyet tien tu");
		duyet1(root);
	}
	
	void duyettrungtu() {
		System.out.println("Duyet trung tu");
		duyet2(root);
	}
	
	void duyethautu() {
		System.out.println("Duyet hau tu");
		duyet3(root);
	}
	
	int demla(TNode T) {
		if(T == null) 
			return 0;
		else 
			return 1 +demla(T.left)+ demla(T.right);
	}
	
	TNode chendd(int x, TNode T) {
		if(T == null) T = new TNode(x);
		else
			if(demla(T.left) > demla(T.right)) T.right= chendd(x, T.right);
			else T.left= chendd(x, T.left);
		return T;
	}
	
	void nhapcaydd() {
		root = null;
		Scanner kb = new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("Nhap x khac 0 de them vao cay: ");
			x =kb.nextInt();
			if(x==0) break;
			else root= chendd(x, root);
		}
	}
	
	int tongn(TNode T) {
		if(T== null || (T.left == null && T.right == null))
			return 0;
		else
			return T.data + tongn(T.left) + tongn(T.right);
	}
	
	int tong_le(TNode T) {
		if(T== null)
			return 0;
		else {
			if(T.data % 2 != 0)
				return T.data + tong_le(T.left) + tong_le(T.right);
			else
				return tong_le(T.left)+ tong_le(T.right);
		}
	}
	
	int dem_1_con(TNode T) {
		if(T == null || T.left == null || T.right == null) 
			return 0;
		else {
			if(T.data !=0 && T.left != null && T.right != null)
				return dem_1_con(T.left) + dem_1_con(T.right);
			else
				return 1 + dem_1_con(T.left) + dem_1_con(T.right);
		}	
		
	}
	
	int cao(TNode T) {
		if(T == null) return 0;
		else return 1 + Math.max(cao(T.left), cao(T.right));
	}
	
	int cao() {
		return cao(root);
	}
	
	boolean cb(TNode T) {
		if(T == null) return true;
		else 
			if(Math.abs(cao(T.left)-cao(T.right)) >1 ) return false;
			else return cb(T.left) && cb(T.right);
	}
	
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
	
	public static void main(String[] args) {
		MyBinaryTree p = new MyBinaryTree();
//		p.taocayT();
//		p.duyettientu();
//		System.out.println();
//		p.duyettrungtu();
//		System.out.println();
//		p.duyethautu();
		p.nhapcaydd();
		p.duyettientu();
		p.duyettrungtu();
		p.duyethautu(); 
	}
}
