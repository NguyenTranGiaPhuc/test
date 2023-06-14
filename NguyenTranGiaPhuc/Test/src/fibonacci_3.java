import java.math.BigInteger;

public class fibonacci_3 {
BigInteger fib3(int n) {
	BigInteger f0,f1,f2;
	f0 = BigInteger.ONE; f1=BigInteger.ONE;
	for(int i=2; i<=n;i++) {f2=f1.add(f0); f0=f1; f1=f2;}
	return f1;
}

public static void main(String[] args) {
	fibonacci_3 p = new fibonacci_3();
	long t1= System.currentTimeMillis();
	System.out.println(p.fib3(1000000));
	long t2=System.currentTimeMillis();
	System.out.println("tg= "+(t2-t1));
}
}
