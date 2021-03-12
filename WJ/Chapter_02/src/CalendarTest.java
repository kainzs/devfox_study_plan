import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calendar now = Calendar.getInstance(); // getinstance«á«½«Ã«ÉªòŞÅéÄª·ªÆíÂà÷
		
		int hour = now.get(Calendar.HOUR);         // get()«á«½«Ã«ÉªòãÁÊàï×ÜÃªòà¾åë
		int min  = now.get(Calendar.MINUTE);
		
		
		System.out.println("ÇöÀç½Ã°£Àº "+ hour+"½Ã "+min+"ºĞ ÀÔ´Ï´Ù.");

	}

}
