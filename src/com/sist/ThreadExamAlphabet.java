package com.sist;

public class ThreadExamAlphabet implements Runnable {

	@Override
	public void run() {
		
		for(int i = 'A'; i < 'Z'; i++) {
			System.out.println((char)i);
		}
		
	}
}
