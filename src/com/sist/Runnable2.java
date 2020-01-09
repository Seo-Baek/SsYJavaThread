package com.sist;

//1) Runnable 인터페이스 구현(implements).
public class Runnable2 implements Runnable {	//2) run() 메소드 재정의 ==> 강제성
	
	@Override
	public void run() {
		
		int j = 1;
		while(true) {
			System.out.println("j >>> " + j);
			j++;
		}
	}
	
}
