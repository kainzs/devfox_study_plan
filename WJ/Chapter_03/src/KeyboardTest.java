import java.io.*;

public class KeyboardTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//InputStreamオブジェクトにリーダー(reader)を連結
		
		BufferedReader in = new BufferedReader(isr);
		//リーダーをまたバッファーに連結
		
		String str;
		System.out.println("글씨를 입력하면 따라합니다.");
		
		str = in.readLine();
		//キーボードから一行入力してもらう
		
		System.out.println(str);
	}

}
