package jenkov.first;

public class MyThread{
	public static void main(String[] args)
			throws InterruptedException {
		
		MyRunnable task = new MyRunnable();
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task, "second thread");
		
		thread1.start();
		thread2.start();

		//Thread.currentThread().sleep(100);

		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());

	}
}
