
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aAnimal= new Animal();
	    aAnimal.print();

	    Human aHuman= new Human();
	    aHuman.print();

	    Boy aBoy= new Boy();
	    aBoy.print();

	    System.out.println();

	    Animal tiger= new Animal("거북이",8);
	    tiger.print();

	    Human mary= new Human("김정아", 20);
	    mary.print();

	    Boy smin= new Boy("백승민", 14);
	    smin.print();
	  }
}


