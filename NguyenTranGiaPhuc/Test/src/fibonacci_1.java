
public class fibonacci_1 {
long fib1(int n) {
	long []f;
	f = new long[n+1];
	f[0]=f[1]=1;
	for(int i=2; i<=n; i++) f[i] = f[i-1]+f[i-2];
	return f[n];
}

public static void main(String[] args) {
	fibonacci_1 p = new fibonacci_1();
	
	System.out.println(p.fib1(80));
	
	
}
}
