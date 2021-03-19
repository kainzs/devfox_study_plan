
public class CallByValueTest2 {

	static int a; //グロバル変数
	static int b;
	
	public static void swap() {
		
		int temp = a; 
		a = b;
		b = temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a = 10;
		b = 20;
		
		System.out.println("swap() 메서드 호출 전: "+ a +", "+b);
		swap();
		System.out.println("swap() 메서드 호출 후: "+ a +", "+b);
	}

}
