import java.io.*;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("거꾸로 뒤집을 문자열을 입력해주세요");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	
	}

}
