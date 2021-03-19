
public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour, min, sec;
		
		hour = 13;
		min = 30;
		sec = 25;
		
		String ampm;
		ampm = (hour >= 12) ? "PM" : "AM"; //午前,午後決定
		hour = (hour >= 12) ? (hour - 12) : hour; //24時間表記を12時間表記に変更
		
		System.out.println(ampm + " " + hour +":"+min +":"+ sec);
	}

}
