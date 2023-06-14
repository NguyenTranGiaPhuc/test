import java.util.Scanner;

public class Fc2_Max_trong_day_so_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x,max=0;
		System.out.println("\nNhap so phan tu: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap so thu "+ (i+1)+" : ");
			x = sc.nextInt();
			if(i==0) max=x;
			else if(x>max) max=x;
		}
		System.out.println("\nSo lon nhat la: "+max);
	}
}
