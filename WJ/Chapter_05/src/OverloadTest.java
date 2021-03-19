
public class OverloadTest {

	public static int max(int x ,int y) //int型の因数二つをもらうmax()メソッド
	{
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	public static double max(double x,double y) //double型の因数二つをもらうmax()メソッド
	{
		
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(max(a,b));
		
		double c = 10.5;
		double d = 20.5;
		System.out.println(max(c,d));
	}

}
