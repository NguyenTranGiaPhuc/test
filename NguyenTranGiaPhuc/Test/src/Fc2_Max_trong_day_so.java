
import java.util.Scanner;

public class Fc2_Max_trong_day_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a;
        int n, max=0;
        System.out.println("\n Nhap so phan tu cua mang: ");
        n= sc.nextInt(); a = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap so thu"+(i+1)+":");
            a[i] = sc.nextInt();
        }
        max=a[0];
        for(int i=1; i<n;i++) if (a[i]>max) max=a[i];
        System.out.println("\n So lon hnat la: "+max);
        
    }
    
}
