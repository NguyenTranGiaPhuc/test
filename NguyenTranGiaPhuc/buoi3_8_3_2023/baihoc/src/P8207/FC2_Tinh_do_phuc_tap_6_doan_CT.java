package P8207;

public class FC2_Tinh_do_phuc_tap_6_doan_CT {
	long sub1(int n) {
		long sum=0;
//		for (int i=0;i<n;i++)
//			sum++; // 1000
		for (int i=0;i<n;i++) {
			for (int j=0;j<n*n;j++) {
				sum++; //1000000000
			}
		}
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				sum++; // 1000000
//			}
//		}
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<i;j++) {
//				sum++; // 499500
//			}
//		}
//		for (int i =0;i<n;i++)
//			for (int j =0;j<i*i;j++)
//				for (int k=0;k<j;k++)
//					sum++;
//		for (int i=1;i<n;i++)
//			for (int j=1;j<i*i;j++)
//				if (j%i==0)
//					for (int k=0;k<j;k++)
//						sum++;
		return sum;
		
	}
	public static void main(String[] args) {
		int n = 6000;
		FC2_Tinh_do_phuc_tap_6_doan_CT m = new FC2_Tinh_do_phuc_tap_6_doan_CT();
		long t1 = System.currentTimeMillis();
		System.out.println("Sub1= "+m.sub1(n));
		long t2 = System.currentTimeMillis();
		System.out.println("Thoi gian chay sub1 voi n= "+n+" la:"+(t2-t1));
	}
}
