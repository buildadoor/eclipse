/*
 2022-10-11
[1단계:코드] 1. 직책별 최저급여의 사원정보(사원명, 직책명, 급여)를 inline view를 통해서 출력하세요. 

[1단계:개념] 2. 수정의 기본형식과 SUBQUERY(단일열/다중열) 형식을 예제를 통하여 기술하세요.
	1) set부분 subquery 활용
		-한개의 컬럼 set컬럼명 = (결과가 1개인 컬럼 query)
		-두개이상의 컬럼 set (컬럼명..) = (결과가 2개 이상 컬럼 query)
	--ex) emp10 보너스가 null인 데이터를 모두 1000으로 수정처리하세요 
	UPDATE emp10 
	SET comm = 1000
	WHERE comm IS null;
	
	--부서번호가 10인 사원정보의 급여를 부서정보 10인 사원의 최고 급여로 변경처리
	UPDATE emp10 
	SET sal = (
	SELECT max(sal)
	FROM emp10 
	WHERE deptno = 20
	)
[1단계:코드] 3. EMP10의 3/4분기 최고급여를 7521 사원의 급여로 수정하세요.
*/
UPDATE emp10
	SET sal = (
		SELECT max(sal)
		FROM emp10
		WHERE to_char (hiredate,'Q')='3'
	)
		WHERE empno = 7521;
	
SELECT * FROM emp10;
/*
[1단계:코드] 4. emp10 부서별 최저 급여자를 삭제 처리하세요.
*/
DELETE 
FROM emp10 
WHERE (deptno, sal) in(
	SELECT deptno, min(sal)
	FROM EMP10 
	GROUP BY deptno)

SELECT * FROM emp10;
/*

[1단계:개념] 5. DB 서버 접속을 위한 프로젝트(자바프로그램단위) 설정할 내용에 대하여 기술하세요.
	1) database 서버 접속 객체
		연결객체 (Connection), 대화객체 (Statement), 
		결과값처리객체(ResultSet), 자원해제(.close()),
		예외처리 (try{}catch(SQLExpption e){})
	2) 전역변수로 위 핵심 객체를 선언 
		private Connection con;
		private Statement stmt; 
		private ResultSet rs;
	3) 기능별 메서드 선언
		public void setConnection(){} - DB연결을 위한 기본 기능 메서드
		// 각 기능별 메서드 선언
		// 사원정보 조회 (다중행)
		public List<Emp> getEmpList(Emp sch){}
		// 사원정보 조회 (단일행
		public <Emp> getEmp(int empno){}
		// 사원정보 입력
		public List<Emp> getEmpList(Emp insert){}
		// 사원정보 수정
		public List<Emp> getEmpList(Emp update){}
		// 사원정보 삭제
		public List<Emp> getEmpList(int empno){}
		
[1단계:개념] 6. jdbc는 어떤 역할을 하는지 기술하세요. 
	자바프로그램을 DB서버의 client로 만들어, 데이터베이스 서버와 연동하여
	실제 프로그램에서 처리하는 내용으로 조회/등록/수정/삭제 처리를 하는 역할을 한다. 
	
[1단계:개념] 7. 자바의 DB처리 순서를 코드와 함께 기술하세요.
		Class.forName("") : jdbc 드라이버를 메모리에 로딩
		DriverManager : getConnection("접속정보","계정","비번") static메서드로 연결을
			driver ==> 특정한 연결과 mapping 
			Connection 객체를 만들어 준다. 			
 			ex) 전화기를 하면 전화번호 대상과 연결 
			"jdbc:oraclethin:@localhost:1521:xe";
			jdbc:oracle:thin: 드라이버 종류
			@localhost:특정 ip주소 cf)localhost - 현재 pc에 oracle서버가 구축되어 있을 때는
			localhost라는 loopback주소를 사용한다.
			1521: oracle서버의 port
			xe: oracle DB명  
			
[1단계:개념] 8. DB 접속시, 필요한 예외 처리의 내용 처리방법을 기술하세요.
		1) Class.forName() : 컴파일예외 처리		
		2) DriverManager.getConnection(info, "scott","tiger");
			연결정보 SQLException : 컴파일 에외 처리, throws로 예외를 위임 처리
			
[1단계:실습] 9. javaexp2프로젝트를 만들어, javaexp2.a01_database 패키지와 A01_Dao.java를 만들어 연결처리하세요. 
                처리한 내용캡쳐하시고, java 소스 코드를 text를 붙여주세요.
   */