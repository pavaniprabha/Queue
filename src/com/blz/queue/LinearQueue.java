package com.blz.queue;

public class LinearQueue {
 public static int[] myQueue = new int[5];
 public static int front = -1, rear = -1;
     public static void enQueue(int element) {
    	 if(isFull()) {
    		System.out.println("Queue is full!!!"); 
    	 }
    	 else {
    		rear ++;
    		 myQueue[rear]= element;
    	 }
     }
	private static boolean isFull() {
		if(rear == myQueue.length -1)
			return true;
		return false;
	}
    public static void Display() {
    	if(isEmpty()) {
    		System.out.println("queue is empty!!!");
    	}
    	else {
    		for (int i = front + 1; i <= rear; i++) {
    			System.out.println("myQueue[" + i + "] = " + myQueue[i]);
    		}
    	}
    }
	private static boolean isEmpty() {
		if(front == rear)
		return true;
		return false;
	}
	public static void deQueue() {
		if(isEmpty()) {
			System.out.println("queue is empty!!!!");
		}
		else {
			front ++;
			System.out.println("myQueue[" + front + "] = " + myQueue[front] + " is deleted from queue");
		 myQueue[front] = 0;
		}
		
	}
	public static void main(String[] args) {
		   enQueue(10);
	        enQueue(20);
	        enQueue(30);
	        enQueue(40);
	        enQueue(50);
	        enQueue(60);
	        Display();
	        deQueue();
	        deQueue();
	        deQueue();
	        deQueue();
	        deQueue();
	        deQueue();
	        Display();
	        deQueue();
	    }


}


