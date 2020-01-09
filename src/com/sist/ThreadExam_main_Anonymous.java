package com.sist;

/*
 * 무명클래스(Anonymous Class)를 이용한 스페드 생성
 * 	- 코드의 집주오하로 가독성이 높아진다.
 * 	- 별도의 상속 과정이 필요가 없어진다.
 */

public class ThreadExam_main_Anonymous {

	public static void main(String[] args) {
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 1; i < 101; i++) {
					System.out.println(i);
				}
			}
		}.start();
		
		new Thread(new Runnable() {		//Thread 생성자의 인자 안에 Runnable 인터페이스 구현
		
					@Override
					public void run() {
						for(int i = 'A'; i < 'Z'; i++) {
							System.out.println((char)i);
						}
						
					}
		}).start();		// Thread(target); 생성자를 이용하였는데, 
		                //아예 Runnable도 어나니머스로 재정의 하여 그것을 바로 인자로 넣어준 것!
		
		 
		
		
	}
}
