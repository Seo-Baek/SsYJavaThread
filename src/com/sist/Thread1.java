package com.sist;

/*
 * 스레드(Thread)?
 * 	- Process를 작은 단위로 쪼개어 놓은 작업 단위.
 *    => 실제 프로그램이 수행되는 작업의 최소 단위.
 *  - 스레드는 병행 처리를 지원한다(멀티태스킹).
 *  - 응용분야 : 게임, 채팅 등
 */
/*
 * [스레드 클래스 작성 방법 - 2가지]
 * 	1. Thread라는 클래스를 상속(extends).
 *     1) Thread라는 클래스를 상속 받는다.
 *     2) run() 메소드 재정의 - 스레드 구현
 *     3-1) 스레드 클래스 객체 생성
 *     3-2) 참조변수.start() 호출 ==> run() 메소드 실행 됨.
 *      
 * 	2. Runnable라는 인터페이스를 구현(implements).
 */

public class Thread1 extends Thread { // 1-1) Thread라는 클래스를 상속

	@Override
	public void run() {	// 1-2) run() 메소드 재정의 - 스레드 구현
		
		int i = 1;
		while(true) {
			System.out.println("i >>> " + i);
			i++;
		}
	}
	
}
