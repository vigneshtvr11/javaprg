package MultithrdInt;

public class TwoThredMingleOutput extends Thread {
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
		TwoThredMingleOutput os=new TwoThredMingleOutput();
		TwoThredMingleOutput ose = new TwoThredMingleOutput();
		os.start();
		ose.start();
	}

}
