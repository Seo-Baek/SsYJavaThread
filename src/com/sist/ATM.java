package com.sist;

/*
 * [ATM 클래스 설계서] 
 * 	- 입금과 출금의 은행거래가 가능한 ATM 클래스 설계.
 * 	- 계좌잔액 : private int balance
 * 	- 생성자 : 계좌잔액(balance) 초기화.
 * 	- deposit() : 외부클래스에서 입금하는 메소드.
 *    예) balance = balance + money; // 잔액에 입금액을 더함.
 *    출력문 : 00,000원을 입금하여 00,000원 남음.
 *  - withdraw() : 외부클래스에서 출금하는 메소드.
 *    예) balance = balance - money; // 잔액에 출금액을 차감.
 *    출력문 : 00,000원을 출금하여 00,000원 남음.
 *    (단, balance < money 인 경우 "잔액이 부족합니다." 메세지 출력)
 */
/*
 * Synchronized 키워드
 * 	- 스레드 동기화와 관련된 키워드.
 * 	- 멀티스레드에 의해서 공유된 메소드나 클래스를 대쇼ㅏㅇ으로
 *    임계 영역(Critical Section)을 설정.
 *  - 임계 영역으로 설정된 메소드는 
 *    가장 먼저 도착한 스레드가 완전히 종료할 때까지 나머지 스레드는 대기하도록 명령.
 *  - 공유되는 자원은 대부분 static 키워드를 가진 객체들을 사용함. 
 */

public class ATM {
	
	private int balance;		// 계좌잔액
	
	public ATM() {    }			// 기본 생성자
	
	public ATM(int balance) {	// 인자 생성자
		this.balance = balance;
	}
	
	//입금하는 메소드
	public synchronized void deposit(int money) {
		balance += money;	
		System.out.println(Thread.currentThread().getName()  + 
				" 님이 " + money + "원을 입급하여" + balance + "원이 남았습니다.");
	}
	
	public synchronized void withdraw(int money) {
		if(balance < money) { // 현재 잔액보다 출금액이 많은 경우
			System.out.println(Thread.currentThread().getName() +" 님의 계좌의 잔액이 부족합니다.");
			return;		//현재 실행되는 메소드를 종료하는 명령어.
		}
		balance -= money;
		System.out.println(Thread.currentThread().getName() +
				" 님이 "  + money + "원을 출금하여" + balance + "원이 남았습니다.");
	}
}
