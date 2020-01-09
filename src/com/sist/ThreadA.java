package com.sist;

/*
 * 멀티스레드와 스레드 이름 지정
 * 	1. 멀티스레드 : 하나의 스레드 클래스를 대상으로
 *               2개 이상의 스레드객체를 생성하는 기법
 *  2. 스레드 이름 지정 : 멀티스레드에서 생성한 스레드 객체에
 *                   이름을 부여하는 과정(참조변수에 이름 붙이기)
 *                   형식) super(name);
 *  - 멀티스레드는 자신의 이름을 가지고 있음.
 *  - 스레드의 이름이 큰 역할을 하지는 않지만,
 *    디버깅 시 어떠한 스레드가 현재 작업하고 있는지를 
 *    조사(확인)할 목적으로 많이 사용됨!
 */

public class ThreadA extends Thread {

	public ThreadA() {	}
	
	public ThreadA(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(this.getName());
		//getName() : 현재 run() 메소드를 실행중인
		//            스레드의 이름을 반환해주는 메소드.
	}

}
