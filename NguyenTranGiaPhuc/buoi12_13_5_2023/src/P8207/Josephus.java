package P8207;

public class Josephus {
	
	void Josephus_1(int n, int k) {
		QMyQueue Q = new QMyQueue();
		for (int i = 1; i <=n; i++) {
			Q.AddQ(i);
		}
		int d=0, vt=1;
		while(d<n-1) {
			int x= Q.RemoveQ();
			if(vt<k) {
				vt++; 
				Q.AddQ(x);
			}
			else {
				d++; //d tuong ung voi so nguoi da bi loai
				vt=1;
			}
		}
		System.out.println("Vua la: "+Q.RemoveQ());
	}
	
	void raidxSort() {
		
	}
	
	public static void main(String[] args) {
		Josephus p = new Josephus();
		p.Josephus_1(17, 1);
	}
}
