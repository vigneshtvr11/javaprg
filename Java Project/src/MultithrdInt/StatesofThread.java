package MultithrdInt;

public class StatesofThread extends Thread{
	public void run() {
	for (int i = 0; i < 4; i++) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatesofThread t1=new StatesofThread();
		StatesofThread t2 = new StatesofThread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println(t2.getState());
		System.out.println(t2.isAlive());
		System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("green");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		//t1.start();
	}

}
