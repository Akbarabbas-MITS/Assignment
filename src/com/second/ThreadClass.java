package com.second;

import java.util.concurrent.CountDownLatch;

public class ThreadClass {
	public static void main(String[] args) {
		try {
			CountDownLatch latch = new CountDownLatch(4);
			Thread t1 = new Thread(new Runnable() {			
				@Override
				public void run() {
					System.out.println("Thread 1 executed");
					latch.countDown();
				}
			});
			
			Thread t2 = new Thread(new Runnable() {			
				@Override
				public void run() {
					System.out.println("Thread 2 executed");
					latch.countDown();
				}
			});
			
			Thread t3 = new Thread(new Runnable() {			
				@Override
				public void run() {
					System.out.println("Thread 3 executed");
					latch.countDown();
				}
			});
			
			Thread t4 = new Thread(new Runnable() {			
				@Override
				public void run() {
					System.out.println("Thread 4 executed");
					latch.countDown();
				}
			});
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
			latch.await();
			Thread t5 = new Thread(new Runnable() {			
				@Override
				public void run() {
					System.out.println("Thread 5 executed");
				}
			});
			t5.start();
		}catch(Exception e) {
			System.out.println("Exception caught:"+e);
		}
	}
}