import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;


public class GameJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(); //��Date���髹�Ϋ��֫�����������
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� MM�� dd���� ");
		//�����������Ҫ�����
		
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()%100+1);
		
		System.out.println("������(100): "+randomNum+ "%");
		
		
		
	}

}
