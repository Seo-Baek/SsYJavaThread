package com.sist;

public class Runnable_main {

	public static void main(String[] args) {
		
		Runnable1 r1 = new Runnable1();		// 3) 스레드 클래스(자식클래스) 객체 생성
		Runnable2 r2 = new Runnable2();		// 3) 스레드 클래스(자식클래스) 객체 생성
		
		Thread th1 = new Thread(r1);		// 4) Thread라는 클래스 객체 생성.(파라미터 target에 자식 참조변수 삽입)
		Thread th2 = new Thread(r2);		// 4) Thread라는 클래스 객체 생성.
		
		 // 5) Thread 클래스의 참조변수.start() 메소드 호출
		th1.start();
		th2.start();
		
		
	}

}
