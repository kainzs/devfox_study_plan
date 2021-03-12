import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Random r = new Random(); //Randomクラスオブジェクト作成
			
			System.out.println("0~99범위의 난수: "+ Math.abs(r.nextInt()% 100));
			//乱数の余りを絶対値にする
	}

}
