package z_etc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class next_nextInt_nextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("번호 입력: ");
		int num = sc.nextInt();
		
		System.out.print("이름 입력: ");
		String str = sc.next();
		String tmp = sc.nextLine();		// [Enter] 처리 (미리 먹음)
		
		System.out.print("주소 입력: ");
		String str2= sc.nextLine();
		
		System.out.println("번호: " + num);
		System.out.println("이름: " + str);
		System.out.println("주소: " + str2);
		
		// next()는 단어, nextInt()는 숫자. [Space]와 [Enter] 안먹음
		// nextLine()은 문장. [Space]와 [Enter] 먹음

		

	}
	

	
}
