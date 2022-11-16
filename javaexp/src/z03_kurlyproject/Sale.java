package z03_kurlyproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javaexp.a13_database.DB;
import z03_kurlyproject.vo.Product;

public class Sale {
	private PreparedStatement pstmt;
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	public static String scananswer;

	public List<Product> getProductList() {
		List<Product> plist = new ArrayList<Product>();
		String sql = "SELECT * FROM product WHERE discount >0 "
				+ "ORDER BY discount desc";
				//할인이 들어간 상품만 나열
		try {
			con = DB.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				
				System.out.println("┌──────────────────알뜰상품조회────────────────┐");
				System.out.println("상품번호: " + rs.getString("isbn"));
				System.out.println("상품분류: " + rs.getString("fication"));
				System.out.println("품   명: " + rs.getString("productname"));
				System.out.println("상품가격: " + rs.getInt("price"));
				System.out.println("상품설명: \n" + rs.getString("information"));
				System.out.println("제조회사: " + rs.getString("pompany"));
				System.out.println("등록날짜: " + rs.getString("registerdate"));
				System.out.println("할인율 : " + rs.getDouble("discount") + "%");
				System.out.println("└────────────────────────────────────────────┘");
			}

		} catch (SQLException e) {
			System.out.println("DB에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반에러:" + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}

		return plist;
	}

	public void product() {
		// TODO Auto-generated method stub
		Sale dao = new Sale();
		Scanner sc = new Scanner(System.in);
		System.out.print("알뜰 상품을 조회하시려면 엔터를 입력하세요");
		scananswer = sc.nextLine();
		if (scananswer == "") {
			getProductList();
			System.out.println("조회되었습니다. 이전 페이지로 이동합니다.");
		} else {
			System.out.println("이전 페이지로 이동합니다.");
		}

	}
}
