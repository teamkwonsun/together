package util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	
	//경고창 출력후 이전 페이지로 이동.
	public static void back(String msg, HttpServletResponse res) {
		//자스에 history.back(); 이전페이지로 가는 메서드.
		try {
			PrintWriter out = res.getWriter();
			out.print("<script>");
			out.print("alert('" +msg +"');");
			out.print("history.vack();");
			out.print("</script>");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//경고창 출력 후 지저된 경로로  페이지 이동
	public static void alertMsg(String msg,String url, HttpServletResponse res) {
		PrintWriter out;
		try {
			out = res.getWriter();
			out.print("<script>");
			out.print("alert('" +msg +"');");
			out.print("location.href='"+url +"';");
			out.print("</script>");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
