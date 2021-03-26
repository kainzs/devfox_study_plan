
public class OverridngTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog yourDog = new Dog("벤지", 4);

	    yourDog.bark();
	    yourDog.bite("우체부");


	    Snoopy myDog = new Snoopy();

	    myDog.bark(); // 메소드 오버라이딩
	    myDog.bite("낸시", 9); // 메소드 오버로딩
	}

}
