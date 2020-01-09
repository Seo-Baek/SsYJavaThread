package com.sist;

/*
 * Thread 제어 명령어
 * 	- sleep(), join(), interrupt(), stop()
 */
/*
 * Thread 클래스의 sleep() 메소드
 * 	- 현재 실행중인 스레드를 잠시 정지시키는 메소드
 * 		형식) Thread.sleep(밀리세컨드);	//  1/1000초
 * 	- 예외처리를 해야 함.
 */

public class ThreadB extends Thread {

	public ThreadB() {  }
	
	public ThreadB(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i <=10; i++) {
			System.out.println(this.getName() + "_" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
