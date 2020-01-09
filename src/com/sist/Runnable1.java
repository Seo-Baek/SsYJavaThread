package com.sist;

/*
 * 	2. Runnable 인터페이스 구현(implements).
 * 		1) Runnable 인터페이스 구현(implements).
 * 		2) run() 메소드 재정의 ==> 강제성 (인터페이스니까!)
 * 		3) 스레드 클래스(자식클래스) 객체 생성
 * 		4) Thread라는 클래스 객체 생성.
 * 			=> Thread 클래스의 생성자의 인자에 
 *             자식클래스의 참조변수를 사용.
 *      5) Thread 클래스의 참조변수.start() 메소드 호출
 */

// 1) Runnable 인터페이스 구현(implements).
public class Runnable1 implements Runnable { //2) run() 메소드 재정의 ==> 강제성
	
	@Override
	public void run() {	// 1-2) run() 메소드 재정의 - 스레드 구현
		
		int i = 1;
		while(true) {
			System.out.println("i >>> " + i);
			i++;
		}
	}
	
}
