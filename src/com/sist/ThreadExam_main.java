package com.sist;

/*
 * [문제] 숫자(1~100)을 생성하는 스레드 클래스와
 *       영문자(A~Z)를 생성하는 스레드 클래스를 
 *       각각 정의하고, 스레드가 수행되도록 해보세요.
 *       
 *       조건1) 숫자 생성 클래스 : NumberThread
 *             => Thread 라는 클래스를 상속하여 생성.
 *       조건2) 영문자 생성 클래스 : AlphabetThread
 *             => Runnable 인터페이스를 구현하여 생성.
 */

public class ThreadExam_main {

	public static void main(String[] args) {
		
		ThreadExamNumber tn = new ThreadExamNumber();
		ThreadExamAlphabet ta = new ThreadExamAlphabet();
		
		Thread th = new Thread(ta);
		
		tn.start(); th.start();
	}

}
