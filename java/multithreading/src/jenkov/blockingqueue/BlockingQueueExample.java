package jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String args[]){
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer, "producer").start();
		new Thread(consumer, "consumer").start();
	}
}
