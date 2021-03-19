import java.util.*;
import java.io.*;

public class GameJava2_04 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int x , y;
		Random r= new Random();
		
		if(args.length==1) {
			x = Integer.valueOf(args[0]).intValue();
			// 因數はString型のでwrapperクラスを使ってint型で変換
		}else {
			x = Math.abs(r.nextInt() % 9 ) + 1;
		}
		
		y = Math.abs(r.nextInt() % 9) + 1;
		
		int num = x*y;
		
		System.out.println();
		System.out.println("* 구구단"+ x +"단에 대한 문제입니다.");
		System.out.println();
		
		System.out.print(x +" * "+ y +" = ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		user = in.readLine();
		
		int inputNum = new Integer(user).intValue();
		//キーボードから入力されたのはString型のでwrapperクラスを使ってint型で変換
		
		if(num == inputNum) {
			System.out.println("맞았습니다.");
		}else {
			System.out.println("틀렸습니다. 정답은 "+ num +"입니다.");
		}

	}

}
