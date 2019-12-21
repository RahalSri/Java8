
public class Test {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			
			public void run() {
				 System.out.println("Annonymous class from extend class example");
			}
		};
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Annonymous class from implement Runnable interface");
			}
		});
		
		t1.start();
		t2.start();

	}

}
