package jenkov.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> queue) {
		blockingQueue = queue;
	}

	@Override
	public void run() {
		try {
			blockingQueue.put(1);
			System.out.println(Thread.currentThread().getName() + " produced " + blockingQueue.peek());
			Thread.sleep(1000);
			blockingQueue.put(2);
			System.out.println(Thread.currentThread().getName() + " produced " + blockingQueue.peek());
			Thread.sleep(1000);
			blockingQueue.put(3);
			System.out.println(Thread.currentThread().getName() + " produced " + blockingQueue.peek());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
