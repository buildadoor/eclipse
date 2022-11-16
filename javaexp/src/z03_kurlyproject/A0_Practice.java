package z03_kurlyproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class A0_Practice {
	private PreparedStatement pstmt;
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	static Scanner sc = new Scanner(System.in);
	public static void SystemMenu() {
		Join Kurlyjoin = new Join();
		Brandnew newproduct = new Brandnew();
		while (true) {
			System.out.println("┌────────────────Kurly───────────────┐");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("9. 종료");
			System.out.println("└────────────────────────────────────┘");
			System.out.print("원하시는 페이지 번호를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				Kurlyjoin.JoinKurly();
				break;
			case 2:
				newproduct.product();
//				if(newproduct.scananswer=="O") { 
//					newproduct.getProductList();
//				} else  {
//					System.out.println("이전 페이지로 이동합니다.");
//					
//				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴를 다시 선택해주세요.");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A0_Practice dao = new A0_Practice();
		SystemMenu();
	}

}
