class Calculatorss{
	public int add(int a,int b) {
		return a+b;
	}}
	class CalcAdva extends Calculatorss{
		public int sub(int a,int b) {
			return a-b;
		}
		
	}
	class CalcSupAd extends CalcAdva{
		public int multi(int a,int b) {
			return a*b;
		}
	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcSupAd obj=new CalcSupAd();
		int result1=obj.add(2,4);
		int result2=obj.sub(2,4);
		int result3=obj.multi(2,4);
		System.out.println(result1);
		System.out.println(result2);
        System.out.println(result3);
	}
	
	

}
