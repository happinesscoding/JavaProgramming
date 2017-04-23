/*
 * 시간 측정 코드
 */

public class Chronometry {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();		// 1 Second = 1000 MilliSecond
		long startTime = System.nanoTime();				// 1 Second = 10^9 nanoSecond
		
		// 프로그램 본문
		for(int i=0; i<1000; i++) {
			int a = 0;
			a+=1;
			System.out.print(a);
		}
		
		long end = System.currentTimeMillis();
		long endTime = System.nanoTime();
		System.out.println("\n실행시간 : " + (end-start)/1000.0);				// second 단위로 고치기 위해 10의 3승(1000)으로 나눔
		System.out.println("실행시간 : " + (endTime-startTime)/1000000000.0);	// second 단위로 고치기 위해 10의 9승으로 나눔 
	}
}
