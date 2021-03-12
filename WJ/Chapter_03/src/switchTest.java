
public class switchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("결과는 1입니다.");
			break;
			
		case 2:  //ブレイクがなくてケース 3まで連続的に実行
		case 3:
			System.out.println("결과는 2 또는 3입니다.");
			break;
			
		default: //条件と一致しない場合に実行される部分
			System.out.println("결과는 1,2,3이 아닙니다.");
			break;
		}
	}

}
