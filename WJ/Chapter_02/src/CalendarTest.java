import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calendar now = Calendar.getInstance(); // getinstance�᫽�ëɪ����Ī�������
		
		int hour = now.get(Calendar.HOUR);         // get()�᫽�ëɪ��������ê����
		int min  = now.get(Calendar.MINUTE);
		
		
		System.out.println("����ð��� "+ hour+"�� "+min+"�� �Դϴ�.");

	}

}
