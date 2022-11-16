package javaexp.a12_io;

import java.io.IOException;
import java.io.InputStream;

public class A04_StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) 위 형식으로 byte[]에 사용할 id를 입력받아서 
					// new String(byte[])를 이용하여 "himan"인 경우와 비교하여 나타내세요
		/*
		 #Stream 데이터 처리 순서
		 1. 입력을 위한 InputStream 객체 생성 및 java의 콘솔창 입력을
		 	위한 객체 System.in 할당 받는다.
		 2. 문자열을 입력 받기 위해서 byte[]선언 . .
		 3. InputStream의 read(byte[]) 통해서 데이터를 입력처리
		 	- IO예외 처리. .
		 4. id = new String(byte[])를 통해서 입력한 문자열을 String에 할당
		 5. regMember = "himan"과 문자열 비교
		 	if(id.equals("himan")){
		 		등록된 아이디가 있습니다.
		 	}else{
		 		아이디를 등록하세요. 
		 	}
		 */
		//System.out.println("13:"+(char)13);
	//	System.out.println("10:"+(char)10);
		//입력 후 enter를 처리해서 2개정도는 13,10입력된다.
	//	System.out.println("10:"+(char)0);
		
		//1. 입력하는 InputStream 객체 할당
		InputStream is =System.in;
		//2.입력하는 id할당할 byte[]배열 선언
		byte[] inArr = new byte[8];
		//3.입력 처리 메서드 read(byte[])호출
		System.out.print("등록할 아이디:");
		try {
			//위 선언한 배열의 크기만큼.리턴
			//{'A','B','C','',''}
			is.read(inArr);
			for(byte b:inArr) {
				System.out.println((int)b+":"+(char)b);
			}
		
			
			String inputId = new String(inArr);//byte[]==>char[]==>String
			System.out.println("입력한 id"+inputId);
			String srt = "himan   ";//공백이 포함된 문자열이기에 himan과 동일 X (byte8글자쓰면 뒤에 공백)
			if(inputId.equals("himan")) {
				System.out.println("등록된 아이디가 있습니다.");
			}else {
				System.out.println("등록가능한 아이디입니다.");
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		/*
		InputStream is = System.in;
		byte [] id = new byte[5];
	//	new String (byte[]) id = new String (byte[5]);;
		System.out.print("입력할 문자열:");
		try {
			int n = is.read(id);
			System.out.println("문자의 갯수"+n);
			System.out.println("입력한 문자");
			for(byte b : id) {
			System.out.print((char)b);
		}
		System.out.println();
		is.close(); 
		}catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

}
