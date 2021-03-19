
public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{10, 20, 30, 40},
				{50, 60},
				{70, 80, 90},
		};
		
		System.out.println("�迭�� ���: "+arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println((i+1)+"���� ���� : "+ arr[i].length);
			
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("arr["+ i +"]["+j+"] = "+ arr[i][j]);
			}
		}
	}

}
