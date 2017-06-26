package jenkov.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Consumer(BlockingQueue<Integer> queue) {
		blockingQueue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " consumed " + blockingQueue.take());
			System.out.println(Thread.currentThread().getName() + " consumed " + blockingQueue.take());
			System.out.println(Thread.currentThread().getName() + " consumed " + blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
