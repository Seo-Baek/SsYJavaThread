package com.sist;

public class ThreadA_amain {

	public static void main(String[] args) {
		
		// ThreadA 클래스를 대상으로 멀티쓰레드 객체를 생성
		ThreadA t1 = new ThreadA("첫번째 스레드");
		ThreadA t2 = new ThreadA("두번째 스레드");
		ThreadA t3 = new ThreadA("세번째 스레드");
		ThreadA t4 = new ThreadA("네번째 스레드");
		ThreadA t5 = new ThreadA("다섯번째 스레드");
		ThreadA t6 = new ThreadA("여섯번째 스레드");
		
		t1.start(); t2.start(); t3.start();
		t4.start(); t5.start(); t6.start();
		
		
	}

}
