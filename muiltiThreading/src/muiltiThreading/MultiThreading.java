package muiltiThreading;

public class MultiThreading {

	public static void main(String[] args) {
		
		Thread thread = new NewThread();
		
		thread.setName("working thread");
		
		thread.start();

	}
	
	private static class NewThread extends Thread {

		@Override
		public void run() {
			System.out.println("This is the thread name " + this.getName());
		}
		
	}

}
