package mypack2;
import java.util.Scanner;
public class Seat{
	int cancleChk(int num, String name){ // 예약을 취소하는 메소드 

		switch(num) 
		{ 
		case 1: 
		while(true) 
		{ 

		for(i=0; i<10; i++) 
		{if(name.equals(s[i][0])) //같은 이름의 예약자가 있으면 예약을 취소시킴 
		{ 
		s[i][0] = "--- "; 
		s[i][1] = "0"; 
		break; 
		} 
		}


		if(i == 10) // 같은 이름의 예약자가 없을 경우 
		{ 
		System.out.println("예약목록이 없습니다. 다시 입력해주세요!"); 
		return 0; 
		} 
		else //같은 이름의 예약자가 있어 취소를 했을 경우 
		{

		System.out.println("예약이 취소되었습니다!");

		break; 

		} 

		} 
		break; 
		}
}
