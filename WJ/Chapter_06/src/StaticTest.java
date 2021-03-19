
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass[] mc = new MyClass[10];//10個のMyClass型オブジェクトを持つ配列宣言
		
		for(int i=0; i<10; i++) {
			mc[i] = new MyClass();  //myclassクラスのオブジェクト作成
			System.out.println("MyClass Instance의 수"+ mc[0].getObjectNum()+"개");
			//MyClassのgetObjectNum()メソッドを呼び出して値を出力
		}
	}

}

class MyClass
{
	static int object_num = 0;
	
	public MyClass()
	{
		object_num++;
	}
	
	public static int getObjectNum()
	{
		return object_num;
	}
}