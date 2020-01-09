package com.sist;

public class ThreadB_main {

	public static void main(String[] args) {
		
		// 멀티스레드 객체 생성
		ThreadB t1 = new ThreadB("스레드1");
		ThreadB t2 = new ThreadB("스레드2");
		ThreadB t3 = new ThreadB("스레드3");
		ThreadB t4 = new ThreadB("스레드4");
		ThreadB t5 = new ThreadB("스레드5");
		
		// 멀티스레드 실행
		t1.start(); t2.start(); 
		t3.start(); t4.start(); t5.start();
		
	}

}
