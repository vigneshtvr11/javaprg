package MultithrdInt;

public class ThreadUsingJoin extends Thread {
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
		ThreadUsingJoin abc = new ThreadUsingJoin();
		ThreadUsingJoin def = new  ThreadUsingJoin();
		abc.start();
		try {
			abc.join();// join means cant distrub other thread executions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		def.start();
		
	}

}
