

class Calculators{
	public int add(int a,int b) {
		return a+b;
	}}
	class CalcAdv extends Calculators{
		public int sub(int a,int b) {
			return a-b;
		}
		
	}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalcAdv obj=new CalcAdv();
int result1=obj.add(2,4);
int result2=obj.sub(2,4);
System.out.println(result1);
System.out.println(result2);

	}

}
