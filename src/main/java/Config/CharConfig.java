package Config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharConfig implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		//요청 데이터 한글 인코딩 설정
		request.setCharacterEncoding("utf-8");
		//응답 데이터 한글 인코딩 설정
		response.setContentType("text/html; charset=utf-8");
		
		//String username = request.getParameter("username");
		//System.out.println("username은 = " + username);
		
		//출력스트림 확인
		//PrintWriter out = response.getWriter();
		//out.print("곧점심시간");
		
		//다음 필터나 응답처리 호출 -> 이어지는 필터가 있으면 이어지고, 아니면 서블릿으로 이동
		chain.doFilter(request, response);
	}
	
}
