package com.sist;

/*
 * 프로세스(Process)
 * 	- 현재 CPU에 의해서 처리되는 프로그램
 * 	- 운영체제로부터 메모리를 할당을 받음.
 * 	- 자바에서는 하나의 클래스를 의미함.
 */
/*
 * 	- 무한반복을 가진 프로세스를 실행한경우
 *    CPU를 놓지 않기 때문에 다음 프로세스를
 *    실행할 수가 없게 된다.(ㅜㅜ)
 *  - 이러한 문제점을 개선하기 위해서 Thread
 *    개념이 도입이 되었음.
 */

public class Process_main {

	public static void main(String[] args) {
		
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		
		p1.go(); p2.go();
		
	}

}
