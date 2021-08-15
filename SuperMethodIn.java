class Ai{
	public Ai() {
		System.out.println("in A");
		
	}
	public Ai(int i) {
		System.out.println("int A in");
	}
	
}

class B extends Ai{
	
	public B() {
		super(5);
		System.out.println("in B");
		
	}
	public B(int i) {
		super(i);
		System.out.println("int B in");
	}
}
public class SuperMethodIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B(5);
	}

}
