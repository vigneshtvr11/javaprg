package MultithrdInt;

public class MultiIntro   {
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}
	public void display()
	{
		for (int i = 0; i <4; i++) {
			System.out.println(i);
		}

	}
	public static void main(String[] args) {//main also called as Thread we get a  error
		// TODO Auto-generated method stub

		//System.out.println(length());//if call means we get thread emain lang error
		MultiIntro m=new MultiIntro();
		m.print();
		m.display();
	}

}
