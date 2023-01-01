package collection;

public class twoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {16,32,96};
	int gcd=a[0];
	for(Integer i: a) {
		gcd=getGCD(gcd, i);
		System.out.println(gcd);
	}
	System.out.println(gcd+"My gcd");

	}
	public static int getGCD(int a, int b) {
		
		System.out.println(" round print a value="+ a);
		System.out.println(" round print b value="+ b);
		
		if(b==0) {
			return a;
		}
		int rem=a%b;
		System.out.println("remender of "+ rem);
		return getGCD(b,rem);
	}

}
