package javaexp.z01_homework;

public class A09_0908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2022-09-08
		 [1단계:개념] 1. 메서드의 기본 구성요소들의 특징을 기본예제를 통해 기술하세요.
		 - 리턴 타입/실제 리턴값
		 메서드는 리턴막에 return 처리 하여야함
		  -매개변수 처리
		 이 객체를 호출하는 외부 클래스 객체나 main()에서 데이터를 넘겨서
		 처리할 때, 필요
		 -{}(중괄호블럭안)에 처리할 프로세스 처리
		 [1단계:개념] 2. 생성자를 통한 필드값 저장과 메서드를 통한 필드값 저장의 차이점을 예제를 통해서 기술하세요.
		 생성자는 주로 초기값을 설정한다 (객체가 생성될때)
		 메서드는 변경되는 필드값을 처리할때 활용된다.
		 [1단계:코드] 3. Counter 클래스를 만들고, 생성자를 통해 시작, 마지막변수를 입력하고,  메서드를 통해서 해담 범위 내용 출력하고, 누적합을 리턴 처리하게 하세요.

		 ****?????
		 class Counter {      
		 int cnt;
		 String pnames;
		 String[] buyPr;
		 int buyIdx;
		 Counter(){
		 this.pnames="";
		             
		 [1단계:코드] 4. Car 클래스의 필드 차종,색상,현재속도를 선언하고, 이 중 생성자를 통한 초기값 설정과 메서드를 통한 설정을 분리하여
		              생성자, 메서드(속도증가,속도감소,현재속도확인)를 구현하여 처리하세요.
		              
		 [1단계:코드] 5. 1차원 배열로 회원의 이름 5명을 선언하고 할당 출력하세요
		               2차원 배열로 위 회원이름에 추가하여 나이와 사는 곳을 만들어 할당하고 출력하세요
		          String [][] member = { 
		                         {"황예지","23살","서울"},
		                         {"최지수","23살","대전"},
		                         {"신류진","22살","천안"},
		                         {"이채령","22살","대구"},
		                         {"신유나","19살","부산"}
		             };
		    System.out.println("#잇지#");
		    for(int idx=0;idx<member.length;idx++) {
		    System.out.print(idx+1+"번 멤버: ");
		    for (int jdx=0; jdx<member[idx].length;jdx++) {
		    System.out.print(member[idx][jdx]+" ");
		    }
		    System.out.println();
		    }
		    }
		    }

		 [1단계:개념] 6. 패키지란 무엇이면, 외부패키지의 클래스를 객체로 사용할 때 전제조건과 방법 2가지를 기술하세요.
		  패키지란 클래스를 기능별로 묶어서 그룹 이름을 붙여 놓은 것.
		  1) 파일들을 관리하기 위해 사용하는 디렉토리와 비슷한 개념이다.
		  2) 패키지의 물리적 형태는 파일 시스템의 폴드와 같다.
		  외부패키지의 클래스를 객체로 사용할 때 전제조건은 
		  public이라는 접근 제어자가 선언되어있을때 가능함. 
		 패키지명이 포함된 전체 클래스 이름으로 
		  사용하고, import문으로 패키지를 지정하고 사용한다. 
		  1. 패키지명.클래스명: javaexp.a06_object.A01_Person p01 = new javaexp.a06_object.A01_Person();
		 2. import 클래스명: A01_Man m01 = new A01_Man(); // 단축키는 ctrl+shift+o
		           
		          
		  *
		  */  
	}

}
