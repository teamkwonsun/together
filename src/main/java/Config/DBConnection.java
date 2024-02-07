package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	//정적메소드
		public static Connection getConnection() {
			
			try {
				InitialContext initContext;
				initContext = new InitialContext();
				Context envContext  = (Context)initContext.lookup("java:/comp/env");
				DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
				Connection conn = ds.getConnection();
				System.out.println("DB연결성공");
				return conn;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("DB연결실패");
			}
			return null;
		}
		public static void close(Connection con, PreparedStatement psmt) {
			try {
				con.close();
				psmt.close();
				System.out.println("DB연결 삭제");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void close(Connection con, PreparedStatement psmt,ResultSet rs) {
			try {
				con.close();
				psmt.close();
				rs.close();
				System.out.println("DB연결 삭제");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void close(Connection con, Statement psmt,ResultSet rs) {
			try {
				con.close();
				psmt.close();
				rs.close();
				System.out.println("DB연결 삭제");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}

