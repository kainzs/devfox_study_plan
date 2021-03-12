
public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		String str3 = str1;
		String str4 = str2;
		
		System.out.println("== 관계");
		System.out.println("str1 == str1 : "+(str1==str1));
		//同じ変数ので当然同じ
		
		System.out.println("str1 == str2 : "+(str1==str2));
		//内容は同じですが保存しているメモリのアドレス	が違います。
		
		System.out.println("str1 == str3 : "+(str1==str3));
		
		System.out.println("str1 == str4 : "+(str1==str4));
		
		System.out.println();
		
		
		System.out.println("Equal 관계");
		System.out.println("str1 equals str1 : "+(str1.equals(str1)));
		//同じ変数ので当然同じ
		
		System.out.println("str1 equals str2 : "+(str1.equals(str2)));
		//保存しているメモリのアドレスは違いますが内容は同じです。
		
		System.out.println("str1 equals str3 : "+(str1.equals(str3)));
		//str3はstr1をコピーした変数
		
		System.out.println("str1 equals str4 : "+(str1.equals(str4)));
		//str4はstr2をコピーした変数
		
		
		
		
	}

}
