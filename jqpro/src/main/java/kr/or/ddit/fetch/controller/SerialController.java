package kr.or.ddit.fetch.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.fetch.vo.SerialVo;

import java.io.BufferedReader;
import java.io.IOException;

import com.google.gson.Gson;

@WebServlet("/Serial.do")
public class SerialController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 직렬화 된 데이터 수신
		String line = null;
		StringBuffer strbuf = new StringBuffer();
		BufferedReader reader = request.getReader();
		
		while(true) {
			line = reader.readLine();
			
			if(line == null) break;
			
			strbuf.append(line);
		}
		
		String reqData = strbuf.toString();
		
		// 역직렬화 - 자바 객체 생성 Json데이터로부터 내용을 Vo에 담음
		Gson gson = new Gson();
		// vo.setId("a001") vo.setName("가나다") ... 을 수행하는 메소드임 
		SerialVo vo = gson.fromJson(reqData, SerialVo.class);
		// (가정) Service 객체생성
		// (가정) Service 메소드(Insert) 호출 - 결과값 받기

		// request에 저장
		request.setAttribute("userData", vo);
		
		// forward하여 view 페이지로 이동
		request.getRequestDispatcher("/0408_fetch/serial.jsp").forward(request, response);
	}

}
