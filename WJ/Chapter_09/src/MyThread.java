
public class MyThread extends Thread{
	int num= 0;

	  public MyThread(String name)
	  {
	    super(name);
	  }

	  public void run()
	  {
	    while(true){
	      System.out.println(this.getName() + ": "+ num);
	      num++;

	      try{
	        sleep(1000);
	      }catch(InterruptedException ie){}
	    }
	  }
}
