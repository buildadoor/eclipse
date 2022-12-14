package javaexp.z01_project;

import java.util.Scanner;

public class A01_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner search = new Scanner(System.in);
		System.out.print("검색할 도서를 입력하세요:");
		String book = search.nextLine();
		switch (book) {
		case "하얼빈":
			System.out.println("[소설] 하얼빈 : 김훈 장편소설");
			System.out.println("[어린이(초등)] 하얼빈 의거와 안중근 : (다큐동화로 만나는 한국 근현대사 6)");
			System.out.println("[역사/문화] 그들이 기록한 안중근 하얼빈 의거 : 일본 외무성 소장 「이토 공작 만주 시찰 일건");
			System.out.println("[소설] 하얼빈 리포트 : 소설로 읽는 안중근 이야기 | 유홍종 장편소설");
			break;
		case "아버지의 해방일지":
			System.out.println("[소설] 아버지의 해방일지 : 정지아 장편소설 - 유시민 저자 추천 도서");
			System.out.println("[ebook] 아버지의 해방일지 : 정지아 장편소설");
			break;
		case "불편한 편의점":
			System.out.println("[소설] 불편한 편의점 2 : 김호연 장편소설");
			System.out.println("[소설] 불편한 편의점(40만부 기념 벚꽃 에디션) : 김호연 장편소설");
			System.out.println("[소설] 불편한 편의점(큰글자도서) : 김호연 장편소설 (리더스원)");
			break;
		case "파친코2":
			System.out.println("[소설] 파친코 2 : 이민진 장편소설");
			System.out.println("[문학] パチンコ 下 (파친코 일본어판)");
			System.out.println("[ebook] 파친코 2 : 이민진 장편소설");
			break;
		default:
			System.out.println(book + "에 대한 검색결과가 없습니다.\n" + "검색어의 철자가 정확한지 다시 한번 확인해주세요.\r\n"
					+ "검색어의 단어 수를 줄이거나, 두 단어 이상의 검색어인 경우, 띄어쓰기를 해주세요");
		}

	}

}
