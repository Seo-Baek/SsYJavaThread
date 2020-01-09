package com.sist;

public class ATM_User extends Thread {

	ATM atm;	// 객체 간 협업 User클래스가 ATM을 객체로 가지고 있음!
	
	public ATM_User() {	 }
	
	public ATM_User(ATM atm, String name) {
		super(name);
		this.atm = atm;
	}
	
	@Override
	public void run() {
		
		this.atm.deposit(20000);	// 입금메소드 호출
		this.atm.withdraw(30000);	// 출금메소드 호출
	}
	
}
