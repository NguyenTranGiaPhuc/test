
public class thaphanoi {
	static void hanoi(int n, String A, String B, String C) {
		if(n==1) System.out.println("Chuyen 1 dia tu "+A+" sang "+C);
		else {
			hanoi(n-1, A, C, B);
			hanoi(1, A, B, C);
			hanoi(n-1, B, A, C);
		}
	}
	
	static void np(int n) {
		if(n>0) {
			np(n/2);
			System.out.println(n%2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Bieu dien nhi phan cua 103 la: "); np(103);
		System.out.println("Bai toan thap HN voi n=5: "); hanoi(5, "A", "B", "C");
	}
}
