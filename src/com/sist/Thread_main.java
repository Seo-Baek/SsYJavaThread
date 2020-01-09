package com.sist;

public class Thread_main {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();		// 1-3-1) 스레드 클래스 객체 생성
		Thread2 t2 = new Thread2();		// 1-3-1) 스레드 클래스 객체 생성
		
		t1.start();		// 1-3-2) 참조변수.start() 호출 ==> run() 메소드 실행 됨.
		t2.start();     // 1-3-2) 참조변수.start() 호출 ==> run() 메소드 실행 됨.
		
	}

}
