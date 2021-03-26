
public class ArrayExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String language[]= {"C언어", "C++언어", "자바"};

	    int i= 1;
	    while(i<4){
	      try{
	        System.out.println(language[i]);
	      }catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("배열의 첨자를 다시 설정합니다.");
	        i= -1;
	      }finally{
	        System.out.println("언제나 출력되는 부분");
	      }
	      i++;
	    }
	}

}
