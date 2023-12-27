package MultithrdInt;

public class Multi2 extends Thread{
	//Parallel Executions
	public void run()
	{
		System.out.println("welcome new thread is running");
		System.out.println(Thread.currentThread());
	}
	
	public void print() {
		for(int i=0;i<=5;i++) {
			System.out.println("*");
			System.out.println(Thread.currentThread());
		}
	}
	public static void main(String args[])
	{
		Multi2 s=new Multi2();
		Multi2 p = new Multi2();
		p.start();
		s.start();//start is not a method of simple class so getting error.
		s.print();//main thread
		System.out.println("Main thraed is running");
		System.out.println(s.currentThread());
		
		
	}
}

