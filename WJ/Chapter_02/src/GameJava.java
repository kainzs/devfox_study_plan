import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;


public class GameJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(); //¡¡Date«¯«é«¹ªÎ«ª«Ö«¸«§«¯«ÈíÂà÷
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏÀÇ ");
		//¡¡õóÕôªÎû¡ãÒªòøúª¹
		
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()%100+1);
		
		System.out.println("±İÀü¿î(100): "+randomNum+ "%");
		
		
		
	}

}
