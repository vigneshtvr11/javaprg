package MultithrdInt;

public class MultiUsingWait extends Thread {
	public void run() {
		System.out.println("ppredefeined");
	}

	public void first() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultiUsingWait oba=new MultiUsingWait();
		 oba.first();
		 oba.start();
		 System.out.println("hi");
	}

}
