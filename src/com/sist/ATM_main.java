package com.sist;

public class ATM_main {

	public static void main(String[] args) {
		
		
		ATM atm = new ATM(0);
		
		//User 클래스를 대상으로 멀티스레드로 객체 생성
		ATM_User user1 = new ATM_User(atm,"홍길동");
		ATM_User user2 = new ATM_User(atm,"이순신");
		ATM_User user3 = new ATM_User(atm,"유관순");
		ATM_User user4 = new ATM_User(atm,"김유신");
		ATM_User user5 = new ATM_User(atm,"김연아");
		
		user1.start(); user2.start();
		user3.start(); user4.start(); user5.start();
		
	}

}
