package mypack2;
import java.util.Scanner;
public class SeatType{
	void check(String[][] s, String[][] a, String[][] b){ // 조회를 할 때 사용하는 메소드 
		System.out.print("S>> "); 
		for(int i=0; i<10; i++) //s석의 좌석 현황을 출력

		System.out.print(s[i][0]);

		System.out.println();



		System.out.print("A>> "); 
		for(int i=0; i<15; i++) //a석의 좌석 현황을 출력

		System.out.print(a[i][0]);

		System.out.println();



		System.out.print("B>> "); 
		for(int i=0; i<20; i++) //b석의 좌석 현황을 출력

		System.out.print(b[i][0]);

		System.out.println();



		System.out.println("<<<조회를 완료하였습니다.>>>"); 
		}
}
