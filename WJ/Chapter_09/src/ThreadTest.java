
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mythread1, mythread2;

	    mythread1= new MyThread("Thread-1");
	    mythread1.start();

	    mythread2= new MyThread("Thread-2");
	    mythread2.start();
	}

}
