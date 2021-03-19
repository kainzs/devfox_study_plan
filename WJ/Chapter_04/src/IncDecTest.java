
public class IncDecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
		x= 10; 
		y= 5;
		z= 0;
		
		z= x++ - y-- + 1; //＋＋やーーが変数の後ろにある場合
		System.out.println("x = "+ x +", y = "+ y +", z ="+z);
		
		x= 10; 
		y= 5;
		z= 0;
		z= ++x - --y +1; ////＋＋やーーが変数の前にある場合
		System.out.println("x = "+ x +", y = "+ y +", z = "+z);
	}

}
