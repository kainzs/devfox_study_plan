
public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myInt = 5316;
		System.out.println("myInt = "+ myInt);
		
		String myString = new Integer(myInt).toString();
		//int -> Integer -> String
		System.out.println("myString = "+ myString);
		
		myString = myString.replace('6', '4');
		// 5316 -> 5314
		
		float myFloat = Float.valueOf(myString).floatValue();
		// String -> Float -> float
		System.out.println("myFloat = "+myFloat);
	}

}
