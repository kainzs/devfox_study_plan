
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();
		p.x = 10;
		p.y = 20;
		p.printXY();
	}

}

class Point
{
	int x,y;
	
	public void printXY() {
		System.out.println("x="+ x +", y="+ y);
	}
}