package mypack2;
import java.util.*;
public class Reserve extends SeatType{
	int run() {
		int num;
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> " );
			num = input.nextInt();
			switch(num)
			{
			case 1:
			book(s,a,b);
			break;
			case 2:
			cheak(s,a,b);
			break;
			case 3:
			cancel(s,a,b);
			break;
			case 4:
			end();
			break;
			defalt:
				
			System.out.println("잘못입력하셨습니다.");
			break;
			}
		}
	}
}
