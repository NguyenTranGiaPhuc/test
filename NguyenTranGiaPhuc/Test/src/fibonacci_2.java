
public class fibonacci_2 {
long fib2(int n) {
	long f0=1, f1=1, f2;
	for(int i=2;i<=n; i++) {
		f2=f1+f0; f0=f1; f1=f2;
	}
	return f1;
}

public static void main(String[] args) {
	fibonacci_2 p = new fibonacci_2();
	System.out.println("So fibonacci thu 180 la: "+p.fib2(180));
}
}
