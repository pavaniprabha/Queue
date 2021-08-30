package com.blz.queue;

public class CircularQueue {
	 static final int SIZE = 5;
	    static int[] myQueue = new int[SIZE];

	    static int front = -1, rear = -1;

	    public static void enQueue(int element) {
	        if (isFull()) {
	            System.out.println("Queue is Full..");
	        } else {
	            if (front == -1)
	                front = 0;
	            rear = (rear + 1) % SIZE;
	            myQueue[rear] = element;
	        }
	    }

	    public static boolean isFull() {
	        if (front == 0 && rear == SIZE - 1)
	            return true;
	        if (front == rear + 1)
	            return true;
	        return false;
	    }

	public static boolean isEmpty() {
	        if (front == -1)
	            return true;
	        return false;
	    }

	    public static void display() {
	        int temp = 0;
	        if (isEmpty()) {
	            System.out.println("Queue is Empty...");
	        } else {
	            for (temp = front; temp != rear; temp = (temp + 1) % SIZE) {
	                System.out.println("myQueue[" + temp + "] = " + myQueue[temp]);
	            }
	            System.out.println("myQueue[" + temp + "] = " + myQueue[temp]);
	        }
	    }
//	    do {
//	    	
//	    	System.out.println("myQueue[" + temp + "] = " + myQueue[temp]);
//	    	 temp = front;
//	    	temp =(temp + 1) % SIZE;
//	    	 
//	    }while(temp!= rear);
//	    
//	    
//	    
//	    
//	    }
//	    
	    

	public static void deQueue() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty!!!");
	        } else {
	            myQueue[front] = 0;
	            if (front == rear) {
	                front = -1;
	                rear = -1;
	            } else {
	                front = (front + 1) % SIZE;
	            }
	        }
	    }
	public static void main(String[] args) {
	        enQueue(10);
	        enQueue(20);
	        enQueue(30);
	        enQueue(40);
	        enQueue(50);
	        enQueue(60);
	        display();
	        deQueue();deQueue();deQueue();
	        deQueue();deQueue();deQueue();
	        display();
	        enQueue(60);
	        display();
	        deQueue();
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}