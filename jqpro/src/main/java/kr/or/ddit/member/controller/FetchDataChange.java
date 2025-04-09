package kr.or.ddit.member.controller;

import java.io.BufferedReader;

import jakarta.servlet.http.HttpServletRequest;

public class FetchDataChange {
	public static String dataChange(HttpServletRequest request) {
		String line = null;
		StringBuffer strbuf = new StringBuffer();
		// request로 전송받은 데이터를 읽는 객체
		BufferedReader reader = null;
		try {
			reader = request.getReader();
			
			// 데이터 수신 반복
			while(true) {
				line = reader.readLine();
				if(line == null) break;
				strbuf.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 수신 받은 데이터를 문자열로 변환
		String reqData = strbuf.toString();
		return reqData;
	}
}
