/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2022-11-16 01:46:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.z01_005fhomework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import jspexp.vo.*;
import java.util.*;
import jspexp.a13_database.*;
import jspexp.a13_database.vo.*;

public final class a02_005f221115_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jspexp.a13_database.vo");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("jspexp.a13_database");
    _jspx_imports_packages.add("jspexp.vo");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"/a00_com/a01_common.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*\r\n");
      out.write(" 2022-11-14\r\n");
      out.write("[1단계:개념] 1. jsp를 이용하여 객체형 배열을 처리할려고 한다. 처리하는 순서를 기술하세요.\r\n");
      out.write("- 구조 만들기/ import 처리\r\n");
      out.write("- 리스트로 데이터 넣기\r\n");
      out.write("- 반복문 처리하기 \r\n");
      out.write("[1단계:확인] 2. Computer 클래스에 제조사, 가격, 종류 속성을 선언하고, jsp 화면에 테이블로 리스트를 출력하세요.\r\n");
      out.write("*/\r\n");

List<Computer> clist = new ArrayList<Computer>();
clist.add(new Computer("삼성",1500000,"데스크탑"));
clist.add(new Computer("애플",1800000,"노트북"));

	for(int idx=0;idx<clist.size();idx++){
		Computer c = clist.get(idx);
		log(c.getCompany()+":"+c.getPrice()+":"+c.getType());
	}

      out.write("\r\n");
      out.write("/*\r\n");
      out.write("[1단계:개념] 3. jsp에서 DB처리를 위해 필요한 설정을 기술하세요.\r\n");
      out.write("1. 새 프로젝트 생성 후 경로 설정\r\n");
      out.write("1)  Build Path\r\n");
      out.write("① Build Path > configure build path\r\n");
      out.write("② Classpath > Add External JARs.. 클릭 \r\n");
      out.write("③ connector J. jar 파일 선택\r\n");
      out.write("④ Apply and Close\r\n");
      out.write("2) 'WEB-INF > lib'에 connector J. jar 파일 붙여넣기\r\n");
      out.write("\r\n");
      out.write("2. DB 연동\r\n");
      out.write("※ JDBC\r\n");
      out.write(" 1) low level 코딩 \r\n");
      out.write("   - dbdemo.jsp 생성\r\n");
      out.write("   ① Driver Loading\r\n");
      out.write("   ② MySQL Connection\r\n");
      out.write("   ③ Statement 객체 생성\r\n");
      out.write("   ④ SQL 문 실행하기\r\n");
      out.write("   ⑤ ResultSet 처리하기\r\n");
      out.write("   ⑥ Close\r\n");
      out.write("   ⑦ 결과 출력\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write(" 	1) jdbc드라버를 설정(웹프로그래밍단위)\r\n");
      out.write(" 		\\webaoo\\WEP-INF\\lib\r\n");
      out.write(" 	2) dao를 위한 설정처리(ip,port,sid,계정,비번)\r\n");
      out.write(" 		연결부분확인\r\n");
      out.write(" 	3) dao을 기능 메서드 구현 \r\n");
      out.write(" 	4) jsp에서 해당 dao import, vo import \r\n");
      out.write(" 		\r\n");
      out.write("		\r\n");
      out.write(" 	*/\r\n");
      out.write("/*\r\n");
      out.write(" \r\n");
      out.write("[1단계:확인] 4. dao에 부서정보를 찾아서, jsp로 부서정보를 출력하세요.\r\n");
      out.write("	1) 부서정보 기능메서드 확인\r\n");
      out.write("	2) jsp import 확인\r\n");
      out.write("	3) dao객체 생성 \r\n");
      out.write("	4) 반복문을 통해서 출력화면 \r\n");
      out.write("	5) script(scriplet, expression)을 통해서 table형식으로 출력처리 \r\n");
      out.write("//import jspexp.vo.* 삭제 처리..\r\n");
      out.write("	*/\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write("[1단계:확인] 5. dao에 회원정보리스트 처리 기능메서드를 추가하고 jsp로 회원정보리스트를 출력하세요.\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write("/*\r\n");
      out.write(" \r\n");
      out.write("[1단계:개념] 6. js의 함수의 기본형식을 기술하고 매개변수로 밑면과 높이를 전달하고, 삼각형의 면적으로 리턴값을 alert() 출력되게 처리해보세요.\r\n");
      out.write("1. 함수는 기능 처리를 위한 코드의 집합체라고 할 수 있다.\r\n");
      out.write("2. 기본형식\r\n");
      out.write("   function 함수명(매개변수,...){\r\n");
      out.write("     프로세스 처리\r\n");
      out.write("     \r\n");
      out.write("     return 리턴값;\r\n");
      out.write("*/\r\n");
      out.write("/*\r\n");
      out.write(" \r\n");
      out.write("[1단계:개념] 7. 이벤트와 이벤트핸들러 함수와의 관계를 실제 이벤트 처리 코드를 기준으로 설명하세요.\r\n");
      out.write("1. js에서는 속성으로 on이벤트명=\"이벤트핸들러\"를 통해서\r\n");
      out.write("해당 이벤트가 발생했을 때, 처리할 코드를 특정한 함수를 통해서 정의한 내용을 수행할 수 있다.\r\n");
      out.write("2. 처리 순서\r\n");
      out.write("	1) 이벤트 핸들러 함수 선언 : 이벤트를 통해서 처리할 내용 함수 선언\r\n");
      out.write("	2) 이벤트 속성 선언 및 이벤트 핸들러 함수 호출\r\n");
      out.write("		태그 on이벤트명=\"이벤트 핸들러 함수()\"\r\n");
      out.write("   3) 이벤트 핸들러에 매개변수 전달 \r\n");
      out.write("   	함수에 매개변수를 선언하여 문자열, 숫자 데이터를 전달할 수 있다.\r\n");
      out.write("*/\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write("[1단계:확인] 8. 학생의 이름 정보와 국어,영어,수학점수를 입력 후, 클릭시, 총점과 평균이 출력되게 하세요.\r\n");
      out.write("?\r\n");
      out.write("*/\r\n");
      out.write("function calcu(){\r\n");
      out.write("	var stname = document.querySelector(\"[name=pname]\").value;\r\n");
      out.write("	var kor = document.querySelector(\"[name=kor]\").value;\r\n");
      out.write("	var eng = document.querySelector(\"[name=eng]\").value;\r\n");
      out.write("	var math = document.querySelector(\"[name=math]\").value;\r\n");
      out.write("	//+ 연산자 이외는 자동형변환이 적용되어 Number()을 사용하지 않더라도 연산이 된디.\r\n");
      out.write("	var plus = kor+eng+math;\r\n");
      out.write("	document.querySelector(\"h4\").innerText=pname+\", 총점:\"+plus\r\n");
      out.write("	var avg = (kor+eng+math);\r\n");
      out.write("	document.querySelector(\"h5\").innerText=pname+\", 평균:\"+avg\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write("[1단계:확인] 9. 1~9까지 번호가 있는 3X3테이블을 만들고 해당 td를 클릭시 마다, 클릭한 td만 배경색상과 글자 색상이 변경되게 처리하세요.\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write("function callObj(obj){\r\n");
      out.write("	obj.align=\"center\";\r\n");
      out.write("	obj.style.color=\"blue\";//css속성변경\r\n");
      out.write("	obj.style.background=\"aliceblue\";\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write(" \r\n");
      out.write("[3단계:확인] 10. 좋아요버튼과 싫어요 버튼 만들고, 좋아요 버튼을 누를 때 마다 \r\n");
      out.write("                  하단에 ♥가 증가되고, 싫어요 버튼을 누를 때 마다♡ 증가 되게 처리해보세요 \r\n");
      out.write("*/\r\n");
      out.write("function addlike(obj){\r\n");
      out.write("	document.querySelector(\"#likelist\").innerText+=obj.innerText+\"♥\";\r\n");
      out.write("}\r\n");
      out.write("function addhate(obj){\r\n");
      out.write("	document.querySelector(\"#hatelist\").innerText+=obj.innerText+\"♡\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

A06_PareparedDao dao = new A06_PareparedDao();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>부서정보</h2>\r\n");
      out.write("<table>\r\n");
      out.write("	<tr><th>부서번호</th><th>부서명</th><th>부서위치</th></tr>\r\n");
      out.write("	");
for(Dept d:dao.getDeptList(new Dept("",""))){
      out.write("\r\n");
      out.write("	<tr><th>");
      out.print(d.getDeptno());
      out.write("</th><th>");
      out.print(d.getDname() );
      out.write("</th><th>");
      out.print(d.getLoc() );
      out.write("</th></tr>\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("    ");

    List<Dept> dlist = new ArrayList<Dept>();
    dlist.add(new Dept(00001,"마케팅","천안"));
    dlist.add(new Dept(00002,"재무","부산"));
    dlist.add(new Dept(00003,"인사","울산"));
  
 
 
  	for(int idx=0;idx<dlist.size();idx++){
  		Dept d = dlist.get(idx);
  		log(d.getDeptno()+":"+d.getDname()+":"+d.getLoc());
  	}
    
      out.write("\r\n");
      out.write("   <table width=300px border>\r\n");
      out.write("	<tr><th>부서번호</th><th>부서명</th><th>지역</th></tr>\r\n");
      out.write("	");
for(Dept d:dlist){
      out.write("\r\n");
      out.write("	<tr><td>");
      out.print(d.getDeptno());
      out.write("</td><td>");
      out.print(d.getDname());
      out.write("</td><td>");
      out.print(d.getLoc());
      out.write("</td></tr>\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	 <hr>\r\n");
      out.write("    ");

    List<Customer> culist = new ArrayList<Customer>();
    culist.add(new Customer("이길동",51,"서울"));
    culist.add(new Customer("송길동",41,"대전"));
    culist.add(new Customer("남궁길동",31,"대구"));
 
 
  	for(int idx=0;idx<culist.size();idx++){
  		Customer cu = culist.get(idx);
  		log(cu.getName()+":"+cu.getAge()+":"+cu.getLoc());
  	}
    
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("   <table width=300px border>\r\n");
      out.write("\r\n");
      out.write("	<tr><th>회원명</th><th>나이</th><th>지역</th></tr>\r\n");
      out.write("	");
for(Customer cu:culist){
      out.write("\r\n");
      out.write("	<tr><td>");
      out.print(cu.getName());
      out.write("</td><td>");
      out.print(cu.getAge());
      out.write("</td><td>");
      out.print(cu.getLoc());
      out.write("</td></tr>\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<hr>\r\n");
      out.write("	학생이름:<input type=\"text\" name=\"stname\"/>\r\n");
      out.write("	국어점수:<input type=\"text\" name=\"kor\"/>\r\n");
      out.write("	영어점수:<input type=\"text\" name=\"eng\"/>\r\n");
      out.write("	수학점수:<input type=\"text\" name=\"math\"/>\r\n");
      out.write("	<input type=\"button\" value=\"계산\" onclick=\"calcu()\"/>\r\n");
      out.write("	<h4>총점</h4>\r\n");
      out.write("	<h5>평균</h5>\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("<table width=300px border>\r\n");
      out.write("	<tr><th>제조사</th><th>가격</th><th>종류</th></tr>\r\n");
      out.write("	");
for(Computer c:clist){
      out.write("\r\n");
      out.write("	<tr><td>");
      out.print(c.getCompany());
      out.write("</td>\r\n");
      out.write("	<td>");
      out.print(c.getPrice());
      out.write("</td>\r\n");
      out.write("	<td>");
      out.print(c.getType());
      out.write("</td></tr>\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("표 클릭!\r\n");
      out.write("<table>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td onclick=callObj(this)>1</td><td onclick=callObj(this)>2</td><td onclick=callObj(this)>3</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td onclick=callObj(this)>4</td><td onclick=callObj(this)>5</td><td onclick=callObj(this)>6</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("	<td onclick=callObj(this)>7</td><td onclick=callObj(this)>8</td><td onclick=callObj(this)>9</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("<hr>\r\n");
      out.write("<h3 id=\"likelist\">좋아요</h3>\r\n");
      out.write("<h3 id=\"hatelist\">싫어요</h3>\r\n");
      out.write("	\r\n");
      out.write("<input type=\"button\" onclick=\"addlike(this)\" value=\"좋아요\">\r\n");
      out.write("<input type=\"button\" onclick=\"addhate(this)\" value=\"싫어요\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*\r\n");
      out.write(" \r\n");
      out.write("*/\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
