import java.util.*;
import java.io.*;


public class GameJava2_05 {

	public static int playGame() throws IOException{
		int x, y, z;
		Random r = new Random();
		x = Math.abs(r.nextInt() % 9 ) + 1;
		
		do {
			y = Math.abs(r.nextInt() % 9) + 1;
		} while(y==x); //x値とy値が等しくないまで繰りす
		
		do {
			z = Math.abs(r.nextInt() % 9) + 1;
		} while((z==x)||(z==y)); // x,y,zの値が等しくないまで繰りす
		
		//System.out.println(x +", "+ y +", "+ z);
		//コンピュータが選択した数字が必要な場合にはコメント解除
		
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException{
	
		int count; //問題を解いた回数
		int strike, ball;
		
		int[] usr = new int[3]; //ユーザーが入力した数字 3つ
		int[] com = {x, y, z};  //コンピューターが選択した数字は3つ
		
		System.out.println("숫자 야구게임");
	
		count = 0;
		
		do {
			count++;
			
			do {
				System.out.println("\n카운트: "+count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.print("1번째 숫자: ");
				user = in.readLine();				   
				usr[0] = new Integer(user).intValue(); 
				
				System.out.print("2번째 숫자: ");
				user= in.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.print("3번째 숫자: ");
				user = in.readLine();
				usr[2] = new Integer(user).intValue();
				
				if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)) {
					System.out.println("0은 입력하지 마십시요. 다시 입력해주십시오");
				}else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)) {
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요");
				}else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])) {
					System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요");
				}
			}while((usr[0]==0)||usr[1]==0||(usr[2]==0)||(usr[0]>9)||(usr[1]>9)||(usr[2]>9)||(usr[0]==usr[1])||(usr[1]==usr[2])||usr[0]==usr[2]);
			
			strike = ball = 0;
			
			if(usr[0]==com[0]) strike++;
			if(usr[1]==com[1]) strike++;
			if(usr[2]==com[2]) strike++;
			
			if(usr[0]==com[1]) ball++;
			if(usr[0]==com[2]) ball++;
			if(usr[1]==com[0]) ball++;
			if(usr[1]==com[2]) ball++;
			if(usr[2]==com[0]) ball++;
			if(usr[2]==com[1]) ball++;
			
			System.out.println("Strike: "+ strike +" Ball: "+ball); //ballcount出力
		}while((strike<3)&&(count<11));
		
		return count;
			
	}
	
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int result;
		
		if(args.length==3) {
			int x = Integer.valueOf(args[0]).intValue();
			
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x, y, z);
		}else {
			result = playGame();
		}
		
		System.out.println();
		if(result<=2) {
			System.out.println("매우 굿");
		}else if(result <=5) {
			System.out.println("굿");
		}else if(result <= 9) {
			System.out.println("애매");
		}else {
			System.out.println("분발해야함");
		}
	}

}
