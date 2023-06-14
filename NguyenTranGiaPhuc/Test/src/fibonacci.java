
public class fibonacci {
long rabbit(int n) {
	if(n==0||n==1) return 1;
	else return rabbit(n-1)+rabbit(n-2);
}

public static void main(String[] args) {
	fibonacci p = new fibonacci();
	long t1= System.currentTimeMillis();
	System.out.println("So tho den dao thang thu 10 la: "+p.rabbit(50));
	long t2=System.currentTimeMillis();
	System.out.println("tg= "+(t2-t1));
	
}
}
