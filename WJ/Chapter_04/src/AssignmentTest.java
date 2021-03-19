
public class AssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		x = y = z = 1;
		z += x + y; // z = z + x + y;ªÈÔÒª¸
		System.out.println("x = "+ x +", y ="+ y +", z = "+ z);
		
		x += y -= z = 5; // z = 5; y = y - z; x = x + y;ªÈÔÒª¸
		System.out.println("x = "+ x +", y = "+ y +", z = "+z);
	}

}
