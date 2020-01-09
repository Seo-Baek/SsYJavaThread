package com.sist;

/*
 * Thread 클래스의 join() 메소드
 * 	- 하나의 스레드가 다른 스레드가 하는 일이 완료될 때까지
 *    기다리도록 할 때 쓰이는 메소드.
 */

public class Ex02 extends Thread {
		
		int start, end, total;
		
		public Ex02() {   }
		
		public Ex02(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			for(int i = start; i <= end; i ++) {
				
				total += i;
			}
		}
		
		public static void main(String[] args) {
			
			Ex02 ex1 = new Ex02(1,50);
			Ex02 ex2 = new Ex02(51,100);
			
			ex1.start(); ex2.start();
			
			try {
				ex1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int total = ex1.total + ex2.total;
			System.out.println("ex1.total >>> " + ex1.total);
			System.out.println("ex2.total >>> " + ex2.total);
			
			System.out.println(total);
			
		}
		
	

}
