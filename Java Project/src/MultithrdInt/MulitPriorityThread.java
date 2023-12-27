package MultithrdInt;

public class MulitPriorityThread extends Thread {
	public void run() {
		System.out.println("ppredefeined");
		System.out.println(Thread.currentThread());
	}

	public void first() {
		// TODO Auto-generated method stub
		System.out.println("class method");
	}
	public void SECOND() {
		System.out.println("2 class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulitPriorityThread obj=new MulitPriorityThread();
		MulitPriorityThread obk=new MulitPriorityThread();

		obj.first();//Inclass main Thread so 1st pririty
		obj.start();//other thread so 2nd priority
		obj.SECOND();
		System.out.println("main method");
		System.out.println(Thread.currentThread());
	}

}
