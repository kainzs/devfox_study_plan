
public class CallByValueTest {

	public static void swap(int x, int y) {
		// TODO Auto-generated method stub
		
		int temp = x;
		x = y;
		y = temp;
		
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("swap() �޼��� ȣ�� ��: "+ a +", "+ b);
		swap(a,b);
		System.out.println("swap() �޼��� ȣ�� ��: "+ a +", "+ b);
	}

}
