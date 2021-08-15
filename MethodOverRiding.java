class C{
	public void eat() {
		System.out.println("in C");
	}
}
class D extends C{
	@Override
	public void eat() {
		System.out.println("in D");
	}
}
class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D obj=new D();
obj.eat();
	}

}
